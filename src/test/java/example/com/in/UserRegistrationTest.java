package example.com.in;

import org.junit.Assert;
import org.junit.Assert.*;

import org.junit.Test;

public class UserRegistrationTest {
	@Test
	public void should_return_true_after_giving_first_letter_capital_()
	{
		UserRegistration user =new UserRegistration();
        boolean k = user.isValidFirstName("Neelam");
        Assert.assertEquals(true,k);
	}
	@Test
	public void should_return_true_after_giving_Last_letter_capital_()
	{
		UserRegistration user =new UserRegistration();
        boolean k = user.isValidLastName("Mujawar");
        Assert.assertEquals(true,k);
	}
	@Test
	public void EmailCheck()
	{
		UserRegistration user = new UserRegistration();
		boolean k=user.isValidemailid("abc.xyz@bl.co");
		Assert.assertEquals(false, k);
	}
	
}
