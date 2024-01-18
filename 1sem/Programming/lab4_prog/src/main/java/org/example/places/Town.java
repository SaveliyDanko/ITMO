package org.example.places;

public class Town extends Place{
    public Town(String name) {
        super(name);
    }

    Hotel hotel = new Hotel();

    public String buildHotel(){
        return hotel.hotel();
    }

    static class Hotel{
        public String hotel(){
            return "hotel";
        }
    }
}
