package com.example.commute;

class UserDetails {

    String name, id, bpt, dept;
    int year, routeno;
    boolean availability = true;

    void getDetails() {
        //get user details from database and populate the object
        this.name = "XYZ";
        this.id = "uID";
        this.bpt = "zzz";
        this.year = 1;
        this.routeno = 22;
    }

}
