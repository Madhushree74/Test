package test1;

import org.testng.annotations.Test;

public class gmail
{
    @Test
    public void login()
    {
    	System.out.println("Logged in");
    }
    @Test(dependsOnMethods = "sentitems")
    public void logout()
    {
    	System.out.println("Logged out");
    }
    @Test(dependsOnMethods = "compose")
    public void sentitems()
    {
    	System.out.println("mail is in sentitem");
    }
    @Test(dependsOnMethods = "login")
    public void compose()
    {
    	System.out.println("composed");
    }
}
