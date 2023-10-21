package com.mycompany.peluqueria;

import javax.swing.JOptionPane;

public abstract class Persona {

    protected String nombre;
    protected String apellido;
    protected int edad;
    protected double peso;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public abstract double cambiarNombre1();

    public abstract double cambiarNombre2();

    public abstract double cambiarNombre3();

    public abstract double cambiarNombre4();

    public abstract double calcularCorteCaballero();

    public abstract double calcularCorteDama();

    public abstract double calcularTintura();

    public abstract double calcularPeinado();
}
