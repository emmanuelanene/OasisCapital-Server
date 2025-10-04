package com.emmanuelanene.OasisCapital.services;

import com.emmanuelanene.OasisCapital.dtos.BookingDTO;
import com.emmanuelanene.OasisCapital.dtos.Response;

public interface BookingService {

    Response getAllBookings();
    Response createBooking(BookingDTO bookingDTO);
    Response findBookingByReferenceNo(String  bookingReference);
    Response updateBooking(BookingDTO bookingDTO);
}
