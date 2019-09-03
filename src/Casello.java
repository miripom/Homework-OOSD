public class Casello implements Comparable {
	
	//variabili

	public Autostrada idAutostrada;
	public String nome;
	public double altezza;
	
	
	//metodi getter e setter per ogni variabile
	
	public Autostrada getIdAutostrada() {
		return idAutostrada;
		}
	public void setIdAutostrada(Autostrada idAutostrada) {
		this.idAutostrada = idAutostrada;
		}
	
	public String getNome() {
		return nome;
		}
	public void setNome(String nome) {
		this.nome = nome;
		}
	
	public double getAltezza() {
		return altezza;
		}
	public void setAltezza(float km) {
		this.altezza = km;
		}
	
	
	//costruttore
	
	public Casello(Autostrada codiceAutostrada, String nome, float km) {
		
		this.idAutostrada = codiceAutostrada;
		this.nome = nome;
		this.altezza= km;
	}
	
	// metodi
    
    @Override
	public String toString() {
		return "Casello [codiceAutostrada=" + idAutostrada + 
				", nome=" + nome + 
				", km=" + altezza+ "]";
	}
    
    
	public boolean equals(Object obj){
        if (obj instanceof Casello) {
            return (((Casello) obj).idAutostrada == this.idAutostrada);
        }
	return false;
}
	

	
	@Override
	public int compareTo(Object obj) {
		
		if (this.altezza < (((Casello) obj).getAltezza())) return 1;
			
		return 0;

	}
}