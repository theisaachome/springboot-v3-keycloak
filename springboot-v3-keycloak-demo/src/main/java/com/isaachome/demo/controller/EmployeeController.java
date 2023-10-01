package com.isaachome.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @GetMapping
    @PreAuthorize("hasRole('client_user')")
    public String getAllEmployee(){
        return "Hello from Employees Resource =>Spring boot & Keycloak => Public User";
    }
    @GetMapping("/admin")
    @PreAuthorize("hasRole('client_admin')")
    public String getEmployee(){
        return "Hello from Employee Resource =>Spring boot & Keycloak => Admin User";
    }


}
