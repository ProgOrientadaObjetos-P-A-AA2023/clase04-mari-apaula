/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

public class Ejecutor {
    public static void main(String[] args) {
        // Se crea un objeto
        // haciendo referencia al constructor por defecto
        FacturaTelefonica fac = new FacturaTelefonica("0989288928", 23.1, 0.5);
        System.out.printf("Número telefónico: %s\n"
                + "Minutos mes: %.2f\nValor minuto: %.2f\n"
                + "Valor factura: %.2f\n", fac.obtenerNumeroTelefono(),
                fac.obtenerMinutosMes(),
                fac.obtenerValorMinuto(),
                fac.obtenerValorFactura());
    }
}
