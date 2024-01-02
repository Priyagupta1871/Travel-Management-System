package test.java;

import org.junit.jupiter.api.Test;

import com.priya.travelpackages.model.*;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

class DestinationTest {

    @Test
    void testDestinationInitialization() {
        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity("Hiking", "Outdoor Adventure", 50.0, 20));
        activities.add(new Activity("Sightseeing", "City Exploration", 30.0, 15));

        Destination destination = new Destination("Mountain Valley", activities);

        // Test getters
        assertEquals("Mountain Valley", destination.getName());
        assertEquals(activities, destination.getActivties());

        // Modify the list of activities and check if it affects the destination
        activities.add(new Activity("Camping", "Overnight Stay", 80.0, 10));

        assertEquals(3, destination.getActivties().size()); // Ensure destination activities are affected
    }
}

