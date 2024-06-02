package br.com.dio.debbuging;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciou do programa no método main.");
        a();
        System.out.println("Finalizou do programa no método main.");
    }

    static void a() {
        System.out.println("Ligou a TV.");
        b();
        System.out.println("Desligou a TV");
    }

    static void b() {
        System.out.println("Carregou o sistema.");
        for(int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("Carregando o Desligamento.");
    }

    static void c(){
        System.out.println("Apertou o Desligar.");
        //Thread.dumpStack();
        System.out.println("Lendo o Comando.");
    }

}
