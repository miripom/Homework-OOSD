
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creazione veicoli
	     Veicolo v1 = new Veicolo("FIAT 500","FIAT", 2016,"FC093TW", 980 , (float) 1.48, 2, 'A');
	     Veicolo v2 = new Veicolo("FIAT Panda","FIAT",2012,"EF884AP ", 940, (float) 1.55, 2,'3');
	     Veicolo v3 = new Veicolo("Nissan Micra","Nissan",2009,"CK492CF", 1.006, (float)1.455 , 2, 'B');
	     
	     System.out.println(v1);
	     System.out.println(v2);
	     System.out.println(v3);
	     
	     //Creazione autostrade
	     Autostrada a1 = new Autostrada("a1",(float)1.50,"Milano","Napoli",(float) 761, null);
	     Autostrada a24 = new Autostrada("a24",(float)1.20,"Roma","Teramo",(float) 166.5, null);
	     
	     System.out.println(a1);
	     System.out.println(a24);
	     
	     //Aggiunta dei caselli nell'autostrada
	     a1.addCasello(a24, "L'Aquila Est",(float)15); 
	     a1.addCasello(a24, "L'Aquila Ovest", (float)12);
	     
	     
	     //Creazione dei caselli e i aggiunta nella lista dell'autostrada corrispondente
	     Casello c1 = new Casello(a1,"Lodi",(float) 24);
	     a1.addCasello(c1);
	     Casello c2 = new Casello(a1,"Parma",(float)111);
	     a1.addCasello(c2);
	     Casello c3 = new Casello(a24,"Tornimparte",(float)84.9);
	     a24.addCasello(c3);
	     Casello c4 = new Casello(a24,"Teramo",(float)146.1);
	     a24.addCasello(c4); 
	     Casello c5 = new Casello(a24,"Assergi",(float)116.8);
	     a24.addCasello(c5);
	     
	     
	     //Pedaggio da veicoli v1,v2,v4
		 Pedaggio p1 = new Pedaggio(c3,c4,v1);
	     Pedaggio p2 = new Pedaggio(c4,c5,v2);
	     Pedaggio p3 = new Pedaggio(c1,c2,v3);
	     Pedaggio p4 = new Pedaggio(c3,c5,v1);
	     
	     System.out.println(p1.calcola() + " Euro");
	     System.out.println(p2.calcola() + " Euro");
	     System.out.println(p3.calcola() + " Euro");
	     System.out.println(p4.calcola() + " Euro");
	}

}
