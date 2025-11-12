package tp7;

abstract class Ustensile {
	 protected int Annee;
	    public Ustensile(int Annee) {
	        this.Annee = Annee;
	    }
	    
	    public int getAnnee() {
	    	return Annee;
	    }
	    public int Valeur(){
	        if (2025-Annee<50){
	            return 0;
	        }
	        else{
	            return (2025-Annee-50);
	        }
	    }
}

