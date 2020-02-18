package br.com.technocorp.threads.sincronizado2;

public class ThreadQSoma implements Runnable {

    private String nome;
    private int[] nuns;
    private static Calculadora2 calc = new Calculadora2();

    public ThreadQSoma(String nome, int[] nuns){
        this.nome = nome;
        this.nuns = nuns;
        new Thread(this, nome).start();
    }

    @Override
    public void run(){

        System.out.println(this.nome + "começou");

        int soma = calc.somaArray(this.nuns);

        System.out.println(" Resultado " + this.nome + " foi: " + soma);

        System.out.println(this.nome + " Terminouuu " );


    }


}
