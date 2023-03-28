package controller;
import java.util.Stack;


public class Pilha1b {

    public static Stack<Integer> acao() {
        Stack<Integer> pilha = new Stack<>();
        
        for (int i = 100; i < 115; i++) {
            if (pilha.isEmpty()) {
                pilha.push(i + 100);
            } else {
                if (pilha.size() <= 4) {
                    pilha.push(i + 50);
                } else {
                    pilha.pop();
                }
            }
            System.out.println(pilha);
        }
        System.out.println("Topo: " + pilha.peek());
        System.out.println("Tamanho final: " + pilha.size());
        
        return pilha;
    }
}
