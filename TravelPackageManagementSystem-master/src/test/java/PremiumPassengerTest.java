package test.java;

import org.junit.jupiter.api.Test;

import com.priya.travelpackages.model.*;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class PremiumPassengerTest {

    @Test
    void testPremiumPassengerSignUpForAnActivity() {
        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity("Beach Day", "Relaxing on the Beach", 0.0, 5));

        Destination destination = new Destination("Island", activities);
        Map<Destination, List<Activity>> signedUpActivities = new HashMap<>();

        PremiumPassenger premiumPassenger = new PremiumPassenger("Bob", 456, 0.0, signedUpActivities);

        // Test sign up for an activity (should always succeed for premium passenger)
        assertTrue(premiumPassenger.signUpForAnActivity(destination, activities.get(0)));

        // Test invalid sign up for an activity (activity at capacity)
        activities.get(0).setCapacity(0);
        assertFalse(premiumPassenger.signUpForAnActivity(destination, activities.get(0)));
    }
}

