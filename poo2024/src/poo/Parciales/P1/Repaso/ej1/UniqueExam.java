package poo.Parciales.P1.Repaso.ej1;

import java.util.Arrays;

public class UniqueExam extends Exam{
    public UniqueExam(String name){
        super(name);
    }
    @Override
    public void enroll(String student){
        if (!isEnrolled(student)) {
            super.enroll(student);
        }
    }
}
