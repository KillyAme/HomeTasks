package homework4;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Числа от 1 до 100 делящиеся на 5 ");
        int i = 0;
        do {
            i++;
            if (i % 5 == 0) {
                System.out.println(i);
            }
        } while (i < 100);
    }
}
