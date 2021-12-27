package com.drivas.protobuf;

import com.drivas.models.Car;
import com.drivas.models.Person;

public class DefaultValueDemo {

    public static void main(String[] args) {
        Person person =  Person.newBuilder().build();

        System.out.println(
                "City: " + person.getAddress().getCity()
        );
        Car civic = Car.newBuilder()
                .setMake("Honda")
                .setModel("Civic")
                .setYear(2001)
                .build();

        Car accord = Car.newBuilder()
                .setMake("Honda")
                .setModel("Accord")
                .setYear(2011)
                .build();
    }
}
