package Reservations;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Reservation implements Reservationy {
    String getDowBooking;
    String getCodeBooking;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    @Override
    public String getDowBooking() {
        ArrayList<String> dowBooking = new ArrayList<>(
                Arrays.asList("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"));
        int random = (int) (Math.random() * 6 + 1);
        String temp = dowBooking.get(random);
        return temp;
    }

    @Override
    public String getCodeBooking() {
        List<Character> codeBooking = new ArrayList<>();
        final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < 8; i++) {
            int random = (int) (Math.random() * 8 + 1);
            codeBooking.add(upper.charAt(random));
        }
        String str = codeBooking.stream().map(e -> e.toString()).collect(Collectors.joining());
        return str;
    }

    public void printOut(){
        System.out.println("Booking# " + getCodeBooking() + ANSI_RED + " for " + ANSI_RESET + getDowBooking());
    }
}
