package Epicode.U5S3ProvaSettimanale;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import Epicode.U5S3ProvaSettimanale.Entity.CentroControllo;
import Epicode.U5S3ProvaSettimanale.Entity.Sonda;

public class TestCentroControllo {
	
    @Test
    public void testSondaRegistration() {
        CentroControllo centroControllo = new CentroControllo(1);
        Sonda sonda = new Sonda(1, 63463.43, 62362.43, 8);
        
        centroControllo.registraSonda(sonda);
        
        assertTrue(centroControllo.getSonde().contains(sonda));
    }
    
    @Test
    public void testNotificaSonde() {
        CentroControllo centroControllo = new CentroControllo(1);
        Sonda sonda1 = new Sonda(1, 63463.43, 62362.43, 8);
       

        centroControllo.registraSonda(sonda1);
        

        centroControllo.notifica();

    
        for (Sonda s : centroControllo.getSonde()) {
            assertEquals(8, s.getLivelloFumo());
        }
    }
}



