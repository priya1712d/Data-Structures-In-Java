package practice;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FoodPacketDistribution {


        public static void main(String[] args){
            int[] arr = {8, 7, 1, 5, 5, 10, 10, 1, 5, 3};
//            System.out.println(solve(arr, 17));
        }

        static long te, n, b;
        static long[] a = new long[100005];
        public static boolean check(long p) {
            long c = 0;
            for (int i = 0; i < n; i++)
                c += (a[i] / p);
            return c >= b;
        }
        public int solve(int[] A, int B) {
            n = A.length;
            long mn = 1000000000, sm = 0;
            for (int i = 0; i < n; i++) {
                a[i] = (long) A[i];
                sm += a[i];
                mn = Math.min(mn, a[i]);
            }
            b = B;
            if (sm < b)
                return 0;
            long l = 1, h = mn, m;
            while (h - l > 1) {
                m = (l + h) / 2;
                if (check(m))
                    l = m;
                else
                    h = m;
            }
            if (check(h))
                return (int) h;
            else
                return (int) l;
        }

        public static double calProportion(int pop, int total){
            return new BigDecimal(pop).divide(new BigDecimal(total), 2, RoundingMode.CEILING).doubleValue();
        }
    }

