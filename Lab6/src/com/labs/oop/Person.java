package com.labs.oop;
import java.util.Date;

public class Person{
    protected String title;
    protected String givenName;
    protected String middleName;
    protected String familyName;
    protected String fullName;
    protected Date birthDate;
    protected enum Gender {Male,Female};
    protected String homeAddress;
    protected String phone;

    public Person(String title, String givenName, String middleName, String familyName, Date birthDate, String Gender, String homeAddress, String phone){
        this.title = title;
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.fullName = givenName + middleName + familyName;
        this.birthDate = birthDate;
        this.homeAddress = homeAddress;
        this.phone = phone;

    }

}
