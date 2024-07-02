package poo.Guias.Guia3.ej8;

public class CellphoneBillTester {
    public static void main(String[] args) {
        FriendCellphoneBill friendCellphoneBill = new FriendCellphoneBill("1111", 3);
        friendCellphoneBill.addFriend("2222");
        friendCellphoneBill.addFriend("3333");
        friendCellphoneBill.addFriend("4444");
        friendCellphoneBill.addFriend("6666");
        friendCellphoneBill.setCost(0.5);
        friendCellphoneBill.registerCall("2222", 400);
        friendCellphoneBill.registerCall("6666", 300);
        System.out.println(friendCellphoneBill.processBill());
    }
}
