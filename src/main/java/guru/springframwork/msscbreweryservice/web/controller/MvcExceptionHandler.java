package guru.springframwork.msscbreweryservice.web.controller;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jan Oleksik (jan.oleksik@hycom.pl)
 */
@ControllerAdvice
public class MvcExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<List> validationErrorHandler(ConstraintViolationException ex){
        List<String> errorsList = new ArrayList<>(ex.getStackTrace().length);

        StackTraceElement[] stackTrace = ex.getStackTrace();
        for(int i=0;i<stackTrace.length;i++){
            errorsList.add(stackTrace[i].toString());
        }

        return new ResponseEntity<>(errorsList, HttpStatus.BAD_REQUEST);
    }

}