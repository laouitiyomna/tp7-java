package tp7;

public class AssietteRonde extends Assiette {
    private double rayon;
    public AssietteRonde(int Annee, double rayon) {
        super(Annee);
        this.rayon = rayon;
    }
    
    public double surface(){
        return 3.14*rayon*rayon;
    }
    

}
