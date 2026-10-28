package com.pluralsight;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate todayDate = LocalDate.now();
        LocalDateTime todayDateTime = LocalDateTime.now();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEEE, MMMM, dd, yyyy");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEEE, MMMM, dd, yyyy HH:mm:ss");

        String formattedDate = todayDate.format(formatter1);

        String formattedDate2 = todayDate.format(formatter2);

        String formattedDate3 = todayDateTime.format(formatter3);



        //results
        System.out.println(formattedDate);
        System.out.println(todayDate);
        System.out.println(formattedDate2);
        System.out.println(formattedDate3);











    }
}