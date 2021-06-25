package TP3;


 
import java.util.Scanner;
public class Retangulo extends Quadrilateros{

    public double base,altura; 

public Retangulo(double base, double altura) {
    super(0.0, base, altura, 0.0);
  }

public double getY() {
    return super.getY();
  }

public double getAltura() {
    return super.getZ();
  }

public double Area() {
    return getY() * getAltura();
  }

public double Perimetro() {
    return 2.0 * getY() * getAltura();
  }


      
       
  }


