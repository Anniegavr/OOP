package com.labs.oop;
import java.time.LocalDate;
import java.util.Date;
import java.sql.Time;

public class Patient extends Person {
    protected Date accepted;
    protected String ID, sickness;
    protected String[] prescriptions;
    protected String[] allergies;
    protected String[] specialReqs;
    protected int age;

    public Patient(String title, String givenName, String middleName, String familyName, Date birthDate, String Gender,
                   String homeAddress, String phone,
                   Date accepted, String sickness, String[] prescriptions, String[] allergies, String[] specialReqs) {
        super(title,
                givenName,
                middleName,
                familyName,
                birthDate,
                Gender,
                homeAddress,
                phone);
        this.accepted = accepted;
        this.prescriptions = prescriptions;
        this.sickness = sickness;
        this.specialReqs = specialReqs;
        this.allergies = allergies;
    }

    public void setAge(String birthDate){
        LocalDate birthdate = new LocalDate(1970, 1, 20);
        LocalDate now = new LocalDate();
        Time.now age = Years.yearsBetween(birthdate, now);
    }
    public int getAge() {
        return age;
    }
}
