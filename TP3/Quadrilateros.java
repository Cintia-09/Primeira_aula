package TP3;


public abstract class Quadrilateros implements FormaGeometrica
{
   private double base,altura;
   private double x;
   private double y;
   private double z;
   private double w;
   
public Quadrilateros(double x, double y, double z, double w) {

this.x = x;
this.y = y;
this.z = z;
this.w = w;
}
protected double getX(){
    return x;
}
protected double getY(){
    return y;
}
protected double getZ(){
    return z;
}
protected double getW(){
    return w;
}

private double validate(double value) {
    if (value >= 0) {
      return value;
    }

    throw new IllegalArgumentException();
  }
public Quadrilateros(double base, double altura) {

this.base = base;

this.altura = altura;

}

public double perimetro() {

return 2*base+2*altura;

}

public double area() {

return base*altura;

}

public double getBase() {

return base;

}

public void setBase(double base) {

this.base = base;

}

public double getAltura() {

return altura;

}

public void setAltura(double altura) {

this.altura = altura;


}
}
    


