package section04;

class DataProcessing {
    public static void main(String[] args) {
        int x, y;
        x = 5;
        y = 2 * x;

        System.out.println(x);
        System.out.println(y);

        System.out.println("========================================");

        int i;
        double d;
        i = 5;
        d = 2 * x;

        System.out.println(i);
        System.out.println(d);

        System.out.println("========================================");

        double area, upperBase, lowerBase, height;

        upperBase = 6.0;
        lowerBase = 8.0;
        height = 5.0;
        area = (upperBase + lowerBase) / 2.0 * height;
        System.out.println(area);

        System.out.println("========================================");

        int a, b;
        double resultado;

        a = 5;
        b = 2;
        resultado = (double) a / b;
        System.out.println(resultado);

        System.out.println("========================================");

        double num1;
        int num2;

        num1 = 5.0;
        num2 = (int) num1;
        System.out.println(num2);
    }
}
