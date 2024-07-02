package poo.Guias.Guia4.ej10;
public class FriendCellphoneBill extends CellphoneBill {
    private double cost;
    private static final double FRIEND_COST_PER_SECOND = 0;
    private int friendsLimit;
    private String[] friends;
    private int friendsIndex=0;


    FriendCellphoneBill(String number, int limit){
        super(number);
        this.friends = new String[limit];
        this.friendsLimit = limit;
        this.cost = FRIEND_COST_PER_SECOND;
    }

    public void setCost(double cost){
        this.cost = cost;
    }

    public void addFriend(String number) throws TooManyFriendsException, AlreadyExistsFriendException{
        if (containsFriend(number)){
            throw new AlreadyExistsFriendException(number);
        }
        else if (friendsIndex == friendsLimit){
            throw new TooManyFriendsException(number);
        }
        else {
            friends[friendsIndex]=number;
            friendsIndex++;
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

    public void deleteFriend(String number) throws FriendNotFoundException{
        boolean found=false;
        for (int i = 0; i < friendsIndex && !found; i++) {
            if (friends[i].compareTo(number)==0){
                friends[i]=friends[--friendsIndex];
                found=true;
            }
        }
        if (!found){
            throw new FriendNotFoundException(number);
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
