package com.mycompany.trabajo.model;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.chrono.ChronoLocalDateTime;

// Clase entidad para personas.
public class Persona {
    
    private String nombre;
    private LocalDateTime dob;
    private int edad;
    private String sZodiacal;
    
    public Persona(String nombre, LocalDateTime dob){
        this .nombre = nombre;
        System.err.println(dob.toString());
        this.dob = dob;
        calcularEdad();
        calcularSigno();
    }
    
    void calcularEdad(){
        LocalDateTime fActual = LocalDateTime.now();
        edad = dob.minus(
                Period.of(
                        fActual.getYear(),
                        fActual.getMonthValue(), 
                        fActual.getDayOfMonth())
        ).getYear() * (-1);
    }

   void calcularSigno(){
        if(isAfter(Month.JANUARY, 19) && isBefore(Month.FEBRUARY, 19))
            sZodiacal = "ACUARIO";
        else if (isAfter(Month.FEBRUARY, 18) && isBefore(Month.MARCH, 21))
            sZodiacal = "PISCIS";
        else if (isAfter(Month.MARCH, 20) && isBefore(Month.APRIL, 20))
            sZodiacal = "ARIES";
        else if (isAfter(Month.APRIL, 19) && isBefore(Month.MAY, 21))
            sZodiacal = "TAURO";
        else if (isAfter(Month.MAY, 20) && isBefore(Month.JUNE, 20))
            sZodiacal = "GEMINIS";
        else if (isAfter(Month.JUNE, 19) && isBefore(Month.JULY, 21))
            sZodiacal = "CANCER";
        else if (isAfter(Month.JULY, 20) && isBefore(Month.AUGUST, 20))
            sZodiacal = "LEO";
        else if (isAfter(Month.AUGUST, 19) && isBefore(Month.SEPTEMBER, 21))
            sZodiacal = "VIRGO";
        else if (isAfter(Month.SEPTEMBER, 20) && isBefore(Month.OCTOBER, 20))
            sZodiacal = "LIBRA";
        else if (isAfter(Month.OCTOBER, 19) && isBefore(Month.NOVEMBER, 21))
            sZodiacal = "ESCORPIO";
        else if (isAfter(Month.NOVEMBER, 20) && isBefore(Month.DECEMBER, 20))
            sZodiacal = "SAGITARIO";
        else 
            sZodiacal= "CAPRICORNIO";
    }
    
   // Este método se usa para verificar si una fecha es despues que otra
    private Boolean isAfter(Month mes, int day){
        return dob.isAfter(ChronoLocalDateTime.from(LocalDateTime.of(dob.getYear(), mes, day,0,0)));
    }
    
    // Este método se usa para verificar si una fecha es antes que otra
    private Boolean isBefore(Month mes, int day){
        return dob.isBefore(ChronoLocalDateTime.from(LocalDateTime.of(dob.getYear(), mes, day,0,0)));
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDob(LocalDateTime dob) {
        this.dob = dob;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setsZodiacal(String sZodiacal) {
        this.sZodiacal = sZodiacal;
    }
    

    public String getNombre() {
        return nombre;
    }

    public LocalDateTime getDob() {
        return dob;
    }

    public int getEdad() {
        return edad;
    }

    public String getsZodiacal() {
        return sZodiacal;
    }  
}
