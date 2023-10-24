import java.util.Scanner;

/*
2
5
2 3 4 5 1
5
2 1 4 5 3


*/ 
public class Gloud_Computing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while (i <= n) {
            int nums = sc.nextInt();
            int[] array = new int[nums];
            for (int j = 0; j < nums; j++) {
                array[j] = sc.nextInt();
            }
            System.out.println(selectionSort(array, nums));
            i++;
        }

        sc.close();
    }
    public static int selectionSort(int[] array, int n){
        int count = 0;
        for (int i = 0; i < (n - 1); i++) {
            int menor = i;
            for (int j = (i + 1); j < n; j++){
               if (array[menor] > array[j]){
                  menor = j;
               }
            }
            if(i != menor){
                count++;
            }
            swap(array,menor, i);
         }
        return count;
    }
    public static void swap(int[] array,int menor, int i){
        int temp = array[menor];
        array[menor] = array[i];
        array[i] = temp;
    }
}
