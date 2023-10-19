import java.util.*;

public class Sort_by_Length {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        int i=0;
        while(i<=n){
            String input = sc.nextLine();
            String[] words = input.split(" ");
            int size = words.length;
            sort(words,size);
            for(int j=size-1;j>=0;j--){
                System.out.print(words[j] + " ");
            }
            System.out.println("\n");
            i++;
        }

        sc.close();
    }
    public static void sort(String[] str, int n){
       
            for(int i=1;i<n;i++){
                String temp = str[i];
                int j = i-1;
                while(j>=0 && temp.length() <= str[j].length()){
                    str[j+1] = str[j];
                    j--;
                }
                str[j+1] = temp;
            }
       
    }
}
