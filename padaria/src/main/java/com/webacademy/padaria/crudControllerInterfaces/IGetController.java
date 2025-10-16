package com.webacademy.padaria.crudControllerInterfaces;

import org.springframework.http.ResponseEntity;

public interface IGetController<T> {
    
    public ResponseEntity<T> get();
}
