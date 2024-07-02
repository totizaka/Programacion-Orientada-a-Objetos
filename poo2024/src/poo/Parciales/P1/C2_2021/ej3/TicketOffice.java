package poo.Parciales.P1.C2_2021.ej3;

public class TicketOffice {
    private int id=1000;
    public Ticket buySkiTicket(int maxUses){
        Ticket ticket = new Ticket(id, maxUses,true);
        id++;
        return ticket;
    }
    public Ticket buyVisitorTicket(int maxUses){
        Ticket ticket = new Ticket(id, maxUses,false);
        id++;
        return ticket;
    }
    public void ride(Ticket ticket, Aeorisllas aeorislla){
        if(ticket.isVisitor()){
            if(!aeorislla.isForVisitor()){
                throw new RuntimeException();
            }
        }
        if(!ticket.canRide()){
            throw new RuntimeException();
        }
        ticket.useRide();
    }
}
