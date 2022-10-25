/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datafono;

/**
 *
 * @author User
 */
public class Posnet {

    public static final double RECARGO_POR_CUOTA = 0.03;
    public static final int MIN_CANT_CUOTAS = 1;
    public static final int MAX_CANT_CUOTAS = 7;

    public Ticket efectuarPago(TajetaCredito tarjeta, double montoAbonar, int cantCuotas) {
        Ticket elTicket = null;
        if (datosValidos(tarjeta, montoAbonar, cantCuotas)) {

            double montoFinal = montoAbonar + montoAbonar * recargoSegunCuotas(cantCuotas);

            if (tarjeta.tieneSaldoDisponible(montoFinal)) {
                tarjeta.descontar(montoFinal);
                String nomApe = tarjeta.nombreCompletoDelTitular();
                double montoPorCuota = montoFinal / cantCuotas;
                elTicket = new Ticket(nomApe, montoFinal, montoPorCuota);

            }

        }
        return elTicket;
    }

    private boolean datosValidos(TajetaCredito tarjeta, double monto, int cant) {

        boolean esTarjetaValida = tarjeta != null;
        boolean esMontoValido = monto > 0;
        boolean cantCuotasValidas = cant >= MIN_CANT_CUOTAS && cant <= MAX_CANT_CUOTAS;
        
        return esTarjetaValida && esMontoValido && cantCuotasValidas;
        
    }
    
    private double recargoSegunCuotas(int cantCuotas){
        
        return (cantCuotas - 1)*(RECARGO_POR_CUOTA);
    }
}
