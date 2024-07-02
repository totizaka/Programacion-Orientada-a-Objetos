package poo.Guias.Guia4.ej12;

public class LinearListImp implements LinearList{
    private Node first;

    @Override
    public void add(Object obj) {
        Node current = first;
        if (first == null){
            first = new Node(obj, null);
        }
        else{
            while (current.tail != null){
                current = current.tail;
            }
            current.tail = new Node(obj, null);
        }
    }

    @Override
    public Object get(int i) {
        Node answer = findNode(i);
        return answer.head;
    }

    @Override
    public void set(int i, Object obj) {
        Node current = findNode(i);
        current.head = obj;
    }

    @Override
    public void remove(int i) {
        if (this.first == null || i < 0){
            throw new IndexOutOfBoundsException();
        }
        if (i==0){
            this.first = this.first.tail;
        }
        else{
            Node previous = findNode(i-1);
            if(previous.tail == null){
                throw new IndexOutOfBoundsException();
            }
            previous.tail = previous.tail.tail;
        }
    }

    @Override
    public int indexOf(Object obj) {
        Node current = this.first;
        int index = 0;
        while (current != null){
            if (current.head.equals(obj)){
                return index;
            }
            current = current.tail;
            index++;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int size() {
        Node current = this.first;
        int index=0;
        while (current != null){
            current = current.tail;
            index++;
        }
        return index;
    }

    private Node findNode(int index){
        Node current = first;
        if (index < 0){
            throw new IndexOutOfBoundsException();
        }
        for (int j = 0; j < index && current != null; j++) {
            current = current.tail;
        }
        if (current == null){
            throw new IndexOutOfBoundsException();
        }
        return current;
    }
}
