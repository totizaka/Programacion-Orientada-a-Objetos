package poo.Guias.Guia5.ej5;

public class ArrayAccessStack<E> extends ArrayStack<E> implements AccessStack<E> {

    private int pushCounter=0, popCounter=0;
    public ArrayAccessStack(){
        super();
    }
    @Override
    public void push(E obj){
        super.push(obj);
        pushCounter++;
    }
    @Override
    public E pop(){
        E answer = super.pop();
        popCounter++;
        return answer;
    }
    @Override
    public int countPush() {
        return pushCounter;
    }
    @Override
    public int countPop() {
        return popCounter;
    }
}
