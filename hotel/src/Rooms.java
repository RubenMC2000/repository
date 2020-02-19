/**
 * Created by codecadet on 29/01/2020.
 */
public enum Rooms {
    NOROOM,
    ROOM1;

    private static boolean status = true;

    public void setStatus(boolean status){
        this.status = status;
    }

    public boolean getStatus(){
        return this.status;
    }

}
