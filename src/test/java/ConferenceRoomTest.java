import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom(20,"Edinburgh");
        guest = new Guest("Jerry Bean");
    }

    @Test
    public void shoudHaveCapacity() {
        assertEquals(20, conferenceRoom.getCapacity());
    }
    @Test
    public void shouldHaveName() {
        assertEquals("Edinburgh", conferenceRoom.getName());
    }
    @Test
    public void shouldHaveGuests() {
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.guestCount());
    }
}
