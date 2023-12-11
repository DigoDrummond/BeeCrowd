import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

class No {
    public int elemento;
    public No esq, dir;

    public No(int elemento) {
        this.elemento = elemento;
        this.esq = this.dir = null;
    }
}

class Arvore {
    private No raiz;

    Arvore() {
        raiz = null;
    }

    public void inserir(int x) throws Exception {
        raiz = inserir(x, raiz);
    }

    private No inserir(int x, No i) throws Exception {
        if (i == null) {
            i = new No(x);
        } else if (x < i.elemento) {
            i.esq = inserir(x, i.esq);
        } else if (x > i.elemento) {
            i.dir = inserir(x, i.dir);
        } else {
            throw new Exception("Erro!");
        }
        return i;
    }

    public void porNivel(int i) {
        if (raiz == null) {
            System.out.println("Árvore vazia");
            return;
        }

        Queue<No> fila = new LinkedList<>();
        fila.add(raiz);

        System.out.println("Case " + (i+1) + ":");

        while (!fila.isEmpty()) {
            No noAtual = fila.poll();
            System.out.print(noAtual.elemento + " ");

            if (noAtual.esq != null) {
                fila.add(noAtual.esq);
            }
            if (noAtual.dir != null) {
                fila.add(noAtual.dir);
            }
        }
        System.out.println();
    }
}

public class Level_Order_Tree_Traversal {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int testes = sc.nextInt();
        for (int i = 0; i < testes; i++) {
            int nums = sc.nextInt();
            Arvore arvore = new Arvore();
            for (int j = 0; j < nums; j++) {
                arvore.inserir(sc.nextInt());
            }
            arvore.porNivel(i);
        }

    }
}
