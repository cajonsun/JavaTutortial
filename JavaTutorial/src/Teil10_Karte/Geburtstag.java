package Teil10_Karte;

public class Geburtstag extends Karte {

	private int alter;

	public Geburtstag(String empfaenger,String anrede,int alter) {
		super(empfaenger,anrede);
		this.alter = alter;
	}
	
	public void gruss() {
		System.out.println(anrede+" "+empfaenger+",\n");
		System.out.println("alles Gute zum "+alter+". Geburtstag.\n\n");
	}

}
