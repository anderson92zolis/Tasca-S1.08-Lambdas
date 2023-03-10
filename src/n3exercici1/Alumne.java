package n3exercici1;

public class Alumne {
	
	private String nom;
	private int edat;
	private String curs;
	private float nota;
	
	public Alumne(String nom, int edat, String curs, float nota) {
		this.nom = nom;
		this.edat = edat;
		this.curs = curs;
		this.nota = nota;
	}

	
	public String getNom() {
		return nom;
	}

	
	public int getEdat() {
		return edat;
	}

	public String getCurs() {
		return curs;
	}

	
	public float getNota() {
		return nota;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
	public void setEdat(int edat) {
		this.edat = edat;
	}

	
	public void setCurs(String curs) {
		this.curs = curs;
	}

	
	public void setNota(int nota) {
		this.nota = nota;
	}


	@Override
	public String toString() {
		return "Alumne [nom=" + nom + ", edat=" + edat + ", curs=" + curs + ", nota=" + nota + "]";
	}
	
}
