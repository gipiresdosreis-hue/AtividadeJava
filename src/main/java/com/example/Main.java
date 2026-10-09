package com.example;

public class Main {
    public static void main(String[] args) {

        minhaMensagem();
        somarValoresComParametro(56, 36);
        somarValoresComParametro(58, 90);
        System.out.println(subtracaoValores(56 , 36));
        System.out.println(exibirMsg("Venha feriado!"));

    }

    public static void minhaMensagem() {
        System.out.println("Minha msg!");
    }
    public static String exibirMsg (String text){
        return text;
    }

    public static int subtracaoValores(int c, int d){
        return c-d;
    }


    public static void somarValoresComParametro(int a, int b) {
        System.out.println(a + b);
    }

}


