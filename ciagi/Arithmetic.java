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
public class Arithmetic extends Progression {
     @Override
  public double getNTerm(int nth){
       return this.getA() + (nth - 1)* this.getB();      
  }
  @Override
 boolean checkCorrectness(double first, double second, double third){
     if (second == (first + third)/2)
         return true;
     return false;
 }
    
 
}