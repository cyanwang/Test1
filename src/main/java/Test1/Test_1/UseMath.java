package Test1.Test_1;

import java.util.ArrayList;

import org.apache.commons.math3.stat.descriptive.moment.Mean; 
import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation; 
import org.apache.commons.math3.stat.descriptive.moment.Variance; 

/**
* 简单使用commons Math方法
* @author mxz 2018.1.7
*/

public class UseMath {
	public static void main(String[] args) { 
		UseMath test = new UseMath();
		test.getMean(null);
		test.getStandardDeviation(null);
		test.getvariance(null);
		test.getSum(null);
		test.showName();
	}
		
		public double getMean(double value[]) {
			Mean mean = new Mean(); // 算术平均值 
			double[] values1 = new double[] {1,1,1,1,1,1,1,1,1,1}; 
			System.out.println("算数平均值: " +mean.evaluate(values1));
			return 0;
		}
		
		public double getStandardDeviation(double value[]) {
			double[] values2 = new double[] {1,1,1,1,1,1,1,1,1,1}; 			
			StandardDeviation StandardDeviation =new StandardDeviation();//标准差 
			System.out.println("标准差: " +StandardDeviation.evaluate(values2));
			return 0; 
		}
		
		public double getvariance(double value[]) {
			double[] values3 = new double[] {1,1,1,1,1,1,1,1,1,1};
			Variance variance = new Variance();//方差		
			System.out.println("方差: " +variance.evaluate(values3));
			return 0;
		}
		public int getSum(ArrayList<Integer> a)
		{
			int sum=0;
			ArrayList <Integer> a1=new ArrayList<Integer>();
			a1.add(1);
			a1.add(2);
			for(int i=0;i<a1.size();i++)
			{
				sum+=(int)a1.get(i);
			}
			System.out.println("和: " +sum);
			return sum;
		}
		
		public String showName()
		{
			String say=getName();
			System.out.print(say);
			return say;
		}
		public String getName()
		{
			//尚未实现
			return null;
		}

} 





