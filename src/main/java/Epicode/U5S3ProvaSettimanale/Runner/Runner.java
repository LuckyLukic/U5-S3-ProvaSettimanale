package Epicode.U5S3ProvaSettimanale.Runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import Epicode.U5S3ProvaSettimanale.Entity.CentroControllo;
import Epicode.U5S3ProvaSettimanale.Entity.Sonda;

@Component
public class Runner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		Sonda sonda1 = new Sonda(1, 63463.43,62362.43, 8);
		Sonda sonda2 = new Sonda(2, 54545.45,63424.38, 3);
		Sonda sonda3 = new Sonda(3, 43434.88,33442.12, 4);
		Sonda sonda4 = new Sonda(4, 65444.21,45232.99, 6);
		Sonda sonda5 = new Sonda(5, 45454.87,76767.65, 9);
		
		CentroControllo centroControllo = new CentroControllo(1);
		
		centroControllo.registraSonda(sonda1);
		centroControllo.registraSonda(sonda2);
		centroControllo.registraSonda(sonda3);
		centroControllo.registraSonda(sonda4);
		centroControllo.registraSonda(sonda5);
		
		centroControllo.notifica();
		
		
		
		
		
	}

}
