package poo.Guias.Guia7.ej9;

import javax.naming.spi.DirObjectFactory;
import java.util.*;

public class HelpDesk{
    private final Map<ClientType, LinkedList<HelpTicket>> desk = new EnumMap<>(ClientType.class);
    public HelpDesk openTicket(ClientType type, String name, String question){
        if(!desk.containsKey(type)){
            desk.put(type, new LinkedList<>());
        }
        desk.get(type).push(new HelpTicket(name, question));
        return this;
    }
    public HelpTicket getNextTicket(ClientType type){
        if (!desk.containsKey(type)){
            throw new NoSuchElementException();
        }
        return desk.get(type).pollLast();
    }
    public HelpTicket getNextTicket() {
        if (!hasTickets()) {
            throw new NoSuchElementException();
        }
        for (LinkedList<HelpTicket> list : desk.values()){
            if (!list.isEmpty()){
                return list.pollLast();
            }
        }
        throw new NoSuchElementException();
    }

    public boolean hasTickets(){
        for (LinkedList<HelpTicket> list : desk.values()) {
            if (!list.isEmpty()) {
                return true;
            }
        }
        return false;
    }
    public static class HelpTicket{
        private final String name;
        private final String question;
        public HelpTicket(String name, String question){
            this.name=name;
            this.question=question;
        }
        public String toString(){
            return "HelpTicket for %s asking %s".formatted(name, question);
        }
    }
}
