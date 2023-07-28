package com.solvd.carina.mobile.constants;

public enum IosMessage {
    NOT_IMPLEMENTED("Ios screen is not implemented");

    String message;

    IosMessage(String s) {
        message = s;
    }

    public String getMessage() {
        return message;
    }
}
