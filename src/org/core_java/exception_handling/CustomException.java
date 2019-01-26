package org.core_java.exception_handling;

import java.io.IOException;

public class CustomException extends IOException {
    public CustomException(String message) {
        super(message);
    }
}
