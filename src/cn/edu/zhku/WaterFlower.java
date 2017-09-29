package cn.edu.zhku;

import java.util.ArrayList;
/*
 * 题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：
153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。 
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
