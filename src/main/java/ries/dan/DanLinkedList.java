package ries.dan;

/**
 * Created by danries on 2/25/17.
 */
public class DanLinkedList<T>{

    private int listLength;
    private Node<T> head;

    public DanLinkedList(){
        this.listLength = 0;
        this.head = null;
    }

    public void add(T data){}

    public T remove(int index){
        return null;
    }

    public boolean contains(T data){
        return false;
    }

    public int find(T data){
        return -1;
    }

    public int size(){
        return 0;
    }

    public T get(int index){
        return null;
    }

    public DanLinkedList<T> copy(){
        return null;
    }

    public void sort(){}

    public void reverse(){}

    public Node slice(int startIndex, int endIndex){
        return null;
    }

    public Node<T> getHead() {
        return head;
    }

    private static class Node<T>{
        T data;
        Node next;

        Node(T data){
            this.data = data;
            this.next = null;
        }

        public T getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }
    }

}
