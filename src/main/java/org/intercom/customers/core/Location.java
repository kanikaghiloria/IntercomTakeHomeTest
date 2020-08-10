package org.intercom.customers.core;

public class Location {
    String name;
    Double latitude;
    Double longitude;

    public Location(Double latitude, Double longitude) {
        this.latitude = Math.toRadians(latitude);
        this.longitude = Math.toRadians(longitude);
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Location{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
