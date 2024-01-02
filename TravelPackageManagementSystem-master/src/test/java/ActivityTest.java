package test.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.priya.travelpackages.model.Activity;

class ActivityTest {

    @Test
    void testActivityInitialization() {
        Activity activity = new Activity("Hiking", "Outdoor Adventure", 50.0, 20);

        // Test getters
        Assertions.assertEquals("Hiking", activity.getName());
        Assertions.assertEquals("Outdoor Adventure", activity.getDescription());
        Assertions.assertEquals(50.0, activity.getCost(), 0.001);
        Assertions.assertEquals(20, activity.getCapacity());

        // Test setters
        activity.setName("Sightseeing");
        activity.setDescription("City Exploration");
        activity.setCost(30.0);
        activity.setCapacity(15);

        Assertions.assertEquals("Sightseeing", activity.getName());
        Assertions.assertEquals("City Exploration", activity.getDescription());
        Assertions.assertEquals(30.0, activity.getCost(), 0.001);
        Assertions.assertEquals(15, activity.getCapacity());
    }
}