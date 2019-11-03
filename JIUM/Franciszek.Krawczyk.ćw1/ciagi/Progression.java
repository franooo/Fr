/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciagi;

/**
 *Klasa jest bazową dla dwóch nadrzędnych - Geometrycznego i Arytmetycznego i pełni dla nich rolę interfejsu.
 * Zawiera zmienne, gettery i settery do właściwości ciągu.
 * @version 1.0
 * @author FraKra
 * 
 */
public abstract class Progression {
    private double a;
    private double b;

    /**
     *
     * @return
     */
    public double getA(){
        return a;
    }

    /**
     *
     * @return
     */
    public double getB(){
        return b;
    } 

    /**
     *
     * @param A
     */
    public void setA(double A){
         a = A;
    }

    /**
     *
     * @param B
     */
    public void setB(double B){
         b = B;
    }
    abstract double getNTerm(int nth);
    abstract boolean checkCorrectness(double first, double second, double third);
    
 
   
}
