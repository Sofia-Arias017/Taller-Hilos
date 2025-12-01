package com.relevos.dominio;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String nombreEquipo;
    private List<Corredor> corredores = new ArrayList<>();

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;

        Corredor c1 = new Corredor(nombreEquipo + "-1", null);
        Corredor c2 = new Corredor(nombreEquipo + "-2", c1);
        Corredor c3 = new Corredor(nombreEquipo + "-3", c2);

        corredores.add(c1);
        corredores.add(c2);
        corredores.add(c3);
    }

    public void iniciarCarrera() {
        System.out.println("\n=== Iniciando equipo " + nombreEquipo + " ===");

        for (Corredor c : corredores) {
            c.start();
        }
    }
}
