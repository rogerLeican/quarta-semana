package br.com.technocorp.patterms.templatemethod;

public class ServirShake {
    public static void main(String[] args) {
        TemplateShakeria shake = new ShakeMorango();
        shake.PrepararShake();

        System.out.println("\n");

        shake = new ShakeOreo();
        shake.PrepararShake();
    }
}
