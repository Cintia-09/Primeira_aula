package TP3;


 
public class Circulo extends Quadrilateros
{
    private double raio;
    public Circulo(double raio) {
    super(raio, 0.0, 0.0, 0.0);
  }

  public double getRaio() {
    return super.getX();
  }
  public double Area() {
    return Math.PI * Math.pow(getRaio(), 2.0);
  }

  public double Perimetro() {
    return 2.0 * Math.PI * getRaio();
}
 


public void getCirculo(){
   
System.out.println("o perimetro é: ");
    
    
}

}