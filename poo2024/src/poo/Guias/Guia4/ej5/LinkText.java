package poo.Guias.Guia4.ej5;

public class LinkText implements HTMLText{
    private final HTMLText text;
    private final String link;
    private static final String ELEMENT = "a";

    public LinkText(HTMLText text, String link){
        this.text=text;
        this.link=link;
    }
    @Override
    public String source(){
        return "<%s href:%s>%s</%s>".formatted(ELEMENT,link,text,ELEMENT);
    }
    @Override
    public String toString(){
        return source();
    }
}
