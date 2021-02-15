package br.com.rodolfoperatello.todolist.exceptions;

import br.com.rodolfoperatello.todolist.controller.response.ErrorResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class RestExceptionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(RestExceptionHandler.class);

    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public ErrorResponse handleGenericException(final Exception exception) {
        LOG.error("Exception", exception);
        return new ErrorResponse();
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    public ErrorResponse handleNotFoundException(final NotFoundException exception) {
        LOG.error("NotFoundException", exception);
        return new ErrorResponse(exception.getLocalizedMessage(), exception.getClass().getName());
    }

//    @ResponseBody
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    @ExceptionHandler(Exception.class)
//    public ErrorResponse handleGenericException(final Exception exception) {
//        return new ErrorResponse(exception.getLocalizedMessage(), exception.getClass().getSimpleName());
//    }
}
