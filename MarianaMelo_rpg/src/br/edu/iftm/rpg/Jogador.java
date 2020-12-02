package br.edu.iftm.rpg;

public class Jogador 
{
    private String nome;
    public int vida;
    private int dano;
    public Inimigo inimigo;

    public Jogador(String nome, int vida, int dano)
    {        
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
    }

    public void atacar(Inimigo inimigo)
    {
        System.out.format("\n%s atacou  %s e causou %d de dano.\n", this.nome, inimigo.getNome(), dano);
        inimigo.setVida(inimigo.getVida() - dano);
    }

    public void perderVida(int pontos)
    {
        if (vida <= 0) 
        {
            System.out.format("%s morreu.", nome);
        } 
        else if (vida >= 1) 
        {
            pontos = inimigo.getDano();
            vida = vida - pontos;
            System.out.format("%s perdeu %d pontos de vida", nome, pontos);
        }
    }

    public void status()
    {
        System.out.println("\nJogador");
        System.out.println("----------------");
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Dano: " + dano);
        System.out.println("----------------");
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return this.nome;
    }

    public void setVida(int vida)
    {
        this.vida = vida;
    }

    public int getVida()
    {
        return this.vida;
    }

    public void setDano(int dano)
    {
        this.dano = dano;
    }

    public int getDano()
    {
        return this.dano;
    }
}
