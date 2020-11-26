package com.labs.oop;
import java.util.Date;


public class Staff extends Person {
    protected Date joined;
    protected String[] education;
    protected String[] certification;
    protected String[] languages;

    public Staff(String title,
                 String givenName,
                 String middleName,
                 String familyName,
                 Date birthDate,
                 String Gender,
                 String homeAddress,
                 String phone,
                 Date joined,
                 String[] education,
                 String[] certification,
                 String[] languages) {
        super(title, givenName, middleName, familyName, birthDate, Gender, homeAddress, phone);
        this.joined = joined;
        this.education = education;
        this.certification = certification;
        this.languages = languages;

    }}

