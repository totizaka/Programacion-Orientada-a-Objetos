package poo.Guias.Guia7.ej4;

public enum Genre {
    FANTASY("Fantasy"),
    DRAMA("Drama"),
    FICTION("Fiction"),
    CHILDREN("Children");

    private String name;
    Genre(String name){
        this.name=name;
    }

    public String toString(){
        return "Ranking of %s".formatted(name);
    }
}
