package com.company.task006;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);


    public void menu(){
        Database database = new Database(10);
        int caseNumbers=0;
        //while will exit if caseNumber = 4
        while (caseNumbers!=4){
            System.out.println("1. Dodaj kontakt");
            System.out.println("2. Zobacz wszystkie kontakty");
            System.out.println("3. Usuń kontakt po nazwisku");
            System.out.println("4. Zamknij program");
            System.out.println("Twój wybór to ");
            String casenumbers666 = scanner.nextLine();
            int caseNumber = Integer.parseInt(casenumbers666);
            switch (caseNumber){
                case 1:
                    System.out.println("addContact Method");
                    System.out.println("give name");
                    String name = scanner.nextLine();
                    System.out.println("give surname");
                    String surname = scanner.nextLine();
                    System.out.println("give number");
                    String number = scanner.nextLine();
                    Contact contact = new Contact(name,surname,number);
                    database.addContact(contact);
                    break;
                case 2:
                    System.out.println("Zobacz wszystkie kontakty");
                    database.printContacts();
                    break;
                case 3:
                    System.out.println("Usuń klontakt po nazwisku");
                    break;
                case 4:
                    System.out.println("Zamknij menu");
                    return;
                default :
                    System.out.println("Niepoprawny input");
                    break;
            }

        }
    }


}