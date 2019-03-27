import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;
    Guest guest;

    @Before
    public void before() {
        bedroom = new Bedroom (1, 2, "single", 50);
        guest = new Guest("Steve Mills");
    }

    @Test
    public void shouldhaveNumber() {
        assertEquals(1, bedroom.getRoomNumber());
    }
    @Test
    public void shouldHaveCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }
    @Test
    public void shouldHavetype(){
        assertEquals("single",bedroom.getType());
    }
    @Test
    public void shouldHaveGuests(){
        bedroom.addGuest(guest);
        assertEquals(1,bedroom.guestCount());
    }
    @Test
    public void houldHaveRate() {
        assertEquals(50, bedroom.getRate());
    }
    @Test
    public void canRemoveGuest() {
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        bedroom.removeGuest();
        assertEquals(2, bedroom.guestCount());

    }
}
