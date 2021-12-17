package be.intecbrussel.customlist;

public class FridayApp {
    public static void main(String[] args) {
        FridayList fridayList = new FridayList();
        fridayList.add(100);
        fridayList.add(32);
        fridayList.add(48);


        fridayList.remove(32);
        fridayList.remove(48);
        fridayList.remove(100);
        fridayList.printAll();


    }
}
