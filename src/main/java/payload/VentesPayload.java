package payload;

import com.example.demo.modeles.Facture;
import com.example.demo.modeles.Produit;
import com.example.demo.modeles.Ventes;

public class VentesPayload extends Ventes {
	
	private int qt_vente;
	
	//private Facture facture;
	private Produit produit;
}
