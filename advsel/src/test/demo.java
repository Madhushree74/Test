package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo 
{
       @Test
       public void test3()
       {
    	   Reporter.log("Hello",true);
       }
       @Test
       public void test2()
       {
    	   Reporter.log("Bye",true);
       }
       
      }
