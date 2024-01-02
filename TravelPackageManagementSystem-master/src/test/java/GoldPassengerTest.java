package test.java;

import org.junit.jupiter.api.Test;

import com.priya.travelpackages.model.*;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class GoldPassengerTest {

    @Test
    void testGoldPassengerSignUpForAnActivity() {
        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity("Museum Visit", "Cultural Experience", 20.0, 10));

        Destination destination = new Destination("Delhi", activities);
        Map<Destination, List<Activity>> signedUpActivities = new HashMap<>();

        GoldPassenger goldPassenger = new GoldPassenger("Alice", 789, 20.0, signedUpActivities);

        // Test sign up for an activity
        assertTrue(goldPassenger.signUpForAnActivity(destination, activities.get(0)));

        // Test invalid sign up for an activity (insufficient balance)
        assertFalse(goldPassenger.signUpForAnActivity(destination, activities.get(0)));

        // Test invalid sign up for an activity (activity at capacity)
        activities.get(0).setCapacity(0);
        assertFalse(goldPassenger.signUpForAnActivity(destination, activities.get(0)));
    }
}

