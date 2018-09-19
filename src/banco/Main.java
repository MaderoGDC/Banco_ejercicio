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
public class Main {
    public static void main(String[] args) {
        Cuenta[] cuentas = new Cuenta[2];
        Tipo[] tipo_banco= new Tipo[2];
        Tipo[] tipo_movimiento = new Tipo[2];
              
        cuentas[0] = new Cuenta(001, 200, new Fecha(19,9,2018),"Juan Perez", new Movimiento[100]);
        cuentas[1]= new Cuenta(002, 300, new Fecha(19,9,2018),"Juanita Perez",new Movimiento[100]);
        Banco bancolombia = new Banco("Banco_Cundinamarca",cuentas);
        
       
    }    
}
