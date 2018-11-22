package Reservations;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reservation implements Reservationy {
    String getDowBooking;
    String getCodeBooking;



   @Override
    public String getDowBooking() {
       ArrayList<String> dowBooking = new ArrayList<String>(
               Arrays.asList("MON", "TUE", "WED","THU", "FRI", "SAT", "SUN" ));
      int random = (int) (Math.random() * 6 + 1);
      return dowBooking.get(random);
    }

    @Override
    public String getCodeBooking() {
        List<Character> codeBooking = new ArrayList<>();
        final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i <8 ; i++) {
            int random = (int) (Math.random() * 8 + 1);
            codeBooking.add(upper.charAt(random));
        }
        String str = codeBooking.stream().map(e->e.toString()).collect(Collectors.joining());
        return str;
        }
    }
