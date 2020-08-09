package org.intercom.customers.core;

public class CustomerPOJO {
    int userID;
    String name;
    LocationPOJO location;

    public CustomerPOJO(int userID, String name, LocationPOJO location) {
        this.userID = userID;
        this.name = name;
        this.location = location;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocationPOJO getLocation() {
        return location;
    }

    public void setLocation(LocationPOJO location) {
        this.location = location;
    }
}
