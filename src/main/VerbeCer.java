package main;

public class VerbeCer extends VerbeGroupe1 {

	public VerbeCer(String verbe) {
		super(verbe);
		this.validSuffix(verbe,"cer",2);

	}
	
	@Override
	public String conjugue1erePersonnePluriel() {
		return this.getRadical().replace("c","ç")+this.terminaison1erePersonnePluriel();
	}	
	

}
