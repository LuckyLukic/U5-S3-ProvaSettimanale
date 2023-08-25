package Epicode.U5S3ProvaSettimanale;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import Epicode.U5S3ProvaSettimanale.Entity.CentroControllo;
import Epicode.U5S3ProvaSettimanale.Entity.Sonda;

public class TestSonda {
	
	  @Test
	    public void testNotificationURL() {
	        Sonda sonda = new Sonda(1, 63463.43, 62362.43, 8);
	        String expectedURL = "http://host/alarm?idsonda=1&lat=63463.43&lon=62362.43&smokelevel=8";
	        assertEquals(expectedURL, sonda.notificationURL());
	    }

	    @Test
	    public void testControlloFumo() {
	        Sonda sonda = new Sonda(1, 63463.43, 62362.43, 8);
	        
	     
	        ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
	        System.setOut(new PrintStream(outputContent));
	        
	        sonda.controlloFumo();
	        
	        String expectedOutput = "Sonda id 1 con latitudine 63463.43 e longitudine 62362.43 registra un livello di fumo pari a 8\n" +
	            "Centro di controllo: http://host/alarm?idsonda=1&lat=63463.43&lon=62362.43&smokelevel=8\n";
	        
	        assertEquals(expectedOutput, outputContent.toString());
	        
	    
	        System.setOut(System.out);
	    }
	    
	    @Test
	    public void testSondaRegistration() {
	        CentroControllo centroControllo = new CentroControllo(1);
	        Sonda sonda = new Sonda(1, 63463.43, 62362.43, 8);
	        
	        centroControllo.registraSonda(sonda);
	        
	        assertTrue(centroControllo.getSonde().contains(sonda));
	    }

}
