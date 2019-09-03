import java.util.TreeSet;

public class Autostrada {
	
	//variabili
	
	public String idAutostrada;
	public String Casello_inizio;
	public String Casello_fine;
	public double tariffa;
	public float lunghezza;
	
	TreeSet<Casello> listaCaselli ;
	
	// metodi getter e setter di ogni variabile
	
	public String getFine() {
		return Casello_fine;
	}
	public void setFine(String Fine) {
		this.Casello_fine = Fine;
		}
	
	public String getInizio() {
		return Casello_inizio;
		}
	public void setInizio(String Inizio) {
		this.Casello_inizio = Inizio;
		}
	
	public float getlunghezza() {
		return lunghezza;
		}
	public void setlunghezza(float lunghezza){
		this.lunghezza = lunghezza;
		}
	
	public String getIdAutostrada(){
		return idAutostrada;
		}
	public void setIdAutostrada(String idAutostrada){
		this.idAutostrada = idAutostrada;
		}
	
	public double getTariffa() {
		return tariffa;
		}
	public void setTariffa(float tariffa) {
		this.tariffa = tariffa;
		}
	
	public TreeSet<Casello> getListaCaselli() {
		return listaCaselli;
		}
	public void setListaCaselli(TreeSet<Casello> Lista) {
		this.listaCaselli = Lista;
		}
	
	
	//costruttore
	
	public Autostrada(String idAutostrada, float tariffa, String Inizio,
			String Fine, float lunghezza,
			TreeSet<Casello> listaCaselli) {
		this.idAutostrada = idAutostrada;
		this.tariffa= tariffa;
		this.Casello_inizio = Inizio;
		this.Casello_fine = Fine;
		this.lunghezza = lunghezza;
		this.listaCaselli= new TreeSet<Casello>();
	}
	
	
	
	//metodi
	
	@Override
	public String toString() {
		return "Autostrada : [idAutostrada=" + idAutostrada + 
				", tariffa al km =" + tariffa + 
				", Inizio=" + Casello_inizio + 
				", Fine=" + Casello_fine + 
				", Lunghezza=" + lunghezza + 
				", Caselli=" + listaCaselli + "]";
	}
	

	public boolean addCasello(Autostrada autostrada, String nome, float km) {
		Casello casello = new Casello (autostrada, nome, km);
		 return listaCaselli.add(casello);	
	}
	
	public boolean addCasello(Casello a) {
		return listaCaselli.add(a);
	}
	
	public boolean containsCasello(TreeSet<Casello> listaCaselli, Casello nomeCasello) {
		return listaCaselli.contains(nomeCasello) ;
	}
}