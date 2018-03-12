package edu.gatech.cs2340.homefullshelter.model;

/**
 * Created by gkarnati3 on 2/24/18.
 */

public class Shelter {
    private int key;
    private String name;
    private String capacity;
    private String restrictions;
    private double longitude;
    private double latitude;
    private String address;
    private String notes;
    private String number;

    public Shelter() {
        //for the firebase stuff. FIRE. AHHHH. Scary.
    }

    public Shelter(int k, String n, String c, String r, double lo, double la, String a, String no, String nu) {
        key = k;
        name = n;
        capacity = c;
        restrictions = r;
        longitude = lo;
        latitude = la;
        address = a;
        notes = no;
        number = nu;
    }

    public String toString() {
        return name + " " + key;
    }

    public int getKey() { return key; }
    public String getName() { return name; }
    public String getCapacity() { return capacity; }
    public String getRestrictions() { return restrictions; }
    public double getLongitude() { return longitude; }
    public double getLatitude() { return latitude; }
    public String getAddress() { return address; }
    public String getNotes() { return notes; }
    public String getNumber() { return number; }

    public void setKey(int key) {
        this.key = key;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public void setRestrictions(String restrictions) {
        this.restrictions = restrictions;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
