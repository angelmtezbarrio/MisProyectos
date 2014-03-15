package tiendas_bici;

import javax.swing.JOptionPane;

public class Principal {
	
	public Principal (){
		
		Bicicleta miBicicleta =new Bicicleta();
		//miBicicleta.cambiarMarca(new ParametrosBicicleta(5, 5, 500));
		
		Bicicleta.cambiarMarca(miBicicleta, "Orbea");
		miBicicleta.cambiarMedidaRueda(26);
		
		int med = 5;
		int media = 6;
		int num = 7;
		
		med=miBicicleta.getMedRueda();
		media=miBicicleta.getMediaBici();
		num=miBicicleta.getNumeroCambios();
				
		System.out.println(miBicicleta.getMedRueda() +
		miBicicleta.getMediaBici() +miBicicleta.getNumeroCambios()	);
		
		miBicicleta.modificar(25);
		
		JOptionPane.showMessageDialog (null,(String.valueOf(miBicicleta.getMediaBici()) +
										String.valueOf(miBicicleta.getMedRueda())+
										String.valueOf(miBicicleta.getNumeroCambios())));
		
	}
	public static void main (String [] args){
		final String HOLA ="HOLA";
		new Principal();
	}
	

}
