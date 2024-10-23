import java.util.Scanner;

public class Contador {
    public static void main(String [] args) {
        System.out.println("Informar dois números");
        int parametroUm = Integer.valueOf(args [0]);
        int parametroDois = Integer.valueOf(args [1]);

        try{
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException e){
        System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        int contagem = parametroDois - parametroUm;
        System.out.println("A lista baseada nos números informados é:");
        for (int indice = 1; indice <= contagem; indice++){
            System.out.println(indice);
        }
        
    }


public class ParametrosInvalidosException extends Exception{
    
}
}