package Epicode.U5S3ProvaSettimanale.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Sonda {
	
	private int id;
	private String latitudine;
	private String longitudine;
	private int livelloFumo = 0;
	
}
