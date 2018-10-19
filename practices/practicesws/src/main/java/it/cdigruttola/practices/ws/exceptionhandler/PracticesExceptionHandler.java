package it.cdigruttola.practices.ws.exceptionhandler;

import it.cdigruttola.practices.facade.dto.ErrorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.persistence.EntityNotFoundException;

@RestControllerAdvice
public class PracticesExceptionHandler extends ResponseEntityExceptionHandler {

    @Autowired
    private MessageSourceAccessor messageSourceAccessor;

    @ExceptionHandler(value = EntityNotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ErrorDTO handleEntityNotFoundException(Exception ex) {
        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setDefaultMessage(messageSourceAccessor.getMessage(ex.getMessage()));
        return errorDTO;
    }

    @ExceptionHandler(value = DataIntegrityViolationException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ErrorDTO handleDataIntegrityViolationException(Exception ex) {
        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setDefaultMessage(ex.getMessage());
        return errorDTO;
    }
}
