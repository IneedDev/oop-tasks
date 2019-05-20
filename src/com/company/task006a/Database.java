package com.company.task006a;

import java.util.Arrays;

public class Database {

    private Contact[] contacts;

    public Database(int size) {
        this.contacts = new Contact[size]; // define max size of Database array of contacts
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    public void removeBySurname (String surname){
        for (int i=0; i<contacts.length;i++){
            if(contacts[i]!=null && contacts[i].getSurname().equals(surname)){
                contacts[i]=null;
            }
        }
    }

    public boolean isduplicate(Contact contact){
        for (int i=0; i<contacts.length;i++){
            if (contacts[i]!=null && (contacts[i].getSurname().equals(contact.getSurname())||
                    contacts[i].getNumber().equals(contact.getNumber()))){
                return false;
            }
        }return true;
    }

    public void addContact (Contact contact){
        if (!isduplicate(contact)){
            return;
        }

        for (int i=0; i<contacts.length;i++){
            if (contacts[i]==null){
                contacts[i]=contact;
                break;
            }
        }
    }

    public void printContacst(){
        for (int i=0;i<contacts.length;i++){
            if (contacts[i]!=null){
                System.out.println("Contact number: "+ i + " "+ contacts[i]);
            }
        }
    }
}