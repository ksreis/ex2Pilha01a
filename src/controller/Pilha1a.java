package controller;
import java.util.Stack;

public class Pilha1a {
    public Stack<Integer> pilha;
    
    public Pilha1a() {
        pilha = new Stack<>();
    }
    
    public void acao() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                pilha.push(i * i);
            } else {
                if (i <= 5) {
                    pilha.push(i);
                } else {
                    pilha.pop();
                }
            }
            System.out.println(pilha);
        }
        System.out.println("Topo: " + pilha.peek());
        System.out.println("Tamanho final: " + pilha.size());
    }
}