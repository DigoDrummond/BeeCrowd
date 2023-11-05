import java.util.*;

public class Subsequencias {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String[] teste = new String[n];

        for (int i = 0; i < n; i++) {
            teste[i] = sc.nextLine();
        }

        int testes = sc.nextInt();
        sc.nextLine();
        String[] sequencias = new String[testes];

        for (int i = 0; i < testes; i++) {
            sequencias[i] = sc.nextLine();
        }

        for (String sequencia : sequencias) {
            for (String test : teste) {
                if (isSubsequence(test, sequencia)) {
                    System.out.println("Sim");
                } else {
                    System.out.println("Não");
                }
            }
        }
        
        sc.close();
    }

    public static boolean isSubsequence(String test, String sequencia) {
        int indexTeste = 0;
        int indexSequencia = 0;

        while (indexTeste < test.length() && indexSequencia < sequencia.length()) {
            if (test.charAt(indexTeste) == sequencia.charAt(indexSequencia)) {
                indexSequencia++;
            }
            indexTeste++;
        }

        return indexSequencia == sequencia.length();
    }
}
