package com.priya.travelpackages;

import java.util.*;

import com.priya.travelpackages.model.*;


public class TravelPackagesManagementSystemApplication {

    public static void main(String[] args) {
        List<Destination> destinationListSummer = new ArrayList<>();


        Activity horseRiding = new Activity("Horse Riding", "Horse Riding", 12, 5);
        Activity skiing = new Activity("Skiing", "Skiing", 14, 7);
        Activity rafting = new Activity("Rafting", "Rafting", 9, 3);
        Activity archery = new Activity("Archery", "Archery", 10, 5);
        Activity zipline = new Activity("Zipline", "Zipline", 12, 3);

        List<Activity> allActivities = new ArrayList<>() {{
            add(horseRiding);
            add(skiing);
            add(rafting);
            add(archery);
            add(zipline);
        } };

        List<Activity> manaliActivities = new ArrayList<>();
        manaliActivities.add(horseRiding);
        manaliActivities.add(skiing);
        manaliActivities.add(rafting);

        List<Activity> kasolActivities = new ArrayList<>();
        kasolActivities.add(archery);
        kasolActivities.add(zipline);

        Destination manali = new Destination("Manali", manaliActivities);
        Destination kasol = new Destination("Kasol", kasolActivities);

        destinationListSummer.add(manali);
        destinationListSummer.add(kasol);

        List<Passenger> passengerListSummer = new ArrayList<>();
        Passenger abhinav = new Passenger("Abhinav Verma", 123, 11.0, new HashMap<>());
        Passenger jaya = new GoldPassenger("Jaya Gupta", 321, 200.0, new HashMap<>() );
        Passenger hrishabh = new PremiumPassenger("Hrishabh Singh", 420, 69.0, new HashMap<>());
        passengerListSummer.add(abhinav);
        passengerListSummer.add(jaya);
        passengerListSummer.add(hrishabh);

        TravelPackage travelPackageSummer = new TravelPackage("Summer Package", 10, destinationListSummer, passengerListSummer);
        travelPackageSummer.printItinerary();
        travelPackageSummer.printPassengerDetailsForPackage();

        abhinav.signUpForAnActivity(manali, horseRiding);
        jaya.signUpForAnActivity(kasol, zipline);
        hrishabh.signUpForAnActivity(kasol, archery);

        abhinav.printPassengerDetails();
        jaya.printPassengerDetails();
        hrishabh.printPassengerDetails();

        //All activities having spaces left
        System.out.println("Activities having spaces left : ");
        for(Activity activity : allActivities) {
            if(activity.getCapacity() > 0) {
                System.out.println(activity.getName() + " " + activity.getCapacity());
            }
        }

        //TravelPackage travelPackageWinter = new TravelPackage(null, 0, null, null);
    }
}