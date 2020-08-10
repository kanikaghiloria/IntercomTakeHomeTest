package org.intercom.customers.utils;

import org.intercom.customers.Constants;
import org.intercom.customers.core.Location;

public class Distance {

    Double distance;
    Location firstLocation, secondLocation;
    public Distance(Location firstLocation, Location secondLocation) {
        this.firstLocation = firstLocation;
        this.secondLocation = secondLocation;
    }
    public Double getDistance() {
        return distance;
    }

    public Double distanceBetweenLocations()
    {
        distance=0.0;
        double latitudesDifference = firstLocation.getLatitude() - secondLocation.getLatitude();
        double longitudeDifference = firstLocation.getLongitude() - secondLocation.getLongitude();
        distance = Math.pow(Math.sin(latitudesDifference/2),2) + Math.cos(firstLocation.getLatitude()) *
                Math.cos(secondLocation.getLatitude()) * Math.pow(Math.sin(longitudeDifference/2),2);
        distance = 2 * Math.asin(Math.sqrt(distance));
        distance = Constants.EARTH_RADIUS * distance;
        return distance;
    }
}
