package br.com.technocorp.solid.srp.DivisaoClasseMonster;

public class ChupaManga {

    public boolean chupandoManga;

    public void descacaManga(){ System.out.println("cupando cana");}
    public void chupaManga(){  this.chupandoManga = true;  System.out.println("cupando cana");}
    public void botarCarocoDaMangaFora(){ this.chupandoManga = false; System.out.println("Colocando a o bagaço fno lixo ");}

}
