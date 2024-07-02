package poo.Guias.Guia4.ej5;

public class FormatText implements HTMLText{
    private final String format;
    private final HTMLText text;
    public FormatText(HTMLText text, String format){
        this.format = format;
        this.text = text;
    }
    @Override
    public String source(){
        return "<%s>%s</%s>".formatted(format,text.source(),format);
    }
    @Override
    public String toString(){
        return source();
    }
}
