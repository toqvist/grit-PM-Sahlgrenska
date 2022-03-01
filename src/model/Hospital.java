package model;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    public List<Patient> patients;
    private List<Employee> employees;

    public Hospital() {
        this.patients = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String name, String lastName, String password, Integer workhours, String profession){
        employees.add(new Employee(name,lastName,password,workhours,profession));

    }

     public void findPatient(String name){

        for (int i = 0; i < patients.size(); i++){
            var patient = patients.get(i);
            if (patient.getName().equals(name)){
                patient.showPatient();
            }
        }

    }

    public Patient getPatient(String name){

        for (int i = 0; i < patients.size(); i++){
            var patient = patients.get(i);
            if (patient.getName().equals(name)){
                return patient;
            }
        }
        System.out.println("Patient not found");
        return null;
    }

    public void addPatient (String name, String personalID) {
        patients.add(new Patient(name, personalID));
    }

}