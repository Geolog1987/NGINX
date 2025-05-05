package ru.netology.Spring_boot_rest.model.exception;

public class InvalidCredentials extends RuntimeException{

    public InvalidCredentials(String msg) {
        super(msg);
    }
}
