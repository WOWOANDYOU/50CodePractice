package cn.edu.zhku;

import java.util.ArrayList;
/*
 * ��Ŀ����ӡ�����е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ�������λ���������͵��ڸ����������磺
153��һ��"ˮ�ɻ���"����Ϊ153=1�����η���5�����η���3�����η��� 
 */
public class WaterFlower {
	public static void main(String[] args) {
		int a,b,c;
		ArrayList<Integer> water = new ArrayList<Integer>();
		for(int i=100;i<=999;i++) {
			if(i%100==0) {
				a = i/100;
				b = 0;
				c = 0;
				if(i==(a*a*a + b*b*b + c*c*c)) {
					water.add(i);
				}
			}else {
				a = i/100;
				b = (i%100)/10;
				c = (i%100)%10;
				if(i==(a*a*a + b*b*b + c*c*c)) {
					water.add(i);
				}
			}
		}
		System.out.println(water.toString());
	}
}
