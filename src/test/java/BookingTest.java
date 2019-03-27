import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {
    Booking booking;
    Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(23, 2, "double",50);
        booking = new Booking(bedroom, 4);
    }

    @Test
    public void hasBedrooms() {
        assertEquals(bedroom, booking.getBedroom());

    }
    @Test
    public void hasBookedNights() {
        assertEquals(4, booking.getNightsBooked());
    }

}
