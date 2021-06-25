package TP3;



public class Quadrado extends Quadrilateros {
    
  public Quadrado(double x) {
    super(x, 0.0, 0.0, 0.0);
  }

  public double getX() {
    return super.getX();
  }

  public double Area() {
    return Math.pow(getX(), 2.0);
  }

  public double Perimetro() {
    return 4.0 * getX();
  }
}


