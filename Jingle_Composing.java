import java.io.IOException;
import java.util.*;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Jingle_Composing {

    public static final double w = 1.0;
    public static final double h = 0.5;
    public static final double q = 0.25;
    public static final double e = 0.125;
    public static final double s = 0.0625;
    public static final double t = 0.03125;
    public static final double x = 0.015625;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        while(!input.equals("*")){
            String[] notes = input.split("/");
            int count = 0;
            for(int i = 0; i < notes.length; i++){
                double sum = 0;
                for(int j = 0; j < notes[i].length(); j++){
                    switch(notes[i].charAt(j)){
                        case 'W':
                            sum += w;
                            break;
                        case 'H':
                            sum += h;
                            break;
                        case 'Q':
                            sum += q;
                            break;
                        case 'E':
                            sum += e;
                            break;
                        case 'S':
                            sum += s;
                            break;
                        case 'T':
                            sum += t;
                            break;
                        case 'X':
                            sum += x;
                            break;
                    }
                }
                if(sum == 1.0){
                    count++;
                }
            }
            System.out.println(count);
            input = sc.nextLine();
        }

        sc.close();
    }

}