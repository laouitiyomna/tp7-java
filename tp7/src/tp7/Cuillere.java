package tp7;

public class Cuillere extends Ustensile{
    private double longueur;
    public Cuillere(int annee,double longueur) {
        super(annee);
        this.setLongueur(longueur);
    }
    
	public double getLongueur() {
		return longueur;
	}
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
}
