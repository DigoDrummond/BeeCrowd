import java.util.*;

public class Diamonds_and_Sands {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        while (input > 0) {
            String str = sc.nextLine();
            int n = str.length();
            int count = 0;
            int sign = 0;
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == '<')
                    sign++;
                if (str.charAt(i) == '>' && sign > 0) {
                    count++;
                    sign--;
                }
                System.out.println(count);
                input--;
            }
            sc.close();

        }
    }
}
