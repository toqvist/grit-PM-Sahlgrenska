package model;

import java.util.Date;
import java.util.*;
import java.text.*;
public class Patient
{
    private String name;
    private int room;
    private String phoneNumber;

    private String personalID;
    
    private List<String> notes;
   
    private List<MedicalCondition> mcList;

    public Patient(String name, String personalID) 
    {
        this.name = name;
        this.personalID = personalID;

        mcList = new ArrayList<MedicalCondition>();
        notes = new ArrayList<String>();
    }  

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }


    public void showPatient() {
        System.out.println("Name: " + name);
        System.out.println("Room: " + room);
        System.out.println("Phone number: " + phoneNumber);
    }

    public void addNote(String note) {
        notes.add(note);

    }
}

   

    

