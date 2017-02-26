package ries.dan;

/**
 * Created by danries on 2/25/17.
 */
public class DanLinkedList<T>{

    private int listLength;
    private Node<T> head;


    public DanLinkedList(){
        this.listLength = 0;
    }

    public void add(T data){

    }

    class Node<T>{
        private T data;
        private Node next;

        public Node(T data){
            this.data = data;
            this.next = null;
        }

    }

}
