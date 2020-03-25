package com.company;
import java.util.*;

public class Main {

    public  static void main(String[] args) {

            AplicacionEjercicio1();

            AplicacionEjercicio2();

            AplicacionEjercicio3();
        }

        static void AplicacionEjercicio1(){

            Persona per0 = new Persona("Maria","Elena", 12 , 32234534);
            Persona per1 = new Persona("Jose","ff", 54 , 1231234);

            Persona per2 = new Persona("Luz","Elena", 456 , 32234534);
            Persona per3 = new Persona("Niem","ff", 30 , 1231234);
            Persona per4 = new Persona("Troncos","Elena", 500 , 32234534);
            Persona per5 = new Persona("Bobafet","ff", 1 , 1231234);

            ManejoColecciones<Persona>  manejoPersonas= new ManejoColecciones<Persona>();

            manejoPersonas.Add(per0);
            manejoPersonas.Add(per1);
            manejoPersonas.Add(per2);
            manejoPersonas.Add(per4);
            manejoPersonas.Add(per5);

            System.out.println("La persona mas grande es: " + manejoPersonas.DevolverMayor().getNombre());
            System.out.println("La persona mas Chica es: " + manejoPersonas.DevolverMenor().getNombre());
        }

        static void AplicacionEjercicio2()
        {
            Persona per0 = new Persona("Maria","Elena", 12 , 32234534);
            Persona per1 = new Persona("Jose","ff", 54 , 1231234);

            Persona per2 = new Persona("Luz","Elena", 456 , 32234534);
            Persona per3 = new Persona("Niem","ff", 30 , 1231234);
            Persona per4 = new Persona("Troncos","Elena", 500 , 32234534);
            Persona per5 = new Persona("Bobafet","ff", 1 , 1231234);

            ManejoColecciones<Persona>  manejoPersonas= new ManejoColecciones<Persona>();

            manejoPersonas.Add(per0);
            manejoPersonas.Add(per1);
            manejoPersonas.Add(per2);
            manejoPersonas.Add(per4);
            manejoPersonas.Add(per5);

            System.out.println("Se borro el ultimo que es: " + manejoPersonas.DevolverUltimoYBorrarlo().getNombre());
        }

    static void AplicacionEjercicio3()
    {
        Persona per0 = new Persona("Maria","Elena", 12 , 32234534);
        Persona per1 = new Persona("Jose","ff", 54 , 1231234);

        Persona per2 = new Persona("Luz","Elena", 456 , 32234534);
        Persona per3 = new Persona("Niem","ff", 30 , 1231234);
        Persona per4 = new Persona("Troncos","Elena", 500 , 32234534);
        Persona per5 = new Persona("Bobafet","ff", 1 , 1231234);

        Pila<Persona> pilaPersonas = new Pila<Persona>();

        System.out.println(pilaPersonas.Push(per0));
        System.out.println(pilaPersonas.Push(per1));
        System.out.println(pilaPersonas.Push(per2));
        System.out.println(pilaPersonas.Push(per4));
        System.out.println(pilaPersonas.Push(per5));

        System.out.println(pilaPersonas.Size());
        pilaPersonas.Remove(per2);
        System.out.println(pilaPersonas.Size());

    }
}

