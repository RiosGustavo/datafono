/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package datafono;

/**
 *
 * @author User
 */
public class Principal {

    public static void main(String[] args) {

        Posnet posnet = new Posnet();
        Persona p = new Persona("75075116", "Gustavo", "Rios", "gustiRios@usa.net");
        TajetaCredito t = new TajetaCredito("RoboCol", "7986570", 70000, EntidadFinanciera.MARTERCARD, p);

        System.out.println("Tarjeta antes de pago: ");
        System.out.println(t);

        System.out.println("Ticket tras pagar ...");
        Ticket ticketGenerado = posnet.efectuarPago(t, 8000, 4);
        System.out.println(ticketGenerado);
        System.out.println("Tarjeta despues del pago");
        System.out.println(t);

    }
}
