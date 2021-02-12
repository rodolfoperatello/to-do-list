package br.com.rodolfoperatello.todolist.controller.request;

import javax.validation.constraints.NotBlank;

public class UserRequest {

    @NotBlank(message = "First name cannot be null or blank")
    private String firstName;
    @NotBlank(message = "Last name cannot be null or blank")
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
