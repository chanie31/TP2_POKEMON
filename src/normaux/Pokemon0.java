package normaux;

import java.util.Random;

public class Pokemon0 {
	private String nom;
	protected int hp;
	private int atk;
	private int niveau;
	private static int niveauMax=10;
	//private TypePokemon type;
	private static Random random=new Random();
	
	
	public Pokemon0(String nom) {
		this.nom=nom;
		niveau= random.nextInt(1,niveauMax);
		hp=2*niveau;
		atk=(niveau/2)+1;
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
	public void attaquer(Pokemon0 p) {
		p.hp-=atk;
		log(p.getNom()+" je t'attaque � "+atk+" !");
	}
	@Override
	public String toString() {
		return ("\n-- "+nom+" --\n"+" hp -- "+hp+"\n atk -- "+atk+"\n niveau -- "+niveau);
		//System.out.println(" type -- "+type);
	}

}
