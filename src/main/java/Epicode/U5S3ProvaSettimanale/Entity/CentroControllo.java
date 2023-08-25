package Epicode.U5S3ProvaSettimanale.Entity;

import java.util.ArrayList;
import java.util.List;

import Epicode.U5S3ProvaSettimanale.Interface.Observer;
import Epicode.U5S3ProvaSettimanale.Interface.Subject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@AllArgsConstructor
public class CentroControllo implements Subject{
	
	private int id;

	private List<Sonda> Sonde = new ArrayList<>();

	@Override
	public void registraSonda(Observer o) {
		Sonde.add((Sonda) o);
		
	}

	@Override
	public void notifica(Observer o) {
		
		for (Sonda s : Sonde) {
			s.controlloFumo();
		}
		
	}

	

}
