package io.fdlessard.codebites.i18n.controllers;


import io.fdlessard.codebites.i18n.domain.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
public class CustomerController {

    @PostMapping(path = "/customer", consumes = "application/json", produces = "application/json")
    public void createCustomer(@Valid @RequestBody Customer customer) {
        log.info("CustomerController.createCustomer({})", customer);
    }
}
