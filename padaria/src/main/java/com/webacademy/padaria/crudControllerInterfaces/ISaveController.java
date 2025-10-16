package com.webacademy.padaria.crudControllerInterfaces;

import org.springframework.http.ResponseEntity;

public interface ISaveController<T> {
    
    public ResponseEntity<T> insert(T objeto);
    public ResponseEntity<T> update(T objeto);
}
