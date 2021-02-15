package br.com.rodolfoperatello.todolist.exceptions;

import br.com.rodolfoperatello.todolist.model.ErrorMessages;

public class ServiceException extends Exception {

    private final ErrorMessages errorMessages;

    public ServiceException() {
        errorMessages = ErrorMessages.GENERIC_EXCEPTION;
    }

    public ServiceException(final ErrorMessages error) {
        errorMessages = error;
    }

    public ServiceException(final ErrorMessages error, final Exception aCause) {
        super(aCause);
        errorMessages = error;
    }

    @Override
    public String getLocalizedMessage() {
        return super.getLocalizedMessage();
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public ErrorMessages getErrorMessages() {
        return errorMessages;
    }
}
