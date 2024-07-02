package poo.Guias.Guia4.ej7;

import java.util.Objects;

public class Interval implements IntervalCondition{
    private final double start, end, increment;
    public Interval(double start, double end, double increment){
        this.start=start;
        this.end=end;
        this.increment=increment;
    }
    public Interval(double start, double end){
        this(start, end, 1);
    }

    public long size(){
        return Math.max(0, (int)((end-start)/increment)+1);
    }

    double at(long index){
        return start + increment*index;
    }

    long indexOf(double value){
        double inicio, fin, incremento;
        if (start<=end){
            inicio = start;
            fin = end;
            incremento = increment;
        }
        else {
            inicio = end;
            fin = start;
            incremento = -increment;
        }
        for (double i=inicio; i<=fin; i+=incremento){
            if (Double.compare(i, value)==0){
                return Math.round((i-start)/increment);
            }
        }
        return 0;
    }
    public boolean includes(double value) {
        return indexOf(value)!=0;
    }

    public int count(IntervalCondition condition){
        int answer=0;
        double inicio, fin, incremento;
        if (start<=end){
            inicio = start;
            fin = end;
            incremento = increment;
        }
        else {
            inicio = end;
            fin = start;
            incremento = -increment;
        }
        for (double i=inicio; i<=fin; i+=incremento){
            if (condition.evaluate(i)){
                answer+=1;
            }
        }
        return answer;
    }
    @Override
    public boolean evaluate(double x) {
        return x == 1;
    }
    @Override
    public String toString(){
        StringBuilder aux = new StringBuilder("[");
        double rec = start;
        while ((start <= end && rec <= end) || (start > end && rec >= end)) {
            aux.append(rec).append(", ");
            rec = rec + increment;
        }
        aux.setLength(aux.length() - 2);
        aux.append("]");
        return aux.toString();
    }
    @Override
    public boolean equals(Object o){
        return o instanceof Interval interval &&
                Double.compare(interval.start,start)==0 &&
                Double.compare(interval.end,end)==0 &&
                Double.compare(interval.increment,increment)==0;
    }
    @Override
    public int hashCode(){
        return Objects.hash(start, end, increment);
    }
}
