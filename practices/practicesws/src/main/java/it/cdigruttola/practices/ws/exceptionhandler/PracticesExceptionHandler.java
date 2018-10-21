package it.cdigruttola.practices.ws.exceptionhandler;

import it.cdigruttola.practices.facade.dto.ErrorDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.persistence.EntityNotFoundException;

import static it.cdigruttola.practices.ws.configuration.PracticeWsConstant.*;

@RestControllerAdvice
public class PracticesExceptionHandler extends ResponseEntityExceptionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(PracticesExceptionHandler.class);

    @Autowired
    private MessageSourceAccessor messageSourceAccessor;

    @ExceptionHandler(value = {EntityNotFoundException.class, EmptyResultDataAccessException.class})
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ErrorDTO handleEntityNotFoundException(Exception ex) {
        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setDefaultMessage(messageSourceAccessor.getMessage(ENTITY_NOT_FOUND.getValue()));
        return errorDTO;
    }

    @ExceptionHandler(value = DataIntegrityViolationException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ErrorDTO handleDataIntegrityViolationException(Exception ex) {
        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setDefaultMessage(ex.getMessage());
        LOG.error(ex.getMessage(), ex);
        return errorDTO;
    }

    @ExceptionHandler(value = IllegalArgumentException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ErrorDTO handleIllegalArgumentException(Exception ex) {
        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setDefaultMessage(messageSourceAccessor.getMessage(ILLEGAL_ARGUMENT.getValue()));
        LOG.error(ex.getMessage(), ex);
        return errorDTO;
    }
}
