package Test1.Test_1;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class UseMathTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetMean() {
		UseMath math = new UseMath();
		double i1[] = new double[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		double x = math.getMean(i1);
		assertEquals(String.valueOf(0.0), String.valueOf(x));
		// fail("尚未实现");
	}

	@Test
	public void testGetStandardDeviation() {
		UseMath math = new UseMath();
		double i1[] = new double[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		double x = math.getStandardDeviation(i1);
		assertEquals(String.valueOf(0.0), String.valueOf(x));
		// fail("尚未实现");
	}

	@Test
	public void testGetvariance() {
		UseMath math = new UseMath();
		double i1[] = new double[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		double x = math.getvariance(i1);
		assertEquals(String.valueOf(0.0), String.valueOf(x));
		// fail("尚未实现");
	}
   @Test
   public void testGetSum()
   {
	   ArrayList<Integer> a = mock(ArrayList.class); 
	   
	   when(a.get(0)).thenReturn(1);
	   when(a.get(1)).thenReturn(2);
	   when(a.size()).thenReturn(2);
	   
	   System.out.println("size:"+a.size());
	   int sum=0;
	   for(int i=0;i<a.size();i++)
	   {
		   sum+=(int)a.get(i);
	   }
	   
	  assertEquals(String.valueOf(3), String.valueOf(sum));
   }
   @Test
   public void getShowName()
   {
	   UseMath u=mock(UseMath.class);
	   when(u.getName()).thenReturn("Cyan");
	   String name=u.getName();
	   System.out.println("hello:"+name);
	   assertEquals(String.valueOf("Cyan"), String.valueOf(name));
   }
}



