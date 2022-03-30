package project1;

import java.util.List;

class project1 {

    public static String minValue(int a[]) {
        int n = a.length;
        int b[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == a[i]) {
                    b[j] = 1;
                }
            }
        }
        int c = 0;
        for (int i = 0; i < 10; i++) {
            if (b[i] == 1) {
                c *= 10;
                c += i;
            }
        }
        if (b[0] == 1) {
            c *= 10;
        }
        String d = Integer.toString(c);
        return d;
    }

    public static void main(String args[]) {
        int a[] = {1, 3, 1, 0, 5, 5, 6};
        System.out.println(minValue(a));
    }
}