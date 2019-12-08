package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import magiworld.Rodeur;
import magiworld.Joueur;

public class TestRodeur 
{
	Joueur joueur1 = new Joueur();
	Joueur joueur2 = new Joueur();
	Rodeur rodeur = new Rodeur(joueur1, joueur2);
	
	@Test
	public void test_attaque_basique() 
	{
		joueur1.setNumero_joueur("1");
		joueur2.setNumero_joueur("2");
		joueur2.setVie(100);
		joueur1.setAgilite(10);
		
		rodeur.attaque_basique();
		
		if(joueur2.getVie() != 90)
		{
			fail("Problème attaque basique du rodeur");
		}
	}
	
	@Test
	public void test_attaque_speciale()
	{
		joueur1.setNumero_joueur("1");
		joueur2.setNumero_joueur("2");
		joueur1.setNiveau(100);
		joueur1.setAgilite(10);
		
		rodeur.attaque_speciale();
		
		if(joueur1.getAgilite() != 60)
		{
			fail("Problème attaque speciale du rodeur");
		}
	}
}