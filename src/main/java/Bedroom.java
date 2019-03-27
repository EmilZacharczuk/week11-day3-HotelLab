import java.util.ArrayList;

public class Bedroom {
    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;
    private int rate;

    public Bedroom(int roomNumber, int capacity, String type, int rate) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.type = type;
        this.rate = rate;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public String getType(){
        return this.type;
    }
    public int getRate() {
        return this.rate;
    }
    public void addGuest(Guest guest){
        this.guests.add(guest);
    }

    public int guestCount(){
        return this.guests.size();
    }
    public Guest removeGuest() {
        return this.guests.remove(0);
    }

}
