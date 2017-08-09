package com.example.starwarsdatabankapi.util;

public class StarwarsdatabankapiException extends Exception {
    public StarwarsdatabankapiException() {
        super();
    }

    public StarwarsdatabankapiException(String message) {
        super(message);
    }

    public StarwarsdatabankapiException(String message, Throwable cause) {
        super(message, cause);
    }

    protected StarwarsdatabankapiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public StarwarsdatabankapiException(Throwable cause) {
        super(cause);
    }
}
