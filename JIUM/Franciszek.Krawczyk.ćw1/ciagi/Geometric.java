/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciagi;
import java.lang.Math;
/**
 *Klasa implementująca metody ciągu geometrycznego dla klasy Progression.
 * @author FraKra
 * @version 1.1 - uzupelnienie metod
 */
public class Geometric extends Progression{

    /**
     *Zwraca nty wyraz ciągu geometrycznego
     * @param nth ktory wyraz ciagu
     * @return
     */
    @Override
  public double getNTerm(int nth){
      return this.getA() * Math.pow(this.getB(),nth-1);
  }

    /**
     *Funkcja weryfikuje poprawność ciągu na podstawie 3 kolejnych wyrazów.
     * @param first wyraz ciągu
     * @param second wyraz ciągu
     * @param third wyraz ciągu
     * @return
     */
    @Override
 public boolean checkCorrectness(double first, double second, double third){
    if(second/first == third/second){
        return true;
    }
    else
        return false;
    }/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
}
