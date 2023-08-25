package Epicode.U5S3ProvaSettimanale.Entity;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@AllArgsConstructor
public class CentroControllo {
	
	private int id;

	private List<Sonda> Sonde = new ArrayList<>();

}
