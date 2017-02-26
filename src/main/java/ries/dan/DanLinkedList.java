package ries.dan;

/**
 * Created by danries on 2/25/17.
 */
public class DanLinkedList<T>{

    class Node<T>{
        private T data;
        private Node next;



        public Node(T data){
            this.data = data;
            this.next = null;
        }

    }

}
