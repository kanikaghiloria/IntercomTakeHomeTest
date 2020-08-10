package org.intercom.customers.utils;

import org.intercom.customers.core.Location;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistanceTest {
    @Test
    void distanceBetweenLocations() {
        Location firstLocation = new Location(52.986375, -6.043701);
        Location secondLocation = new Location(51.8856167, -10.4240951);
        Location thirdLocation = new Location(-500d, 100d);
        Distance distance = new Distance(firstLocation, firstLocation);
        assertEquals(0, distance.distanceBetweenLocations());
        Distance distance1 = new Distance(firstLocation, secondLocation);
        assertEquals(321.1147002217114, distance1.distanceBetweenLocations());
    }
}