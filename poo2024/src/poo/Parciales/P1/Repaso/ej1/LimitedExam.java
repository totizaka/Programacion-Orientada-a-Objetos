package poo.Parciales.P1.Repaso.ej1;

import java.util.Arrays;

public class LimitedExam extends UniqueExam{
    private String[] pending;
    private int dimPending;
    private static final int INITIAL_DIM=5;
    private int availability;
    public LimitedExam(String name, int availability) {
        super(name);
        this.availability = availability;
        this.pending = new String[INITIAL_DIM];
    }
    @Override
    public void enroll(String student) {
        if (getEnrolledCount() < availability) {
            super.enroll(student);
        }
        else {
            if (dimPending == pending.length) {
                resize();
            }
            pending[dimPending++] = student;
        }
    }

    @Override
    public void unenroll(String student){
        if(removeFromPending(student)){
            return;
        }
        int dimBeforeUnenroll = getEnrolledCount();
        super.unenroll(student);
        if(isPending() && getEnrolledCount() < dimBeforeUnenroll) {
            String pendingToEnroll = pending[0];
            enroll(pendingToEnroll);
            removeFromPending(pendingToEnroll);
        }
    }

    public boolean removeFromPending(String student) {
        for (int i = 0; i < dimPending; i++) {
            if (pending[i].equals(student)) {
                System.arraycopy(pending, i + 1, pending, i, dimPending - 1 - i);
                dimPending--;
                return true;
            }
        }
        return false;
    }
    private boolean isPending(){
        return dimPending>0;
    }
    private void resize(){
        pending = Arrays.copyOf(pending, pending.length + INITIAL_DIM);
    }
    public String[] getPendingStrudents(){
        return Arrays.copyOf(pending, dimPending);
    }
}
