package com.labs.oop;

import java.util.Date;

public class Technologist extends Technical_Staff{
    public Technologist(String title,
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
                        String[] languages){
        super(title, givenName, middleName, familyName, birthDate, Gender, homeAddress, phone, joined, education, certification, languages);
    }
}
