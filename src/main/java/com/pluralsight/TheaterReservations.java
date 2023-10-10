package com.pluralsight;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class TheaterReservations {
    public static void main(String[] args) {
        Scanner theaterReservation = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/DD/YYYY");


        System.out.println("Enter your name (FirstName LastName)");
        String nameInput = theaterReservation.nextLine();
        System.out.println("What date will you be attending (MM/DD/YYYY)");
        String dateinput = theaterReservation.nextLine();
        System.out.println("How many tickets will you need? ");
        int ticketNumberInput = theaterReservation.nextInt();
        String pluralletter = "";
        if ( ticketNumberInput > 1) {
        }
        System.out.println(ticketNumberInput + "ticket reserved for "+ (dateinput) + "under" + (nameInput));








    }

}
