import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;


    public Hotel() {
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
    }
    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public int conferenceRoomCount() {
        return this.conferenceRooms.size();
    }
    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public int bedroomCount() {
        return this.bedrooms.size();
    }
    public void checkoutConferenceRoom(ConferenceRoom conferenceRoom) {
        conferenceRoom.removeGuest();
    }
    public void checkoutBedroom(Bedroom bedroom) {
        bedroom.removeGuest();
    }
    public void checkinConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.addGuest(guest);
    }
    public void checkinBedroom(Guest guest, Bedroom bedroom) {
        bedroom.addGuest(guest);
    }
    public Booking bookRoom(Bedroom bedroom, int nights) {
        Booking booking = new Booking (bedroom, nights);
        return booking;
    }
    public int totalBill(Bedroom bedroom, int nights) {
        int rate = bedroom.getRate();
        return rate * nights;
    }

}
