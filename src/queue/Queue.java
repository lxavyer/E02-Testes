package queue;

import java.util.ArrayList;
import java.util.List;

public class Queue<Trem> {
    private List<Trem> fila;

    public Queue() {
        this.fila = new ArrayList<>();
    }

    public void enfileirar(Trem item) {
        this.fila.add(item);
    }

    public Trem desenfileirar() throws Exception {
        if(this.estaVazia()) {
            throw new Exception("Empty queue");
        }
        return this.fila.remove(0);
    }

    public boolean estaVazia() {
        return fila.isEmpty();
    }

    public int tamanho() {
        return fila.size();
    }

}
