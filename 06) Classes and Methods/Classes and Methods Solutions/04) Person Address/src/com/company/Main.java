package com.company;

class PersonAddress {
    private String firstName;
    private String lastName;
    private String email;
    private String telephoneNumber;

    PersonAddress(String firstName, String lastName, String email, String telephoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public boolean isEqual(PersonAddress name) {
        return this.firstName.equals(name.firstName) && this.lastName.equals(name.lastName);
    }
}

public class Main {

    public static void main(String[] args) {
        PersonAddress person1 = new PersonAddress("Mahmoud", "Abas", "mahmoud@outlook.com", "0184471251");
        PersonAddress person2 = new PersonAddress("Mahmoud", "Abas", "mahmoud@outlook.com", "0184471251");
        PersonAddress person3 = new PersonAddress("Mohammed", "Abas", "mahmoud@outlook.com", "0184471251");
        System.out.println(person1.isEqual(person2));
        System.out.println(person1.isEqual(person3));
    }
}
