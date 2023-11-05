
import java.util.*;
class Aluno{
    public String nome;
    public int habilidade;
}
public class Times {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        String[] ns = n.split(" ");
        int j = Integer.parseInt(ns[0]);
        int times = Integer.parseInt(ns[1]);
        String[] jogadores = new String[j];

       for(int i=0;i<j;i++){
        String jogador = sc.nextLine();
        String[] nomeJogador = jogador.split(" ");
        jogadores[i] = nomeJogador[0];
       }
       

        sc.close();
    }
}
