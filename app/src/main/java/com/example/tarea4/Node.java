package com.example.tarea4;

public class Node {



    private int valor;
    private Node next = null;
    private Node prev = null;

    public Node(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
