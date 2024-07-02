package poo.Talleres.Taller1;

public class MultipleCounter extends Counter {

    private int times;

    public MultipleCounter(int times){
        this.times=times;
    }

    public void increment(){
        for (int i=0; i<times; i++) {
            super.increment();
        }
    }

    public void decrement(){
        for (int i=0; i<times; i++) {
            super.decrement();
        }
    }
}
