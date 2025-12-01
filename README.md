# Simulacion de Carrera de Relevos con Hilos en Java

Este repositorio contiene una simulacion de una carrera de relevos utilizando hilos en Java.
El objetivo del taller es comprender el uso de la concurrencia, la sincronizacion mediante join() y el manejo de dependencias entre hilos.

## Contenido del proyecto
### Corredor.java

Representa a un corredor individual.
Cada corredor es un hilo (Thread) que espera a que el corredor anterior termine antes de iniciar su recorrido.

Elementos principales:

Atributos nombre y anterior.

El metodo run() controla la logica del hilo.

Usa join() para sincronizar con el corredor anterior.

Simula un tiempo de carrera usando Thread.sleep().

### Equipo.java

Representa un equipo completo de la carrera.
Se encarga de crear tres corredores por equipo y definir su orden de salida.

Elementos principales:

Atributo nombreEquipo.

Lista de corredores.

El metodo iniciarCarrera() inicia todos los hilos del equipo.

### Main.java

Es el punto de entrada del programa.
Aqui se crean los equipos y se inicia la carrera de cada uno.

Contenido principal:

Creacion de objetos Equipo.

Llamado al metodo iniciarCarrera().

Funcionamiento de la simulacion

Se crean tres corredores por equipo.

El primer corredor inicia inmediatamente.

Cada corredor siguiente espera a que el anterior termine usando join().

Cada corredor simula su tiempo de carrera.

La salida en consola muestra claramente el orden de ejecucion de los hilos.

## Objetivos del taller

Practicar el uso de hilos en Java.

Aplicar sincronizacion entre tareas concurrentes.

Comprender la importancia del metodo join().

Simular un problema real utilizando concurrencia.

## Ejemplo de salida esperada
=== Iniciando equipo ROJO ===
ROJO-1 inicia la carrera.
ROJO-1 ha comenzado su recorrido.
ROJO-2 esta esperando a que ROJO-1 termine para recibir el relevo.
ROJO-3 esta esperando a que ROJO-2 termine para recibir el relevo.
ROJO-1 ha terminado su recorrido y entrega el relevo.
ROJO-2 ha comenzado su recorrido.


La salida puede variar debido al tiempo aleatorio de carrera.

## Conceptos aplicados

Hilos en Java

Metodo join()

Sincronizacion

Programacion concurrente

Orientacion a objetos