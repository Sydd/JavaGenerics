package com.company;

import java.util.LinkedList;

public class ManejoColecciones<T extends Comparable> {

    LinkedList<T> lista;

    public ManejoColecciones()
    {
        this.lista= new LinkedList<T>();
    }

    public void Add (T aux){
        this.lista.add(aux);
    }

    public boolean Existe (T aux){

        for ( T a : this.lista) {
            if (a.equals(aux)) {
                return true;
            }
        }

        return false;
    }

    public T DevolverMayor() {


        if (this.lista.size() == 1) {

            return this.lista.get(0);
        }

        if (this.lista.size() == 0) {

            return null;
        }

        T aux = this.lista.getFirst();

        for (int i = 1; i < lista.size(); i++) {

            if (aux.compareTo(this.lista.get(i)) < 0) {
                aux = this.lista.get(i);
            }
        }
        return aux;
    }

    public T DevolverMenor() {


        if (this.lista.size() == 1) {

            return this.lista.get(0);
        }

        if (this.lista.size() == 0) {

            return null;
        }

        T aux = this.lista.getFirst();

        for (int i = 1; i < lista.size(); i++) {

            if (aux.compareTo(this.lista.get(i)) > 0) {
                aux = this.lista.get(i);
            }
        }
        return aux;
    }

    public T DevolverUltimoYBorrarlo(){
        T aux = this.lista.getLast();

        this.lista.remove(this.lista.size() - 1);

        return aux;
    }



    //public T Mayor(T uno, T dos){
}