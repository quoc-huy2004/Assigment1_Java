package Entities;

import java.util.Date;

public class Person {
    private int id;
    private String fullName;
    private Date dateOfBirth;
    private String contact;

    public Person(int id, String fullName, Date dateOfBirth, String contact) {
        this.id = id;
        this.fullName= fullName;
        this.dateOfBirth = dateOfBirth;
        this.contact = contact;
    }


    // Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
