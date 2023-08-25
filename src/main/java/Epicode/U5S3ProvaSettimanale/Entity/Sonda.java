package Epicode.U5S3ProvaSettimanale.Entity;

import Epicode.U5S3ProvaSettimanale.Interface.Observer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Sonda implements Observer{
	
	private int id;
	private double lat;
	private double longi;
	private int livelloFumo = 0;
	
	
	public String notificationURL() {
		return "http://host/alarm?idsonda=" +id + "&lat=" + lat + "&lon" +longi + "&smokelevel=" + livelloFumo;
	}
	
	
	
	@Override
	public void controlloFumo() {
		if (this.livelloFumo > 5) {
			
			String URL = notificationURL();
			
			System.out.println("Sonda id " + id + " con latitudine " +lat + " e longitudine " +longi + " registra un livello di fumo pari a " +livelloFumo);
			System.out.println("Centro di controllo: " + URL);
		}
		
	}
	
}
