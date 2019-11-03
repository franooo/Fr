/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciagi;

/**
 * Klasa rozszerzająca bazową Progression o metody dla ciągu arytmetycznego.
 * @author FraKra
 * @version 1.0
 */
public class Arithmetic extends Progression {

    /**
     *Funkcja zwracająca nty wyraz ciągu dla arytmetycznego.
     * @param nth
     * @return
     */
    @Override
  public double getNTerm(int nth){
       return this.getA() + (nth - 1)* this.getB();      
  }
     /**
     *Funkcja weryfikuje poprawność ciągu na podstawie 3 kolejnych wyrazów.
     * @param first wyraz ciągu
     * @param second wyraz ciągu
     * @param third wyraz ciągu
     * @return
     */
  @Override       
 boolean checkCorrectness(double first, double second, double third){
     if (second == (first + third)/2)
         return true;
     return false;
 }
    
 
}