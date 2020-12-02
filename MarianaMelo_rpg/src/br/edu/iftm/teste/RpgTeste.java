package br.edu.iftm.teste;

import br.edu.iftm.rpg.Jogador;
import br.edu.iftm.rpg.Inimigo;
import br.edu.iftm.rpg.Luta;

public class RpgTeste 
{
    public static void main(String[] args)
    {
        Jogador rogue = new Jogador("Ladino", 100, 66);
        Inimigo mage = new Inimigo("Mago", 100, 61);
        Inimigo warrior = new Inimigo("Guerreiro", 100, 58);
        Luta luta = new Luta();
        
        rogue.status();
        mage.status();
        warrior.status();
        luta.lutar(rogue, mage);
        luta.lutar(rogue, warrior);

    }
}
