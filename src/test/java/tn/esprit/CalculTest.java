package tn.esprit;
import org.junit.Assert;
import org.junit.Test;
public class CalculTest {
	
	
	Calcul calcul = new Calcul();
	
	@Test
	public void testCalculSom(){
		Assert.assertEquals(25, calcul.calculerSom(10, 15));
	}
	@Test
	public void testCalculDiff() {
       
		Assert.assertEquals(5, calcul.calculerDiff(15, 10));
		
		
	}
	

}
