/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author CARITO
 */
public class Movimiento {
    private Fecha fecha;
    private double monto;
    private double saldo_actual;
    private Tipo tipo;

    public Movimiento(Fecha fecha, double monto, Tipo tipo) {
        this.fecha = fecha;
        this.monto = monto;
        this.tipo = tipo;
    }
 
    
    public Movimiento(Fecha fecha, double monto, double saldo_actual,Tipo tipo) {
        this.fecha = fecha;
        this.monto = monto;
        this.saldo_actual = saldo_actual;
        this.tipo = tipo;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public double getMonto() {
        return monto;
    }

    public double getSaldo_actual() {
        return saldo_actual;
    }

    
    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setSaldo_actual(double saldo_actual) {
        this.saldo_actual = saldo_actual;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    public void consignar(double monto, Cuenta cuenta ){
        this.saldo_actual=cuenta.getSaldo();
        cuenta.setSaldo(cuenta.getSaldo()+monto);
    }
    public void retirar(double monto, Cuenta cuenta ){
        this.saldo_actual=cuenta.getSaldo();
        cuenta.setSaldo(cuenta.getSaldo()-monto);
    }    
    
}
