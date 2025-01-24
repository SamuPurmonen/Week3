package com.example;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // luodaan scanneri

         
        

        //  Safe newSafe = null;
        //  newSafe = new Safe(pinCode, safeFolder);   tämä sama onnistuu alla olevalla

        Safe newSafe = new Safe();


        boolean exit = false;
        while(!exit){
            System.out.println("1) Aseta PIN-koodi" + '\n' + "2) Lisää tietoja kansioon"+'\n'+ "3) Listaa tiedot kansiosta"+ '\n'+ "0) Lopeta ohjelma");

            if(sc.hasNext()){
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                

                switch(i) {
                    case 1:
                    System.out.println("Anna PIN-koodi: ");
                    String newPincode = sc.nextLine();
                    newSafe.SetPinCode(newPincode);
                    break;

                    case 2:
                    System.out.println("Anna kansioon lisättävä tieto: ");
                    String addedData = sc.nextLine();
                    newSafe.AddNumber(addedData);
                    break;

                    case 3:
                    System.out.println("Anna PIN-koodi: ");
                    String koodi = sc.nextLine();
                    if (koodi.equals(newSafe.GetPinCode()) ){
                        newSafe.GetFolder();
                    }
                    else {
                        System.out.println("Väärä PIN-koodi!");
                    }
                    
                    break;

                    case 4:
                    
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