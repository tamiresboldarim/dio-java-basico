package tami.boldarim.terceirasemana;

public class Operadores {
    public static void main(String[] args) {
        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        //x repeticao
        numero = numero + 2;

        System.out.println(numero);

        numero++;

        System.out.println(numero);

        numero--;

        System.out.println(numero);

        System.out.println(-- numero);

        System.out.println(++ numero);

        boolean variavel = true;

        System.out.println(!variavel);

        System.out.println(variavel);

        variavel =!variavel;

        System.out.println(variavel);

        // classe Operadores.java
        int a, b;

        a = 6;
        b = 6;

        String resultado = a==b ? "verdadeiro" : "falso";

        System.out.println(resultado);

        //classe Operadores.java Relacionais
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
            
        System.out.println("numeroUm 1 é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm 1 é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm 1 é maior que numeroDois? " + simNao);


        //Operadores Lógicos

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2){
            System.out.println("as duas condicoes sao verdadeiras");

        }

        if (condicao1 || condicao2){
            System.out.println("uma das condicoes é verdadeira");

        }

        System.out.println("fim");
    }
}
