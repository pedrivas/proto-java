package com.drivas.protobuf;

import com.drivas.models.Credentials;
import com.drivas.models.EmailCredentials;
import com.drivas.models.PhoneOTP;

public class OneOfDemo {

    public static void main(String[] args) {

        EmailCredentials emailCredentials = EmailCredentials.newBuilder()
                .setEmail("nobody@gmail.com")
                .setPassword("admin123")
                .build();

        PhoneOTP phoneOTP = PhoneOTP.newBuilder()
                .setNumber(645645645)
                .setCode(6565)
                .build();

        Credentials credentials = Credentials.newBuilder()
                .setEmailMode(emailCredentials)
                .setPhoneMode(phoneOTP)
                .build();

        login(credentials);

    }

    private static void login(Credentials credentials){
        switch (credentials.getModeCase()){
            case EMAILMODE:
                System.out.println(credentials.getEmailMode());
                break;
            case PHONEMODE:
                System.out.println(credentials.getPhoneMode());
                break;
        }
    }
}
