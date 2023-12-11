import java.io.IOException;
import java.util.*;

class Celula {
    Celula prox, ant;
    String nome;
    int numero;

    public Celula() {

    }

    public Celula(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }
}

class Lista {
    Celula primeiro, ultimo;

    Lista() {
        primeiro = null;
        ultimo = null;
    }

    public int getNum() {
        return primeiro.numero;
    }

    void inserir(String nome, int numero) {
        Celula nova = new Celula(nome, numero);
        if (primeiro == null) {
            primeiro = nova;
            ultimo = nova;
            nova.prox = primeiro;
            nova.ant = ultimo;
        } else {
            nova.ant = ultimo;
            ultimo.prox = nova;
            nova.prox = primeiro;
            ultimo = nova;
            primeiro.ant = ultimo;

        }
    }

    int remover(int numero) {
        Celula i;
        if (numero % 2 == 0) {
            i = primeiro;
            for (int j = 0; j < numero; j++, i = i.prox)
                ;
        } else {
            i = primeiro;
            for (int j = 0; j < numero; j++, i = i.prox)
                ;
        }
        i.ant.prox = i.prox;
        i.prox.ant = i.ant;
        if (i == primeiro) {
            primeiro = i.prox;
            ultimo.prox = primeiro;
            primeiro.ant = ultimo;
        }
        if (i == ultimo) {
            ultimo = i.ant;
            primeiro.ant = ultimo;
            ultimo.prox = primeiro;
        }

        return i.numero;

    }

    void mostrar() {
        Celula i = primeiro;
        System.out.println("Vencedor(a): " + i.nome);
    }

}

public class Summer_Camp {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        while (n != 0) {
            Lista lista = new Lista();
            String linha;
            for (int j = 0; j < n; j++) {
                linha = sc.nextLine();
                String[] divide = linha.split(" ");
                lista.inserir(divide[0], Integer.parseInt(divide[1]));

            }
            int resp = lista.getNum();
            for (int i = 0; i < n - (n-1); i++) {
                resp = lista.remover(resp);
            }
            lista.mostrar();
            n = sc.nextInt();
            sc.nextLine();
        }

        sc.close();
    }

}