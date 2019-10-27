/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciagi;
import java.lang.Math;
/**
 *
 * @author FraKra
 */
public class Geometric extends Progression{
 @Override
  public double getNTerm(int nth){
      return this.getA() * Math.pow(this.getB(),nth-1);
  }
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
