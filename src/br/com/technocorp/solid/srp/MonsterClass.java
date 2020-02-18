package br.com.technocorp.solid.srp;

public class MonsterClass {

    public boolean chupandoManga;
    public boolean assubiando;


    public void descacaManga(){ System.out.println("cupando cana");}
    public void chupaManga(){  this.chupandoManga = true;  System.out.println("cupando cana");}
    public void botarCarocoDaMangaFora(){ this.chupandoManga = false; System.out.println("Colocando a o bagaço fno lixo ");}

    public void soprarBossaNova(){this.assubiando = true;System.out.println("assubiando bossa nova ");}
    public void soprarPassarinho(){this.assubiando = true;System.out.println("assubiando som de passarinho");}


    public void pegarMalabares(){System.out.println("pegando malabares");}
    public void fazerMalabares(){System.out.println("fazendo malabares");}



}
