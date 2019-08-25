package com.springbatch.helloworld.domain;

import java.util.Date;

public class CustomerCSVImportDto {

    public String firstName;
    public String lastName;
    public Date birthDate;

    @Override
    public String toString() {
        return "CustomerCSVImportDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
