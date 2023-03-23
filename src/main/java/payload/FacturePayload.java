package payload;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.modeles.Facture;

public class FacturePayload extends Facture {
	
	private int mont_fact;
	
	private List<VentesPayload> ventes;
	
	private String created_at;
	private String updated_at;
	public int getMont_fact() {
		return mont_fact;
	}
	public void setMont_fact(int mont_fact) {
		this.mont_fact = mont_fact;
	}
	
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	
	public List<VentesPayload> getVentes() {
		return ventes;
	}
	public void setVentes(List<VentesPayload> ventes) {
		this.ventes = ventes;
	}
	@Override
	public String toString() {
		return "FacturePayload [mont_fact=" + mont_fact + ", ventespayload=" + ventes + ", created_at="
				+ created_at + ", updated_at=" + updated_at + "]";
	} 

	
}
