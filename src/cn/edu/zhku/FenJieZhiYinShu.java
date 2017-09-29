package cn.edu.zhku;
//题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。 
public class FenJieZhiYinShu {
	public static void main(String[] args) {
		fenjie(45);
	}
	public static void fenjie(int n) {
		if(n == 1 || n == 2) {
			System.out.println("1 或 2 质因数 是其 本身");
			return;
		}
		StringBuilder sb = new StringBuilder();
		sb.append(n+"=");
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				sb.append(i+"*");
				n = n/i;
				i--;
			}
		}
		String str = sb.substring(0, sb.length()-1);
		System.out.println(str);
	}
}
