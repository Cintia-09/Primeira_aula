package TP4;

public class Main {
    public static void main(String[] args)throws ExcecaoDivisaoResultadoZero{
        
        int a[] = new int[10]; 
        int b[] = new int[10]; 
        for(int i = 0;i<10;i++){
            a[i] = 0;
            b[i] = i;
        }

        Excecao teste = new Excecao();
        teste.setArrayA(a);
        teste.setArrayB(b);
        teste.CalculaDivisaoArrays();

    
}
}
