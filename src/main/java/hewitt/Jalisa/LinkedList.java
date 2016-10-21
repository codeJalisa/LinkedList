package hewitt.Jalisa;

/**
 * Created by jalisahewitt on 10/20/16.
 */
public class LinkedList {
    int size = 0;
    private Node head = null;
    private Node tail;
    private Node position;
    LinkedList copyList = new LinkedList();

    public void add(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            tail = head;
        }else{
            newNode.setNext(head);
            head = newNode;
        }


    }

    public void remove(int index){
        position = head;
        if(index == 1){
            position.setNext(null);
            size--;
        }

        for(int i=1; i<=size; i++){
            index = index-1;
            if(i==index){
                Node temp = position.getNext();
                temp = temp.getNext();
                position.setNext(temp);
                size--;
            }

            position = position.getNext();

        }
    }

    public boolean contains(int data){
        boolean contained = false;
        position = head;
        for(int i=0; i<size;i++){
            if(position.getData() == data){
                contained = true;
                return contained;
            }else{
                position = position.getNext();
            }
        }

        return contained;
    }

    public int find(int data){
        position = head;
        int count = -1;
        for(int i=0; i<size;i++){
            if(position.getData() == data){
                count++;
                return count;
            }else{
                position = position.getNext();
                count++;


            }
        }

        return count;
    }

    public int size(){
        return size;
    }

    public int get(int index){
        position = head;
        for(int i=0; i<size; i++){
            if(index == i){
                return position.getData();
            }else{
                position = position.getNext();
            }
        }

        return -1;
    }

    public LinkedList copy(){
        position = head;
        for(int i =0; i < size; i++){
            if(i==0){

                copyList.add(position.getData());
                position = position.getNext();
            }else{
                copyList.add(position.getData());
                position = position.getNext();
            }
        }
        return copyList;
    }

    public LinkedList sort(LinkedList linkedlist){
        return null;
    }




    class Node{
        public int data;
        public Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            return next;
        }

        public int getData() {
            return data;
        }
    }
}
