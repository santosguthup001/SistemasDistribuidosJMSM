/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketudpsm;

/**
 *Tarea 2 
 * @author FATEC TECHNOLOGY
 */
public class numeroEntero {
    private  int n;
    public int calcularFactorial(){
        int factorial=1;
        for(int i=1;i<=getN();i++){
            factorial*=i;
        }
        return factorial;
    }
    public numeroEntero(){
        this.n=0;
    }
    
    public numeroEntero(int n){
        this.n=n;
    }
    public int getN(){
        return n;
    }
    public void setN(int n){
    this.n=n;
}
    
}
