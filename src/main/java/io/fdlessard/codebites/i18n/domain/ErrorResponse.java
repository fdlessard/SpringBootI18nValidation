package io.fdlessard.codebites.i18n.domain;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class ErrorResponse implements Serializable {

    private int status;
    private String code;
    private String message;
}
