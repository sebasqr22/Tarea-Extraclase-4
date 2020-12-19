package com.example.tarea4;

public class XORlist {
    public Node head;
    public Node tail;
    public int size;


    /**
     * Constructor de la clase DoubleLinkedList
     */
    public XORlist(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * Metodo para verificar si la lista es vacia
     * @return valor booleano
     */
    public boolean isEmpty(){
        return this.head==null;
    }

    /**
     * Metodo para obtener el tamaño de la lista
     * @return tamaño de la lista
     */
    public int getSize() {
        return size;
    }

    /**
     * Metodo para insertar un elemento al inicio de la lista
     * @param data
     */
    public void insertHead(int data){

        Node newNode = new Node(data);

        if (this.isEmpty()){
            this.head = this.tail = newNode;
        }else{
            newNode.setNext(this.head);
            this.head = newNode;
        }
        this.size++;
    }

    /**
     * Metodo para insertar un elemento al final de la lista
     * @param data
     */
    public void insertLast(int data){

        Node newNode = new Node(data);

        if (this.isEmpty()){
            this.head = this.tail = newNode;
        }else{
            this.tail.setNext(newNode);
            newNode.setPrev(this.tail);
            this.tail = newNode;
        }
        this.size++;
    }

    /**
     * Metodo para encontrar un elemento en la lista
     * @param data
     * @return posicion del elemento
     */
    public boolean find(int data){
        if (this.isEmpty()){
            return false;
        }else{
            if (this.head.getValor() == data){
                return true;
            }else{
                Node tmp = this.head.getNext();

                while(tmp!=null){
                    if (tmp.getValor()==data){
                        return true;
                    }
                    tmp = tmp.getNext();
                }
                return false;
            }
        }
    }

    public void delete(int data){
        if (!this.isEmpty()){
            if (this.head.getValor() == data){
                this.head = this.head.getNext();
            }
            else if (this.tail.getValor() == data){
                this.tail.getPrev().setNext(null);
                this.tail = this.tail.getPrev();
            }
            else{
                Node tmp = this.head.getNext();

                while (tmp != null){
                    if (tmp.getValor() == data){
                        tmp.getPrev().setNext(tmp.getNext());
                        tmp.getNext().setPrev(tmp.getPrev());
                        break;
                    }
                    tmp = tmp.getNext();
                }
            }
        }
    }

    /**
     * Metodo para transformar la lista en un array
     * @return el int a array
     */

    public int[] getArray(){
        int[] array;
        if (this.head == null){
            array = new int[1];
            return array;
        }
        else{
            array = new int[this.size];
            Node tmp = this.head;
            int i = 0;

            while (tmp != null){
                array[i] = tmp.getValor();
                tmp = tmp.getNext();
                i++;
            }
            return array;
        }
    }

    /**
     * Metodo para imprimir la lista
     */
    public void print(){
        Node tmp = this.head;

        while(tmp!=null){
            System.out.println(tmp.getValor());
            tmp = tmp.getNext();
        }
    }

    /**
     * Metodo para retornar el primer elemento
     * @return primer elemento
     */
    public Node getHead() {
        return head;
    }

    /**
     * Metodo para retornar el ultimo elemento
     * @return utilo elemento
     */
    public Node getTail() {
        return tail;
    }






}
