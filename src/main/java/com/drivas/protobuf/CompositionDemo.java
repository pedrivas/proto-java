package com.drivas.protobuf;

import com.drivas.models.Address;
import com.drivas.models.Car;
import com.drivas.models.Person;

import java.util.ArrayList;
import java.util.List;

public class CompositionDemo {

    public static void main(String[] args) {
        Address address = Address.newBuilder()
                .setCity("Cidade")
                .setPostbox(123)
                .setStreet("Street")
                .build();

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

        List<Car> cars = new ArrayList<Car>();
        cars.add(accord);
        cars.add(civic);

        Person sam = Person.newBuilder()
                .setName("Sam")
                .setAge(25)
                .addAllCar(cars)
                .setAddress(address)
                .build();

        System.out.println(sam);
    }
}
