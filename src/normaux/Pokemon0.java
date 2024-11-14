package normaux;

import java.util.Random;

public class Pokemon0 {
	private String nom;
	protected int hp;
	private int atk;
	private int niveau;
	private static int niveauMax=10;
	private TypePokemon type;
	private static Random random;
	
	
	public Pokemon0(String nom) {
		this.nom=nom;
		niveau= random.nextInt(niveauMax);
		hp=2*niveau;
		atk=(niveau/2)+1;
	}

}
