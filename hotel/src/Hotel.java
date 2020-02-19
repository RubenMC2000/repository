/**
 * Created by codecadet on 29/01/2020.
 */
public class Hotel {

    private Rooms[] hotelRooms = Rooms.values();

    public boolean checkRoom(int roomNum){
        return Rooms.values()[roomNum].getStatus();

    }

    public void giveRoom(int roomNum){
        if(checkRoom(roomNum) == false){
            System.out.println("Sorry room is already being used.");
            return;
        }
        Person.setRoom(Rooms.values()[roomNum]);
        Rooms.values()[roomNum].setStatus(false);
        System.out.println("Your room is " + Rooms.values()[roomNum] + ".");

    }

    public void takeRoom(){
        Person.setRoom(Rooms.NOROOM);
        System.out.println("Thank you and we hope to see you again.");
    }



}
