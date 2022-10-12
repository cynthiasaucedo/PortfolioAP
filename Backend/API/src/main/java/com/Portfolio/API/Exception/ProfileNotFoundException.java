package com.Portfolio.API.Exception;

public class ProfileNotFoundException extends RuntimeException {
    public ProfileNotFoundException(String message){
        super(message);
    }
}
