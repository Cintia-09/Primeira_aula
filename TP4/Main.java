package TP4;

public class Main {
    public static void main(String[] args)throws ExcecaoDivisaoResultadoZero{
        
        int a[] = new int[10]; 
        int b[] = new int[10]; 
        for(int i = 0;i<10;i++){
            a[i] = i;
            b[i] = 0;
        }

        Excecao teste = new Excecao();
        teste.setArrayA(a);
        teste.setArrayB(b);
        teste.CalculaDivisaoArrays();

    
}
}
