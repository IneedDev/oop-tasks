package com.company.task007;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    //method which starts menu


    public void menu(){
        Database database = new Database(10);
        int caseNumber=0;
        //run while loop until caseNumber == 4
        //if caseNumber is 1 means that 1!=4 what is true - continue while
        while(caseNumber!=4){
            System.out.println("1. Add Expense");
            System.out.println("2. Add Income");
            System.out.println("3. Calculate income tax");
            System.out.println("Twoj wybór to: ");
            caseNumber=scanner.nextInt();

            switch(caseNumber){
                case 1:
                    System.out.println("Add Expense");
                    String name=scanner.nextLine();
                    //Integer brutto=scanner.nextInt();
//                    String casenumbers666 = scanner.nextLine();
//                    int brutto = Integer.parseInt(casenumbers666);
//                    Integer vat=scanner.nextInt();
                    // we need to create new object - expense based on constructor parameters
                    Expense expense = new Expense(name,150,5487);
                    database.addExpense(expense);

                    break;
                case 2:
                    System.out.println("Add Income");

                    break;
                case 3:
                    System.out.println("Calculate income tax");

                    break;
                case 4:
                    System.out.println("App is closed");

                    return;
                default:
                    System.out.println("input out of scope");

                    break;
            }
        }
    }




//    7.  Utwórz aplikację kalkulatora podatkowego, która przywita usera ładnym menu, gdzie można wybrać:
//        1) Dodaj koszt
//        2) Dodaj Zarobek
//        3) Wylicz podatek dochodowy i vat dla warunków ogólnych.
//
// Dodaj koszt pobiera od użytkownika nazwę kosztu, kwotę brutto  i stawkę vat.
// Dodaj zarobek pobiera od użytkownika kwotę brutto i vat.


//    Wylicz podatek dochodowy i vat wylicza podatek dochody na zasadach ogólnych (suma zarobków netto - suma dochodów netto  * 0.18) .
//    Suma vat wylicza vat należny na podstawie: suma całego vatu - vat kosztów. Komunikat: Podatek dochodowy wynosi x zł, a vat do zapłacenia (lub nie): xx zł.


}