package cn.edu.zhku;
/*
 * ��Ŀ���ж�101-200֮���ж��ٸ���������������������� 
����������ж������ķ�������һ�����ֱ�ȥ��2��sqrt(�����)������ܱ������� 

���������������������֮��������
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
