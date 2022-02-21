import java.util.Date;
import java.util.*;
import java.text.*;
class Patient
{
    private String name;
    private int room;
    private String phoneNumber;
    
   
    private List<MedicalCondition> mcList;

    public Patient(String name) 
    {
        this.name = name;
        mcList = new ArrayList<MedicalCondition>();
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


   

    

