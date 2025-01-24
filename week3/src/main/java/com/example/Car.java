package com.example;

import java.util.Scanner;

public class Car {

    String make;
    String model;
    int speed;


    public Car(String a, String b, int c) {
        this.make = a;
        this.model = b;
        this.speed = c;
    }

    public void Status(){
        System.out.println("Auto: "+ make + " "+ model+", Nopeus: " + speed + " km/h" );
    }

    public void changeMakeAndModel (Scanner sc){
        

        System.out.print("Anna uusi auton merkki: ");
        this.make = sc.nextLine(); //scanneri luo muuttujan make joka ottaa sisään seuraavan inputin
  
        System.out.print("Anna uusi auton malli: ");
        this.model = sc.nextLine();
        
    }
        
    public void accelerate(Scanner sc){

        System.out.print("Kuinka monta km/h haluat kiihdyttää? ");

        int speedChange = Integer.parseInt(sc.nextLine());

        if (speedChange > 0) {
        this.speed += speedChange;
        }
        else{
            System.out.println("Nopeuden täytyy olla positiivinen luku.");
        }
    }

    public void decelerate(Scanner sc){

        System.out.print("Kuinka monta km/h haluat hidastaa? ");

        int speedChange = Integer.parseInt(sc.nextLine());

        if (speedChange > 0) {

            if (speedChange > this.speed){
                this.speed = 0;
            }
            else {
                this.speed -= speedChange;
            }
            
            }
        else{
            System.out.println("Nopeuden täytyy olla positiivinen luku.");
        }
    }

    
}