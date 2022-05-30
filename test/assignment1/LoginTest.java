/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

/**
 *
 * @author ST10201123
 */
public class LoginTest 
{
    Login response = new Login();
    
    public LoginTest() 
    {
        
    }

    @Test
    public void CheckoutPassWordComplexity()
            
    {
        String expectedString = "Please enter Password";
        String actual = response.ReturnLoginStatus(expectedString);
        assertEquals(expectedString,actual);
    }
    
}
