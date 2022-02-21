package model;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    public List<Patient> patients;

    public Hospital() {
        this.patients = new ArrayList<>();
    }

     public void findPatient(String name){

        for (int i = 0; i < patients.size(); i++){
            var patient = patients.get(i);
            if (patient.getName().equals(name)){
                patient.showPatient();
            }
        }

    }