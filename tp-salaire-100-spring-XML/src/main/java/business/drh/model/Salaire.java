package business.drh.model;

public class Salaire {

	private Long id;
	private int montant;
	private Employe employe;

	public Salaire() {
		super();
	}

	@Override
	public String toString() {
		return "Salaire [id=" + id + ", montant=" + montant + "]";
	}

	public Salaire(int montant) {
		super();
		this.montant = montant;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
