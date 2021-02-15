package br.com.rodolfoperatello.todolist.exceptions;

import br.com.rodolfoperatello.todolist.model.ErrorMessages;

public class NotFoundException extends ServiceException {

    public NotFoundException(final ErrorMessages error) {
        super(error);
    }

    public NotFoundException(final ErrorMessages error, final Exception aCause){
        super(error, aCause);
    }
}
