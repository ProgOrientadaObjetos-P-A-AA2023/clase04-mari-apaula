/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Ejecutor02 {

    public static void main(String[] args) {
        // 1. Crear una persona de Barrio el Valle de la ciudad de Loja
        // 2. Crear una persona del Barrio Central de la ciudad de Cuenca
        // 3. Crear una persona del Barrio Centenario de la ciuda de Guayaquil

        Ciudad ciudad1 = new Ciudad("Loja");
        Ciudad ciudad2 = new Ciudad("Cuenca");
        Ciudad ciudad3 = new Ciudad("Guayaquil");

        Barrio barrio1 = new Barrio("Valle", ciudad1);
        Barrio barrio2 = new Barrio("Central", ciudad2);
        Barrio barrio3 = new Barrio("Centenario", ciudad3);

        Persona persona11 = new Persona("René Elizalde", "1100909909", barrio1);
        Persona persona12 = new Persona("René Elizalde", "1100909909", barrio2);
        Persona persona13 = new Persona("René Elizalde", "1100909909", barrio3);

        System.out.println("------------------------------------------");
        System.out.printf("El barrio de la persona %s es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona11.obtenerNombre(),
                persona11.obtenerBarrio().obtenerNombre(),
                persona11.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");

        
        System.out.printf("El barrio de la persona %s es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona12.obtenerNombre(),
                persona12.obtenerBarrio().obtenerNombre(),
                persona12.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");

     
        System.out.printf("El barrio de la persona es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona13.obtenerBarrio().obtenerNombre(),
                persona13.obtenerBarrio().obtenerCiudad().obtenerNombre());

    }
}
