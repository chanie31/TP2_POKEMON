package normaux;

import java.util.Random;

public abstract class Pokemon {
	private String nom;
	protected int hp;
	private int atk;
	private int niveau;
	private static int niveauMax=10;
	private TypePokemon type;
	private static Random random=new Random();
	
	
	public Pokemon(String nom, TypePokemon type) {
		this.nom=nom;
		niveau= random.nextInt(1,niveauMax);
		hp=2*niveau;
		atk=(niveau/2)+1;
		this.type=type;
	}

	public String getNom() {
		return nom;
	}
	public int getHp() {
		return hp;
	}
	public int getAtk() {
		return atk;
	}
	public int getNiveau() {
		return niveau;
	}
	
	public void log(String text) {
		System.out.println(prefixe()+text);
	}
	private String prefixe() {
		return "[ Pokemon "+nom+" ] - ";		
	}
	public boolean isKO() {
		if(hp == 0) {
			log("Je suis KO.. xwx");
			return true;
			}
		log("Je ne suis pas encore KO! Ne m'enterre pas si vite!");
		return false;
	}
	public void soigner() {
		hp=2*niveau;
		log("Hmmm! Je vais mieux, merci !");
		
	}
	public abstract void subir(Pokemon p);
	public abstract void attaquer(Pokemon p);
	@Override
	public String toString() {
		return ("\n-- "+nom+" --\n"+" hp -- "+hp+"\n atk -- "+atk+"\n niveau -- "+niveau);
		//System.out.println(" type -- "+type);
	}

}
