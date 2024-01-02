package test.java;

import org.junit.jupiter.api.Test;

import com.priya.travelpackages.model.*;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class TravelPackageTest {

    @Test
    void testPrintItinerary() {
        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity("Mountain Hike", "Hiking in the mountains", 50.0, 10));

        List<Destination> destinations = new ArrayList<>();
        destinations.add(new Destination("Assam", activities));

        List<Passenger> passengers = new ArrayList<>();
        passengers.add(new Passenger("Jaya", 123, 100.0, null));

        TravelPackage travelPackage = new TravelPackage("Adventure Tour", 20, destinations, passengers);

        // Assuming System.out.println is used for printing, this test checks if the method runs without errors
        assertDoesNotThrow(travelPackage::printItinerary);
    }

    @Test
    void testPrintPassengerDetailsForPackage() {
        List<Destination> destinations = new ArrayList<>();
        List<Passenger> passengers = new ArrayList<>();
        passengers.add(new Passenger("Bob", 456, 150.0, null));

        TravelPackage travelPackage = new TravelPackage("Nature Retreat", 30, destinations, passengers);

        // Assuming System.out.println is used for printing, this test checks if the method runs without errors
        assertDoesNotThrow(travelPackage::printPassengerDetailsForPackage);
    }
}

