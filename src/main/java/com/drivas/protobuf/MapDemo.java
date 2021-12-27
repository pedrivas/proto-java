package com.drivas.protobuf;

import com.drivas.models.BodyStyle;
import com.drivas.models.Car;
import com.drivas.models.Dealer;

public class MapDemo {

    public static void main(String[] args) {
        Car civic = Car.newBuilder()
                .setMake("Honda")
                .setModel("Civic")
                .setBodyStyle(BodyStyle.SEDAN)
                .setYear(2001)
                .build();

        Car accord = Car.newBuilder()
                .setMake("Honda")
                .setModel("Accord")
                .setBodyStyle(BodyStyle.COUPE)
                .setYear(2011)
                .build();

        Dealer dealer = Dealer.newBuilder()
                .putModel(1, civic)
                .putModel(2, accord)
                .build();

        System.out.println(
                dealer.getModelOrThrow(2).getBodyStyle()
        );
    }
}
