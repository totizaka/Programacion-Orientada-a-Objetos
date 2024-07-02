package poo.Guias.Guia5.ej3.parte1;

public class LinearListImp<T> implements LinearList<T> {
    private Node<T> first;

    @Override
    public void add(T obj) {
        Node<T> current = first;
        if (first == null){
            first = new Node<>(obj, null);
        }
        else{
            while (current.tail != null){
                current = current.tail;
            }
            current.tail = new Node<>(obj, null);
        }
    }

    @Override
    public Object get(int i) {
        Node<T> answer = findNode(i);
        return answer.head;
    }

    @Override
    public void set(int i, T obj) {
        Node<T> current = findNode(i);
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
            Node<T> previous = findNode(i-1);
            if(previous.tail == null){
                throw new IndexOutOfBoundsException();
            }
            previous.tail = previous.tail.tail;
        }
    }

    @Override
    public int indexOf(T obj) {
        Node<T> current = this.first;
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
        Node<T> current = this.first;
        int index=0;
        while (current != null){
            current = current.tail;
            index++;
        }
        return index;
    }

    private Node<T> findNode(int index){
        Node<T> current = first;
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

    private static class Node<T> {
        protected T head;
        protected Node<T> tail;

        public Node(T head, Node<T> tail) {
            this.head = head;
            this.tail = tail;
        }
    }
}
