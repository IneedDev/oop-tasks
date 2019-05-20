package com.company.task006a;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public void menu(){
        Database database = new Database(10);
        int action=0;

        while (action!=4){

            System.out.println("1. Add contact");
            System.out.println("2. Print contacts");
            System.out.println("3. Remove contacts by surname");
            System.out.println("4. Exit");
            String caseNumbers = scanner.next();
            int caseNumber = Integer.parseInt(caseNumbers);

            switch (caseNumber){
                case 1:
                    System.out.println("1");
                    System.out.println("Give name");
                    String name = scanner.next();
                    System.out.println("Give surname");
                    String surname = scanner.next();
                    System.out.println("Give number");
                    String number = scanner.next();
                    System.out.println("Give gender");
                    String gender = scanner.next();
                    Contact contact = new Contact(name, surname, number,gender);
                    database.addContact(contact);
                    break;
                case 2:
                    System.out.println("2");
                    database.printContacst();
                    break;
                case 3:
                    System.out.println("Remove contact by surname");
                    System.out.println("Give surname");
                    String surname2 = scanner.next();
                    database.removeBySurname(surname2);
                    System.out.println("Contact with surname: "+surname2 + "is removed");
                    break;
                case 4:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Not correct input");
                    break;
            }
        }


    }


}