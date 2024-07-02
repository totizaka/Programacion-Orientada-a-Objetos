package poo.Clases.clase3;

public class Date {
    private final int year, month, day;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Date date &&
                year == date.year &&
                month == date.month &&
                day == date.day;
    }

    private static String format;
    @Override
    public String toString(){
        if (format == null) {
//        return day + "/" + month + "/" + year;  //option 1
            return "%02d/%02d/%04d".formatted(day, month, year); //option 2
        }
        return format.formatted(day, month, year);
    }
}
