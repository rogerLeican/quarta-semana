package br.com.technocorp.threads.sincronizado2;

public class ThreadMain2 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
       // int[] array2 = {1, 2, 3, 4, 5};
        ThreadQSoma S1 = new ThreadQSoma("1", array);
        ThreadQSoma S2 = new ThreadQSoma("2", array);


      //  new Thread(() -> System.out.println("Sla")).start();

    }

}
