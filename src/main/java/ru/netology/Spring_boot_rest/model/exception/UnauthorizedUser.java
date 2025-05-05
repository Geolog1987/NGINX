package ru.netology.Spring_boot_rest.model.exception;

public class UnauthorizedUser extends RuntimeException{

    public UnauthorizedUser(String msg) {
        super(msg);
    }
}
