package org.intercom.customers.core;

public class LocationPOJO {
    String name;
    double latitude;
    double longitude;

    public LocationPOJO(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public void degreeToRadians()
    {
        this.latitude = Math.toRadians(this.latitude);
        this.longitude = Math.toRadians(this.longitude);
    }

}
