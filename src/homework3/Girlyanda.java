package homework3;

public class Girlyanda {
    public static void main(String[] args) {
        double d = Math.random() * 322325545;
        int a = (int) d;
        int b = 1;
        System.out.println("Начальное состояние " + Integer.toBinaryString(a));
        //Mercanie(a);
        //BegushajaStroka(a);
        PervayaLampochka(a, b);
    }

    public static void PervayaLampochka(int a, int b) {
        b = a & b;
        if (b == 1) {
            System.out.println("Первая лампочка включена");
        } else {
            System.out.println("Первая лампочка не включена");
        }
    }

    public static void BegushajaStroka(int a) {
        for (int i = 0; i < 5; i++) {
            a = a >> 1;
            System.out.println(Integer.toBinaryString(a));
        }
    }

    public static void Mercanie(int a) {
        for (int i = 0; i < 5; i++) {
            a = ~a;
            System.out.println(Integer.toBinaryString(a));
        }
    }
}

