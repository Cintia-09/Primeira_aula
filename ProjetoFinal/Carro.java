package ProjetoFinal;

public class Carro
       {
    
       private String modelo;
       private int ano;
       private String cor;
       private String placa;
       private float valor;
       private boolean alugado;
       private String  status;

       //m?todo construtor simples
         //public Carro(){
         //super();
    
         //}
   
       //m?todo constutor completo
       public Carro(String modelo,int ano,String cor,String placa,float valor,boolean alugado,String  status){
           super();
           this.modelo = modelo;
           this.ano = ano;
           this.cor = cor;
           this.placa = placa;
           this.valor = valor;
           this.alugado = alugado;
           this.status = status;
        
       }
    
       public String getModelo() {
          return modelo;
       }
    
       public void setModelo(String modelo) {
          this.modelo = modelo;
       }
    
       public int getAno() {
           return ano;
       }
    
       public void setAno(int ano) {
          this.ano = ano;
       }
    
       public String getCor() {
          return cor;
       }
    
       public void setCor(String cor){
          this.cor = cor;
       }
    
       public String getPlaca(){
          return placa;
       }
    
       public void setPlaca(String placa){
          if (alugado==false)
          this.placa = placa;
       }
    
       public float getValor(){
          return valor;
       }
    
       public void setValor(float valor){
          if (alugado==false)
          this.valor = valor;
       } 
       
       public boolean isAlugado() {
           return alugado;
       }
       
       public void setAlugado(boolean alugado) {
           this.alugado = alugado;
       }
       
       public String  getStatus() {
        return status;
    }
    public void setStatus(String   status) {
        this.status = status;
    }
    
public static void main (String Args[])
 {      
         Carro c1 = new Carro("Gol", 2010,"Branco","NLT 6666",100.00f,true, "s"); 
        if(c1.isAlugado() == false)
        {
            System.out.println("Modelo: " + c1.getModelo());
            System.out.println("Cor: " + c1.getCor());
            System.out.println("Placa: " + c1.getPlaca());
            System.out.println("O carro alugado com sucesso!");
        }else
        {
            System.out.println("O carro ja esta alugado! ");
            System.out.println("Modelo: " + c1.getModelo());
            System.out.println("Cor: " + c1.getCor());
            System.out.println("Placa: " + c1.getPlaca());
            
        }
}
   
    }
