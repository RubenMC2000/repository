/**
 * Created by codecadet on 29/01/2020.
 */
public class Person {

    private static String name;
    private static Rooms room = Rooms.NOROOM;

    public static void setRoom(Rooms roomNum){
        room = roomNum;
    }

    public Person CheckIn(int roomNum){
        Hotel hotel = new Hotel();
        hotel.giveRoom(roomNum);
        return null;
    }

    public Person checkOut(){
        Hotel hotel = new Hotel();
        hotel.takeRoom();
        return null;
    }
}
