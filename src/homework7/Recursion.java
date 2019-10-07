package homework7;

public class Recursion {
    static void recurs(int a, int b) {
        if (a == b) {
            System.out.println(a + " и " + b + " равны");
        }
        if (a < b) {
            System.out.println(a++);
        }

    }
}
