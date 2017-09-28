package cn.edu.zhku;
/*
 * 题目：判断101-200之间有多少个素数，并输出所有素数。 
程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除， 

则表明此数不是素数，反之是素数。
 */
public class IsPrime {
	public static void main(String []args) {
		int [] prime = new int[100];
		for(int i=101;i<=200;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}
	public static boolean isPrime(int num) {
		int k = (int) Math.sqrt(num);
		for(int i=2;i<=k;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}	
