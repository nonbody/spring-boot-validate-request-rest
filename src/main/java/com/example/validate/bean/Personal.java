package com.example.validate.bean;


import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class Personal {
    @NotNull(message = "must not null")
    @NotEmpty(message = "must not empty")
    @Pattern(regexp = "[a-zA-Z0-9ก-๙]{1,5}", message = "invalid format")
    private String fname;
    private String lname;
}
