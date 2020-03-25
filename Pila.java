package com.company;

public class Pila<T> {

    public Nodo<T> Head;

    public Pila(){
        Head = null;
    }

    public String Push(T toPush){
        if (Head == null){
            Head = new Nodo<T>(toPush);
            return "La lista esta vacia, se agrego como punta el objeto." ;
        } else {
            Head = new Nodo<T>(toPush,Head);
            return "Se agrego a la lista el objeto." ;
        }
    }

    public String Pop() {
        if (Head == null) {
            return "La lista esta vacia";
        } else {
            Head = Head.getSiguiente();
            return "Se borro la cabeza";
            //Se borra al perderse la referencia?
        }

    }
    public String Remove (T toRemove){

       Nodo actual = Head.getSiguiente();

       Nodo anterior = Head;

       if (anterior == null)
           return "La lista esta vacia.";

       if (anterior.getElemento().equals((toRemove))){
            Head = actual;

            // Se borra el que tenia referido ????

            return "se borro el objeto";
       }

        while (actual != null){

            if (actual.getElemento().equals(toRemove)){

                if (actual.getSiguiente() != null){
                    anterior.setSiguiente(actual.siguiente);

                }
                return "se borro el objeto!";
            } else {
                anterior = actual;
                actual = actual.getSiguiente();
            }
        }
        return "No se encontro el elemento";
    }

    public int Size(){
        int count = 0;
        Nodo aux = Head;
        while (aux != null){
            count++;
            aux = aux.getSiguiente();
        }
        return count;
    }


}
