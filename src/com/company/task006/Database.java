package com.company.task006;

import javax.xml.crypto.Data;
import java.util.Arrays;
import java.util.Iterator;

public class Database {
    // tworzymy tablice / obiekt Contact ktora bedzie zawierac wszystkie kontakty

    private Contact[] contacts;

    // modyfikujemy - dopytac !!!
    public Database(int size) {

        this.contacts = new Contact[size];
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    public boolean isDuplicate(Contact contact) {
        //Nie dopuszczaj do dodawania kontaktów o takim samym nazwisku czy telefonie
        int i=0;
       if (contact.getSurname().equals(contact)){
       }
       return true;
    }

        //dwqdwqdwqdwqdqwdqwdqwdqwmetoda addContact przyjmuje jako parametr obiekt Contact
        public void addContact(Contact contact){

        for (int i=0; i<contacts.length;i++){
            if (contacts[i]==null){
                contacts[i]=contact;
                break;
            }
        }}

    public void printContacts (){
        for (int i=0; i<=contacts.length-1;i++){
            if(contacts[i]!=null){
                System.out.println("Contact number: "+ i+"  " + contacts[i]);
            }
        }
    }
    @Override
    public String toString() {
        return "Database{" +
                "contacts=" + Arrays.toString(contacts) +
                '}';
    }


}
