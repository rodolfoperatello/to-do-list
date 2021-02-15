package br.com.rodolfoperatello.todolist.exceptions;

import br.com.rodolfoperatello.todolist.model.ErrorMessages;

public class InternalServerError extends ServiceException {

    public InternalServerError(final ErrorMessages error) {
        super(error);
    }

    public InternalServerError(final ErrorMessages error, final Exception aCause){
        super(error, aCause);
    }
}
