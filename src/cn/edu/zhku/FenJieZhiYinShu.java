package cn.edu.zhku;
//��Ŀ����һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5�� 
public class FenJieZhiYinShu {
	public static void main(String[] args) {
		fenjie(45);
	}
	public static void fenjie(int n) {
		if(n == 1 || n == 2) {
			System.out.println("1 �� 2 ������ ���� ����");
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
