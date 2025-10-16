package com.webacademy.padaria.crudServiceInterfaces;

import java.util.List;

public interface IGetService<T> {
    
    public T get(Long id);
    public List<T> get();
}
