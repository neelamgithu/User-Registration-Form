package example.com.in;

import org.junit.Assert;
import org.junit.Assert.*;

import org.junit.Test;

public class UserRegistrationTest {
	@Test
	public void should_return_true_ater_giving_first_letter_capital_()
	{
		UserRegistration user =new UserRegistration();
        boolean k = user.isValidFirstName("Neelam");
        Assert.assertEquals(true,k);
	
		
	

}
}
