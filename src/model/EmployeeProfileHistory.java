/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author leonardodicaprio
 */
public class EmployeeProfileHistory {
    
    private ArrayList<EmployeeProfile> history;
    private EmployeeProfile currentPofile;
    
    public EmployeeProfileHistory(){
        this.history = new ArrayList<>();
    }

    public ArrayList<EmployeeProfile> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<EmployeeProfile> history) {
        this.history = history;
    }
    
    public EmployeeProfile addNewEmployee(EmployeeProfile newEmployee){
//        EmployeeProfile newEmployee = new EmployeeProfile();
        history.add(newEmployee);
        return newEmployee;
    }
    
    public void deleteEP(EmployeeProfile ep){
        history.remove(ep);
    }
    
    public EmployeeProfile createNewEmployee() {
        currentPofile = new EmployeeProfile();
        return currentPofile;
    }
    
    public EmployeeProfile getCurrentEmployeeProfile() {
        return currentPofile;
    }
}
