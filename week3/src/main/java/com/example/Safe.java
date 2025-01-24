package com.example;

import java.util.ArrayList;



public class Safe {

    private String pinCode;
    private ArrayList<String> safeFolder = new ArrayList<String>();
    
    public Safe(String pinCode) {
        this.pinCode = pinCode;
    }

    public Safe() {
        this.pinCode = "0000";
    }


    public String getPinCode(){
        return this.pinCode;
    }

    public void setPinCode(String newPin){
        this.pinCode = newPin;
    }
    

    public void addNumber(String data){
        this.safeFolder.add(data);
    }

    public void getFolder(){
        for (String safeFolder : safeFolder){
            System.out.println(safeFolder);
        }
        
    }

    
    
    }

    
