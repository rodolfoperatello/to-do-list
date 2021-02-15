package br.com.rodolfoperatello.todolist.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorResponse {

    private static final String DEFAULT_ERROR_DESCRIPTION = "Ocorreu um erro durante o processamento";
    private static final String DEFAULT_ERROR_CODE = "ServiceException";

    @JsonProperty("error_description")
    private final String errorDescription;
    @JsonProperty("error")
    private final String errorCode;

    public ErrorResponse() {
        errorDescription = DEFAULT_ERROR_DESCRIPTION;
        errorCode = DEFAULT_ERROR_CODE;
    }

    public ErrorResponse(String errorDescription, String errorCode) {
        this.errorDescription = errorDescription;
        this.errorCode = errorCode;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
