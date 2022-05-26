package com.java;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class HMACAuth {

    static String BASEURL = "http://deletion-st.deliveryhero.com/api/v1";


    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException, ParseException, IOException, InterruptedException, URISyntaxException {

        String str = hmacAuth("HmacSHA256",
                "payment_transaction_reconciliation",
                "0dxhAqvkeqo6ecYp02ZrrspZNc7PW6ufzv74c0ycVFg=");


    }

    public static String hmacAuth(String algorithm, String data, String key)
            throws NoSuchAlgorithmException, InvalidKeyException, IOException, URISyntaxException {

        final Map<String, String> req_options = new HashMap<>();

        String reqID = "23770";

        String output = "{\"status\": \"fulfilled\",\"comment\": \"Whoops\",\"performed_action\": \"delete\" }";

        StringEntity entity = new StringEntity(output);
        req_options.put("method", "GET");
//        req_options.put("method", "POST");
        req_options.put("path", "/api/v1/request");
//        req_options.put("path", "/api/v1/request/"+reqID+"/status");

        Date date = new Date(System.currentTimeMillis());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));

        byte[] decodedBytes = Base64.getDecoder().decode(key);

        SecretKeySpec secretKeySpec = new SecretKeySpec(decodedBytes, algorithm);
        Mac mac = Mac.getInstance(algorithm);
        mac.init(secretKeySpec);
        mac.update(req_options.get("method").getBytes(StandardCharsets.UTF_8));
        mac.update(req_options.get("path").getBytes(StandardCharsets.UTF_8));
        mac.update(sdf.format(date).getBytes(StandardCharsets.UTF_8));
//        mac.update(output.getBytes(StandardCharsets.UTF_8));
        String appnd = data + ":" + Base64.getEncoder().encodeToString(mac.doFinal());

        CloseableHttpClient httpclient = HttpClients.createDefault();

        try {

            HttpUriRequest httpget = RequestBuilder.get()
                    .setUri(new URI(BASEURL + "/request"))
//                    .addHeader("Content-Type", "application/json")
                    .addHeader("Date", sdf.format(date))
                    .addHeader("Authorization", "HMAC " +Base64.getEncoder().encodeToString(appnd.getBytes(StandardCharsets.UTF_8)))
//                    .setEntity(entity)
                    .build();

            CloseableHttpResponse response = null;
            try {
                 response = httpclient.execute(httpget);
                System.out.println(EntityUtils.toString(response.getEntity()));
            } finally {
                response.close();
            }
        } finally {
            httpclient.close();
        }

        return appnd;
    }

    public static void getBDData(String appnd) throws URISyntaxException, IOException {
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpUriRequest httpget = RequestBuilder.get()
                    .setUri(new URI(BASEURL + "/request"))
                    .addHeader("Date", sdf.format(date))
                    .addHeader("Authorization", "HMAC " + Base64.getEncoder().encodeToString(appnd.getBytes(StandardCharsets.UTF_8)))
                    .build();

            CloseableHttpResponse response = httpclient.execute(httpget);
            try {
                System.out.println(EntityUtils.toString(response.getEntity()));
            } finally {
                response.close();
            }
        } finally {
            httpclient.close();
        }

    }
}

