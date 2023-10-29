import java.util.Arrays;
import java.util.Scanner;

public class GeneratingFast_SortedPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String str = sc.next();
            char[] array = str.toCharArray();
            Arrays.sort(array); // Ordena o array de caracteres
            permute(array,0);
        }
        System.out.println();
        sc.close();
    }

    public static void print(char[] array) {
        for (char c : array) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void permute(char[] array, int n) {
        if (n == array.length - 1) {
            print(array);
        } else {
            for (int i = n; i < array.length; i++) {
                if (i == n || array[i] != array[n]) {
                    swap(array, n, i);
                    permute(array, n + 1);
                }
            }
            char firstElement = array[n];
            for (int i = n; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = firstElement;
        }
    }

    public static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
