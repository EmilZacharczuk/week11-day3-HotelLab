import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        hotel = new Hotel();
        bedroom = new Bedroom(1, 2, "double");
        conferenceRoom = new ConferenceRoom(10,"London");
    }
    @Test
    public void shouldHaveConferenceRoom() {
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.conferenceRoomCount());
    }
    @Test
    public void shouldHaveBedrooms() {
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.bedroomCount());
    }
}
