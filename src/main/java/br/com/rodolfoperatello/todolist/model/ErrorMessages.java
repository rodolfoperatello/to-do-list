package br.com.rodolfoperatello.todolist.model;

import java.util.ResourceBundle;

public class ErrorMessages {

    public static final String DEFAULT_RESSOURCE = "messages.erros.resources";
    public static final ErrorMessages GENERIC_EXCEPTION = new ErrorMessages("generic");
    public static final ErrorMessages BAD_REQUEST = new ErrorMessages("badRequest");
    public static final ErrorMessages UNAUTHORIZED = new ErrorMessages("unauthorized");
    public static final ErrorMessages NOT_FOUND = new ErrorMessages("notFound");
    public static final ErrorMessages FORBIDDEN = new ErrorMessages("forbidden");

    private final int messageID;
    private final String key;

    protected ErrorMessages(final String aKey){
        messageID = 0;
        key = aKey;
    }

    protected ErrorMessages(final int aMessageID, final String aKey){
        messageID = aMessageID;
        key = aKey;
    }

    public int getMessageID() {
        return messageID;
    }

    public String getKey() {
        return key;
    }

    protected String tryGetMessageFromBundle(){
        if(getResource().containsKey(getKey())){
            return getResource().getString(getKey());
        }
        return ResourceBundle.getBundle(DEFAULT_RESSOURCE).getString(getKey());
    }

    public ResourceBundle getResource(){
        return ResourceBundle.getBundle(DEFAULT_RESSOURCE);
    }
}

