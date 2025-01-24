package com.example;

import java.util.ArrayList;



public class Safe {

    private String pinCode;
    private ArrayList<String> safeFolder = new ArrayList<String>();
    
    public Safe() {
        this.pinCode = "0000";
    }




    public String GetPinCode(){
        return this.pinCode;
    }

    public void SetPinCode(String newPin){
        this.pinCode = newPin;
    }
    

    public void AddNumber(String data){
        this.safeFolder.add(data);
    }

    public void GetFolder(){
        for (String safeFolder : safeFolder){
            System.out.println(safeFolder);
        }
        
    }

    
    
    }

    
