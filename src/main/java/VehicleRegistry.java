/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MimiHMB
 */

import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> directory;
    
    public VehicleRegistry() {
        this.directory = new HashMap();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (!(this.directory.containsKey(licensePlate))) {
            this.directory.put(licensePlate, owner);
            return true;
        } else {
            return false;
        }
    }
    
    public String get(LicensePlate licensePlate) {
        return this.directory.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (this.directory.containsKey(licensePlate)) {
            this.directory.remove(licensePlate);
            return true;
        } else {
            return false;
        }
    }
    
    public void printLicensePlates() {
        for (LicensePlate i: this.directory.keySet()) {
            System.out.println(i);
        }
    }
    
    public void printOwners() {
        ArrayList<String> list = new ArrayList();
        for (String i: this.directory.values()) {
            if (!(list.contains(i))) {
                System.out.println(i);
                list.add(i);
            }
        }
    }
}
