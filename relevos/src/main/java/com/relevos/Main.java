package com.relevos;

import com.relevos.dominio.Equipo;

public class Main {

    public static void main(String[] args) {
        Equipo equipoRojo = new Equipo("ROJO");
        Equipo equipoAzul = new Equipo("AZUL");

        equipoAzul.iniciarCarrera();
        equipoRojo.iniciarCarrera();
    }
}
