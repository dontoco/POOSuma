/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

/**
 *
 * @author Victor
 */
public class Suma {
    private int vUno;
    private int vDos;
    private int Resultado;
    
    public Suma(int valorUno, int valorDos){
        this.vUno = valorUno;
        this.vDos = valorDos;
        
    }
    public void Operacion (){
        Resultado = vUno + vDos;
    }
    public void Imprimir(){
        Operacion();
        System.out.println("el Resultado de la suma es "+ Resultado);
    
}
    
}
