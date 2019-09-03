
public class Pedaggio {
	
	//variabili

	public Casello caselloEntrata;
	public Casello caselloUscita;
	public Veicolo veicolo;
	public double IVA=0.22;
	
	
	//metodi getter e setter per ogni variabile
	
	public Pedaggio(Casello caselloentr, Casello casellousc, Veicolo veicolo) {
		this.caselloEntrata = caselloentr;
		this.caselloUscita = casellousc;
		this.veicolo = veicolo;
	}
	

//metodo per il calcolo del pedaggio
	
	public double calcola() {
		
		Autostrada a=caselloEntrata.idAutostrada;
		Autostrada b=caselloUscita.idAutostrada;
		double tariffa=a.getTariffa();
		double aggiunta=0;
		
		char z=veicolo.getClasseveicolo();
		
		switch(z) {
		case 'B':
			aggiunta=0.10;
			break;
		case '3':
			aggiunta=0.30;
			break;
		case '4':
			aggiunta = 0.50;
			break;
		case '5':
			aggiunta=0.70;
			break;
		default :
			aggiunta=0.05; 
		}
		
		
		if(a.equals(b)){
				double e=Math.abs(caselloEntrata.getAltezza()-caselloUscita.getAltezza());
				tariffa= tariffa*aggiunta;
				double tot = e*tariffa;
				float aggIVA= (float) (tot*(IVA)) ;
				double arr=(Math.round((tot + aggIVA)*10)/10);
				return arr;		
				}
		
		return 0;
		
	}
	
}