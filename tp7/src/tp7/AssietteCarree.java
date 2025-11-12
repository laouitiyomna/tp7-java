package tp7;

public class AssietteCarree extends Assiette{
    private double cote;
    public AssietteCarree(int annee,double cote) {
        super(annee);
        this.cote = cote;
    }
    public int Valeur(){
        return 5*super.Valeur();
    }
    public double surface(){
        return cote*cote;
    }
}
