package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import magiworld.Guerrier;
import magiworld.Joueur;

public class TestGuerrier 
{

	Joueur joueur1 = new Joueur();
	Joueur joueur2 = new Joueur();
	Guerrier guerrier = new Guerrier(joueur1, joueur2);
	
	@Test
	public void test_attaque_basique() 
	{
		joueur1.setNumero_joueur("1");
		joueur2.setNumero_joueur("2");
		joueur2.setVie(100);
		joueur1.setForce(10);
		
		guerrier.attaque_basique();
		
		if(joueur2.getVie() != 90)
		{
			fail("Problème attaque basique du guerrier");
		}
	}
	
	@Test
	public void test_attaque_speciale()
	{
		joueur1.setNumero_joueur("1");
		joueur2.setNumero_joueur("2");
		joueur2.setVie(100);
		joueur1.setForce(10);
		
		guerrier.attaque_speciale();
		
		if(joueur2.getVie() != 80)
		{
			fail("Problème attaque speciale du guerrier");
		}
	}
}
