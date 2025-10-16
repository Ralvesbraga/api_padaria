package com.webacademy.padaria.crudControllerInterfaces;

import org.springframework.http.ResponseEntity;

public interface IDeleteController {
    
    public ResponseEntity<Void> delete(Long id);
}
