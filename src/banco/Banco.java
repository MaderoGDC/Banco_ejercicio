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
public class Banco {
    /**
     * @param args the command line arguments
     */
    private String nombre; 
    private Cuenta[] cuentas;
    private Tipo retirar;
    private Tipo consignar;

    public Banco(String nombre,Cuenta[] cuentas) {
        this.nombre = nombre;
        this.cuentas = cuentas;
    }
    

}
