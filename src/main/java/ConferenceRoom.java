import java.util.ArrayList;

public class ConferenceRoom {
    private int capacity;
    private ArrayList<Guest> guests;
    private String name;

    public ConferenceRoom(int capacity, String name) {
        this.capacity = capacity;
        this.name = name;
        this.guests = new ArrayList<>();
    }

    public int getCapacity(){
        return this.capacity;
    }

    public String getName(){
        return this.name;
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);
    }

    public int guestCount(){
        return this.guests.size();
    }
}
