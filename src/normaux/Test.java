package normaux;

public class Test {

	public static void main(String[] args) {
		Pokemon0 p1=new Pokemon0("Mimirritant");
		Pokemon0 p2=new Pokemon0("Sisinnistre");
		p1.log(p1.toString());
		p2.log(p2.toString());
		p1.attaquer(p2);
		p2.log(p2.toString());
		p2.soigner();
		p2.log(p2.toString());

	}

}
