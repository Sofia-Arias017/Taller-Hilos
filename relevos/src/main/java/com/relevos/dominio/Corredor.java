package com.relevos.dominio;

import java.util.Random;

public class Corredor extends Thread {

    private String nombre;
    private Corredor anterior; 
    
    public Corredor(String nombre, Corredor anterior) {
        this.nombre = nombre;
        this.anterior = anterior;
    }

    @Override
    public void run() {
        try {
            
            if (anterior != null) {
                System.out.println(nombre + " esta esperando a que " + anterior.getNombre() + " termine para recibir el relevo.");
                anterior.join();
            } else {
                System.out.println(nombre + " inicia la carrera.");
            }

            
            System.out.println(nombre + " ha comenzado su recorrido.");

            int tiempo = new Random().nextInt(2000) + 1000; 
            Thread.sleep(tiempo);

          
            System.out.println(nombre + " ha terminado su recorrido y entrega el relevo.");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getNombre() {
        return nombre;
    }
}

