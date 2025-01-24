package com.example;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // luodaan scanneri

        System.out.print("Anna auton merkki: ");
        String make = sc.nextLine(); //scanneri luo muuttujan make joka ottaa sisään seuraavan inputin

        System.out.print("Anna auton malli: ");
        String model = sc.nextLine();
        
        int speed = 0;

        Car newCar = null;
        newCar = new Car(make, model, speed); // ennen looppisa




        boolean exit = false;
        while(!exit){
            System.out.println("1) Näytä auton tila\r\n" + //
                                "2) Muokkaa auton merkkiä ja mallia\r\n" + //
                                "3) Kiihdytä autoa\r\n" + //
                                "4) Hidasta autoa\r\n" + //
                                "0) Lopeta ohjelma");

            if(sc.hasNext()){
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                

                switch(i) {
                    case 1:
                    
                    newCar.Status();
                    break;

                    case 2:
                    newCar.changeMakeAndModel(sc);
                    break;

                    case 3:
                    newCar.accelerate(sc);
                    break;

                    case 4:
                    newCar.decelerate(sc);
                    break;

                    case 0:
                    exit = true;
                    System.out.println("Kiitos ohjelman käytöstä.");
                    break;

                    default:
                    System.out.println("syöte oli väärä.");
                    break;
                }
            }
        }
    }
}