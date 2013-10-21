import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorldTest {

	

	@Test public void test1()
	{
		//return true;
		HelloWorld hw = new HelloWorld();
		//hw.testMe();
		Assert.assertTrue(8==hw.sum());
	}
	
    public static void main(String args[])
    {
        System.out.println("Hello World!");
    }

	
	
}
