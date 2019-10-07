package homework3;

public class Factorial {
    public static void main(String[] args) {
        int k = 1;
        int n = (int) getRandomValue(15);
        System.out.print(n + "! = ");
        for (int i = 1; i <= n; i++) {
            k = k * i;
        }
        System.out.println(k);
    }

    public static double getRandomValue(int a) {
        return Math.random() * a;
    }
}
