package io.fdlessard.codebites.i18n.domain;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer implements Serializable {

    private String id;

    @NotNull
    private String firstName;

    @NotNull(message = "{customerController.lastName.notNull}")
    private String lastName;

    private String company;
}