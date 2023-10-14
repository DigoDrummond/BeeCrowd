import java.util.*;

public class Parenthesis_Balance_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        int cont1 = 0;
        int cont2 = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ')') {
                cont1++;
            }
            if (str.charAt(i) == '(') {
                cont2++;
            }
        }
        if (cont1 == cont2)
            System.out.println("correct");
        else
            System.out.println("incorrect");

        sc.close();
    }

}