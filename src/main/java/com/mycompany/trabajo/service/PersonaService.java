package com.mycompany.trabajo.service;

import java.util.List;
import com.mycompany.trabajo.model.Persona;

// Interfaz usada para describir los métodos del servicio dispuestos para la "persistencia" de datos.
public interface PersonaService {
    
    void save(Persona persona);
    void delete(Persona persona);
    List<Persona> findAll();
    
}
