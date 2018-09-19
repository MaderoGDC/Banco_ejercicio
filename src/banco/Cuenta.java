/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.ArrayList;

/**
 *
 * @author CARITO
 */
public class Cuenta {
  private int num_cuenta;
  private double saldo;
  private Fecha fecha;
  private String nombre_cliente;
  private Movimiento[] movimientos;

    public Cuenta(int num_cuenta, double saldo, Fecha fecha, String nombre_cliente,Movimiento[] movimientos) {
        this.movimientos = movimientos;
        this.num_cuenta = num_cuenta;
        this.saldo = saldo;
        this.fecha = fecha;
        this.nombre_cliente = nombre_cliente;
    }

    public Movimiento[] getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(Movimiento[] movimientos) {
        this.movimientos = movimientos;
    }
  

    public void setNum_cuenta(int num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public int getNum_cuenta() {
        return num_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

  
  
}
