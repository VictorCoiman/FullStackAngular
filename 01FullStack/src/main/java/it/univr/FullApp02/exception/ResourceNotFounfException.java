package it.univr.FullApp02.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFounfException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ResourceNotFounfException(String message) {
        super(message);
    }

}
