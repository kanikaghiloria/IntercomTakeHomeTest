package org.intercom.customers.core;

public class Customer {
    Long userID;
    String name;
    Location location;

    public Customer(Long userID, String name, Location location) {
        this.userID = userID;
        this.name = name;
        this.location = location;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "userID=" + userID +
                ", name='" + name + '\'' +
                ", latitude=" + location.getLatitude() +
                ", longitude=" + location.getLongitude() +
                '}';
    }
}
