public class Veicolo {
	//variabili
	
	public String marca;
	public String modello;
	public int anno;
	public String targa;
	public double peso;
	public float altezza;
	public int numero_assi;
	public char classe;
	
	
	//metodi getter e setter per ogni variabile

	public int getNumeroAssi() {return numero_assi;}
	public void setNmeroAssi(int n_assi) {this.numero_assi = n_assi;}
	
	public char getClasseveicolo() {return classe;}
	public void setClasseveicolo(char classe_veicolo) {this.classe = classe_veicolo;}
	
	public String getModello() {return modello;}
	public void setModello(String modello) {this.modello = modello;}
	
	public String getMarca() {return marca;}
	public void setMarca(String marca) {this.marca = marca;}
	
	public int getAnno() {return anno;}
	public void setAnno(int anno) {this.anno = anno;}
	
	public String getTarga() {return targa;}
	public void setTarga(String targa) {this.targa = targa;}
	
	public double getPeso() {return peso;}
	public void setPeso(float peso) {this.peso = peso;}
	
	public float getAltezza() {return altezza;}
	public void setAltezza(float altezza) {this.altezza = altezza;}
	
	
	//costruttore
	
	public Veicolo(String modello, String marca, int anno, String targa, double peso, float altezza, int n_assi,char classe_veicolo) {
		
		this.modello = modello;
		this.marca = marca;
		this.anno = anno;
		this.targa = targa;
		this.peso = peso;
		this.altezza = altezza;
		this.numero_assi = n_assi;
		this.classe = classe_veicolo;
	}
	
	
	//metodo toString
	
	@Override
	public String toString() {
		return "Veicolo [modello=" + modello + 
				", marca=" + marca + 
				", anno=" + anno + 
				", targa=" + targa + 
				", peso=" + peso + 
				", altezza=" + altezza + 
				", numero assi=" + numero_assi + 
				", classeveicolo=" + classe + "]";
	}
}