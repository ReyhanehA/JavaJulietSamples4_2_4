/*
 * @description A class defines a final static array with public protection.
 * 
 * This is the "bad" version, which has a public final static array.
 * 
 * */

package testcases.CWE582_Array_Public_Final_Static;

import testcasesupport.*;

public class CWE582_Array_Public_Final_Static__basic_01_bad extends AbstractTestCaseClassIssueBad
{
	public final static int arrayI[] = {1,2,3,4,5}; /* FLAW: public, final, static */
	    
    public void bad() 
    {
        CWE582_Array_Public_Final_Static__basic_01_bad b = new CWE582_Array_Public_Final_Static__basic_01_bad();
        IO.writeLine("arrayI[0]: " + Integer.toString(b.arrayI[0]));
        b.arrayI[0] = 2;
        IO.writeLine("arrayI[0]: " + Integer.toString(b.arrayI[0]));
	}
	
	/* Below is the main(). It is only used when building this testcase on 
	   its own for testing or for building a binary to use in testing binary 
	   analysis tools. It is not used when compiling all the testcases as one 
	   application, which is how source code analysis tools are tested. */ 
	public static void main(String[] args) 
		throws ClassNotFoundException, InstantiationException, IllegalAccessException 
	{
		mainFromParent(args);
	}
}

