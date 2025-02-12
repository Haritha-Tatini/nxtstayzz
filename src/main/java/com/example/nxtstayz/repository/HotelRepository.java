package com.example.nxtstayz.repository;

import com.example.nxtstayz.model.Hotel;
import java.util.ArrayList;

public interface HotelRepository {
    ArrayList<Hotel> getHotels();

    Hotel getHotelById(int hotelId);

    Hotel addHotel(Hotel hotel);

    Hotel updateHotel(int hotelId, Hotel hotel);

    void deleteHotel(int hotelId);

}
