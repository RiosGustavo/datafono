/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datafono;

/**
 *
 * @author User
 */
public class TajetaCredito {
    private String entidadBancaria;
    private String nroTarjeta;
    private double saldo;
    private EntidadFinanciera entidadfinanciera;
    private Persona titular;

    public TajetaCredito(String entidadBancaria, String nroTarjeta, double saldo, EntidadFinanciera entidadfinanciera, Persona titular) {
        this.entidadBancaria = entidadBancaria;
        this.nroTarjeta = nroTarjeta;
        this.saldo = saldo;
        this.entidadfinanciera = entidadfinanciera;
        this.titular = titular;
    }
    
    public boolean tieneSaldoDisponible(double monto){
        
        return saldo >= monto;
    }
    
    public void descontar(double monto){
        saldo -= monto;
        
    }
    
    public String nombreCompletoDelTitular(){
        return titular.nombreCompleto();
        
    }

    @Override
    public String toString() {
        return "TajetaCredito{" + "entidadBancaria=" + entidadBancaria + ", nroTarjeta=" + nroTarjeta + ", saldo=" + saldo + ", entidadfinanciera=" + entidadfinanciera + ", titular=" + titular + '}';
    }
    
    
}
