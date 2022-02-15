package model;

import java.util.ArrayList;

class Room {
    int size;
    String department;
    ArrayList<Equipment> equipmentList;

    public Room (int size, String department) {
        this.size = size;
        this.department = department;
        equipmentList = new ArrayList<>();
    }
}