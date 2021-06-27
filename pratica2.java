package Prát2;
import java.util.Scanner;

public class Aluno
{
    // atributos aluno
    private String nome;
    private double media;
    private int id;
    protected double nota1;
    protected double nota2; 

    // Imprime nome
    public void getNome(String nome1){
         nome = nome1;   
         System.out.println("O nome da aluna é "+nome);
    } 
    //Altera nome
    public void alteraNome(String novoNome){
        nome = novoNome;
        System.out.println("O nome alterado da aluna é "+nome);
    }
    // Imprime id
    public void getId(int id1){
         id= id1;   
         System.out.println("A id é "+id);
    } 
    //Altera id
    public void alteraNome(int novoId){
        id = novoId;
        System.out.println("aid alterada é "+id);
    }
    private double calculaMedia(double nota1, double nota2,double media){
        media = (nota1 + nota2)/2;
    return media;
    }
    public double retornaMedia(){
        Scanner sc = new Scanner(System.in);
        String nome = "";
       System.out.println("Digite a primeira nota: "); 
       nota1 = sc.nextDouble();
       System.out.println("Digite a segunda nota: ");
       nota2 = sc.nextDouble();
       calculaMedia(nota1,nota2,media);
       return media;
       
    }
    
