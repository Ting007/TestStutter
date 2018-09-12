import static org.junit.Assert.*;

import java.io.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class StutterTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@Test
	public void testIsDelimit1() {
		boolean result = Stutter.isDelimit('0');
		Assert.assertFalse(result);
//		fail("Not yet implemented");
	}
	
	@Test
	public void testIsDelimit2() {
		boolean result = Stutter.isDelimit(' ');
		Assert.assertTrue(result);
	}
	
	@Test
	public void testIsDelimit3() {
		boolean result = Stutter.isDelimit('a');
		Assert.assertFalse(result);
	}
	@Test
	public void testMain1() throws IOException{
		String[] arg = {"inputFile.txt"};
		final InputStream original = System.in;
		final FileInputStream fips = new FileInputStream(new File ("inputFile.txt"));
		System.setIn(fips);
		Stutter.main(arg);
		System.setIn(original);
	}
	
	@Test
	public void testMain2() throws IOException{
		String[] arg = {};
		final InputStream original = System.in;
		final FileInputStream fips = new FileInputStream(new File ("inputFile.txt"));
		System.setIn(fips);
		Stutter.main(arg);
		System.setIn(original);
	}
	
	@Test
	public void testMain3(){
		try {
		System.out.println("main");
		String[] arg = {null};
		final InputStream original = System.in;
		final FileInputStream fips = new FileInputStream(new File ("inputFile.txt"));
		System.setIn(fips);
		Stutter.main(arg);
		System.setIn(original);
		} catch(IOException e){
		}
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	

}
