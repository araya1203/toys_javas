import java.util.Scanner;

public class MaxMins {

    public static int getMin(int first, int second) {
        return Math.min(first, second);
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        try {

            int first = 0;
            int second = 0;
            first = myObj.nextInt();
            second = myObj.nextInt();

            int min = getMin(first, second);

            System.out.println(min);

        } catch (Exception e) {

        }
        // return 0;

    }

}
