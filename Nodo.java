package com.company;

public class Nodo<T> {

    T elemento;
    Nodo<T> siguiente;

    public Nodo(T elemento) {
        this.elemento = elemento;
    }

    public Nodo(T elemento, Nodo<T> Siguiente) {
        this.elemento = elemento;
        siguiente = Siguiente;
    }

    public T getElemento() {
        return elemento;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> sig){
        this.siguiente = sig;
    }
}

