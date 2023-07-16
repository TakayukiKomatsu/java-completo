package section04;

import java.util.Locale;

class DataOutput {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Hello World!");

        int y = 32;
        System.out.println(y);

        double x = 10.35784;
        System.out.printf("%.2f\n", x);
    }
}
