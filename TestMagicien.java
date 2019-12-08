package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import magiworld.Joueur;
import magiworld.Magicien;

public class TestMagicien 
{
	Joueur joueur1 = new Joueur();
	Joueur joueur2 = new Joueur();
	Magicien magicien = new Magicien(joueur1, joueur2);
	
	@Test
	public void test_attaque_basique() 
	{
		joueur1.setNumero_joueur("1");
		joueur2.setNumero_joueur("2");
		joueur2.setVie(100);
		joueur1.setIntelligence(10);
		
		System.out.println("Test attaque basique");
		magicien.attaque_basique();
		
		if(joueur2.getVie() != 90)
		{
			fail("Problème attaque basique du magicien");
			System.out.println("Problème attaque basique du magicien");
		}
	}
	
	@Test
	public void test_attaque_speciale_pas_de_depassement_de_vie_au_depart()
	{
		joueur1.setNumero_joueur("1");
		joueur2.setNumero_joueur("2");
		joueur1.setVie(50);
		joueur1.setVie_au_depart(100);
		joueur1.setIntelligence(10);
		
		System.out.println("Test attaque spéciale sans dépassement de vie au départ");
		magicien.attaque_speciale();
		
		if(joueur1.getVie() != 70)
		{
			fail("Problème attaque speciale du magicien sans dépassement de vie au départ");
			System.out.println("Problème attaque speciale du magicien sans dépassement de vie au départ");
		}
	}
	
	@Test
	public void test_attaque_speciale_depassement_de_vie_au_depart()
	{
		joueur1.setNumero_joueur("1");
		joueur2.setNumero_joueur("2");
		joueur1.setVie(100);
		joueur1.setVie_au_depart(100);
		joueur1.setIntelligence(10);
		
		System.out.println("Test attaque spéciale avec dépassement de vie au départ");
		magicien.attaque_speciale();
		
		if(joueur1.getVie() != 100)
		{
			fail("Problème attaque speciale du magicien avec dépassement de vie au départ");
			System.out.println("Problème attaque speciale du magicien avec dépassement de vie au départ");
		}
	}
}