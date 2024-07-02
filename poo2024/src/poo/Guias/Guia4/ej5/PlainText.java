package poo.Guias.Guia4.ej5;

public class PlainText implements HTMLText{
    private String text;

    public PlainText(String text){
        setText(text);
    }
    public void setText(String text) {
        this.text = text;
    }
    @Override
    public String source(){
        return text;
    }
    @Override
    public String toString(){
        return text;
    }
}
