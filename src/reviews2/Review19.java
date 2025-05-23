package reviews2;

public class Review19 {
    public static void main(String[] args) {
        int num = 10;
        int factorial = 1;
        int i = 1;
        while (i < num) {
            factorial = factorial * i;
            i = i + 1;
        }
        System.out.println("結果" + factorial);
    }
}
