package com.company.task006a;

import java.util.Objects;

public class Contact {

    private String name;
    private String surname;
    private String number;
    private String gender;

    public Contact(String name, String surname, String number, String gender) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) &&
                Objects.equals(surname, contact.surname) &&
                Objects.equals(number, contact.number) &&
                Objects.equals(gender, contact.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, number, gender);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", number='" + number + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}