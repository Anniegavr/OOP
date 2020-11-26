package com.labs.oop;

import java.util.Date;

public class Technical_Staff extends Staff{
    public Technical_Staff(String title,
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
        super(title, givenName, middleName, familyName, birthDate, homeAddress, phone, Gender, joined, education, certification, languages);
    }
}
