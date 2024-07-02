package poo.Guias.Guia4.ej10;

public class Call {
    private String from, to;
    private int duration;

    private static final double COST_PER_SECOND = 1;

    Call(String from, String to, int duration) {
        this.from = from;
        this.to = to;
        this.duration = duration;
    }

    public double getCost() {
        return duration * COST_PER_SECOND;
    }

    public String getTo() {
        return to;
    }
}
