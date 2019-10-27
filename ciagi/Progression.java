/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciagi;

/**
 *
 * @author FraKra
 */
public abstract class Progression {
    private double a;
    private double b;
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    } 
    public void setA(double A){
         a = A;
    }
    public void setB(double B){
         b = B;
    }
    abstract double getNTerm(int nth);
    abstract boolean checkCorrectness(double first, double second, double third);
    
 
   
}
