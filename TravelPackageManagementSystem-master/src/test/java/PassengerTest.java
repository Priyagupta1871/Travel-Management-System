package test.java;

import org.junit.jupiter.api.Test;

import com.priya.travelpackages.model.*;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PassengerTest {

    @Test
    void testSignUpForAnActivity() {
        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity("Sightseeing", "City Exploration", 30.0, 15));

        Destination destination = new Destination("City Tour", activities);
        Map<Destination, List<Activity>> signedUpActivities = new HashMap<>();

        Passenger passenger = new Passenger("Jane Doe", 456, 50.0, signedUpActivities);

        // Test sign up for an activity
        assertTrue(passenger.signUpForAnActivity(destination, activities.get(0)));

        // Test invalid sign up for an activity (insufficient balance)
        assertFalse(passenger.signUpForAnActivity(destination, activities.get(0)));

        // Test invalid sign up for an activity (activity at capacity)
        activities.get(0).setCapacity(0);
        assertFalse(passenger.signUpForAnActivity(destination, activities.get(0)));
    }
}

