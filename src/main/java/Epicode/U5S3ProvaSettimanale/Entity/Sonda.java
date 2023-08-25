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
	private String latitudine;
	private String longitudine;
	private int livelloFumo = 0;
	
	
	@Override
	public void controlloFumo() {
		// TODO Auto-generated method stub
		
	}
	

	
}
