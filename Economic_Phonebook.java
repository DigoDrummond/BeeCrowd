import java.util.Scanner;

public class Economic_Phonebook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            if (sc.hasNextInt()) {
                int n = sc.nextInt();
                sc.nextLine();
                String[] numbers = new String[n];

                for(int i=0;i<n;i++){
                    numbers[i] = sc.nextLine();
                }
                int count = 0;
                for (int j = 1; j < n; j++) {
                    for (int k = 0; k < Math.min(numbers[j].length(), numbers[j - 1].length()); k++) {
                        if (numbers[j].charAt(k) == numbers[j - 1].charAt(k)) {
                            count++;
                        }
                    }
                }
                 System.out.println(count);
            }
        }
         sc.close();
    }
}
