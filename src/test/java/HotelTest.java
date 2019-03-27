import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    Guest guest;
    Booking booking;

    @Before
    public void before(){
        hotel = new Hotel();
        bedroom = new Bedroom(1, 2, "double", 50);
        conferenceRoom = new ConferenceRoom(10,"London");
        guest = new Guest("Steve Wonder");
        booking = new Booking(bedroom, 4);
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
    @Test
    public void canCheckoutGuestConferenceRoom() {
        conferenceRoom.addGuest(guest);
        hotel.addConferenceRoom(conferenceRoom);
        hotel.checkoutConferenceRoom(conferenceRoom);
        assertEquals(0, conferenceRoom.guestCount());
    }
    @Test
    public void canCheckoutGuestBedroom() {
        bedroom.addGuest(guest);
        hotel.addBedroom(bedroom);
        hotel.checkoutBedroom(bedroom);
        assertEquals(0, bedroom.guestCount());
    }
    @Test
    public void canCheckinGuestConferenceRoom() {
        hotel.addConferenceRoom(conferenceRoom);
        hotel.checkinConferenceRoom(guest, conferenceRoom);
        assertEquals(1, conferenceRoom.guestCount());
    }
    @Test
    public void canCheckinGuesBedroom() {
        hotel.addBedroom(bedroom);
        hotel.checkinBedroom(guest, bedroom);
        assertEquals(1, bedroom.guestCount());
    }
    @Test
    public void canCreateBooking() {
        Booking newbooking = hotel.bookRoom(bedroom, 4);
        assertEquals(bedroom, newbooking.getBedroom());
        assertEquals(4, newbooking.getNightsBooked());
    }
    @Test
    public void haveTotalBill() {
        assertEquals(200, hotel.totalBill(bedroom, 4));
    }
}
