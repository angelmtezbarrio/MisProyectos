package tiendas_bici;

public class Bicicleta {

	//atributos
	private int medRueda;
	private int mediaBici;
	private int numeroCambios;	
	private String marca;
	private Rueda r=new Rueda();
	
	//comportamiento
	public int getMedRueda() {
		return medRueda;
	}

	public int getMediaBici() {
		return mediaBici;
	}

	public int getNumeroCambios() {
		return numeroCambios;
	}

	public SuspensionBicicleta getSuspension() {
		return suspension;
	}

	private SuspensionBicicleta suspension;
	
	public static void cambiarMarca(Bicicleta bicicleta, String marca) {
		if (marca.equals("Orbea")){
			
			bicicleta.cambiarMarca(marca);
		
		}
	}
	
	int medRueda (){
		medRueda = 26;
		return medRueda;
	}
	
	void aviso_Bici(){
		System.out.println(medRueda +
		mediaBici +numeroCambios	);
	}
	
	void cambiarMarca (String marca){
		this.marca=marca;
	}
	
	void cambiarMedidaRueda (int medidaRueda){
		medRueda=medidaRueda;
	}
	void incluirRueda(){
		r.setAncho(2.0f);
		r.setTubulares("si");
		
	}

	public String getMarca() {
		return marca;
	}

	public Rueda getR() {
		return r;
	}
	public void modificar (int temporal){
		medRueda=temporal;
	}
		
	
	
}
