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

}
