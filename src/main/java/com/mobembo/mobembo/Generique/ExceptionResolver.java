package com.mobembo.mobembo.Generique;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ExceptionResolver extends RuntimeException {
    public ExceptionResolver() {
        super();
    }
    public ExceptionResolver(String message, Throwable cause) {
        super(message, cause);
    }
    public ExceptionResolver(String message) {
        super(message);
    }
    public ExceptionResolver(Throwable cause) {
        super(cause);
    }
}
