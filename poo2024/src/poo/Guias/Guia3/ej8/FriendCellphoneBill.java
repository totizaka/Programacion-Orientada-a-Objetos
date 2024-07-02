package poo.Guias.Guia3.ej8;

public class FriendCellphoneBill extends CellphoneBill{
    private double cost;
    private static final double FRIEND_COST_PER_SECOND = 0;
    private int friendsLimit;
    private String[] friends;
    private int friendsIndex;


    FriendCellphoneBill(String number, int limit){
        super(number);
        this.friends = new String[limit];
        this.friendsLimit = limit;
        this.cost = FRIEND_COST_PER_SECOND;
    }

    public void setCost(double cost){
        this.cost = cost;
    }

    public void addFriend(String number){
        if (friendsIndex < friendsLimit && !containsFriend(number)){
            friends[friendsIndex]=number;
            friendsIndex++;
        }
        else {
            System.out.printf("no se pudo agregar a: %s", number);
            System.out.println();
        }
    }

    private boolean containsFriend(String number){
        for (int i = 0; i < friendsIndex; i++) {
            if (friends[i].compareTo(number)==0){
                return true;
            }
        }
        return false;
    }

    public void deleteFriend(String number){
        if(friendsIndex > 0){
            boolean found=false;
            for (int i = 0; i < friendsIndex && !found; i++) {
                if (friends[i].compareTo(number)==0){
                    friends[i]=friends[--friendsIndex];
                    found=true;
                }
            }
        }
    }
    @Override
    public double processBill(){
        double total = 0;
        for (int i = 0; i < callsIndex; i++) {
            boolean friendlyCall = false;
            for(int j = 0; j < friendsIndex && !friendlyCall; j++) {
                if (calls[i].getTo().compareTo(friends[j]) == 0) {
                    friendlyCall = true;
                }
            }
            total += friendlyCall ? calls[i].getCost() * cost : calls[i].getCost();
        }
        return total;
    }
}
