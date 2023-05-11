package com.mycompany.trabajo.service;

import com.mycompany.trabajo.model.Persona;
import java.util.ArrayList;
import java.util.List;

// Implementa el servicio dedicado a las personas dispuestos.
public class PersonaServiceImp implements PersonaService{
    
    // Simula la persistencia de datos.
    private List<Persona> personas = new ArrayList<>();

    @Override
    public void save(Persona persona) {
        personas.add(persona);
    }

    @Override
    public void delete(Persona persona) {
        personas.remove(persona);
    }

    @Override
    public List<Persona> findAll() {
        return personas;
    }
    
}
