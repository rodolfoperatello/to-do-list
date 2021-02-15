package br.com.rodolfoperatello.todolist.controller.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class TaskRequest {

    @NotBlank(message = "Description cannot be null or blank")
    private String description;
    @NotBlank(message = "Tag cannot be null or blank")
    private String tag;
    @NotNull(message = "Date cannot be null")
    private String date;
    @NotBlank(message = "User ID cannot be null or blank")
    @Min(value = 1, message = "Id cannot be less then one")
    private Long userId;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}

