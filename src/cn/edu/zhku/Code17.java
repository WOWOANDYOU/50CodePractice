package cn.edu.zhku;
/*
 * 【程序17】 
题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个 第二天早上又将剩
下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下 
的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。 
1.程序分析：采取逆向思维的方法，从第九天往第一天推。 
解题链接 http://blog.csdn.net/wangnanwlw/article/details/52317451
 * */
public class Code17 {
	//采用 逆向思维 画图 理解
	public static void main(String[] args) {
		int peach = 1;//第十天 剩下一个 逆向 往前推算
		int sum = 0;
		for(int i=9;i>0;i--) {
			peach=(peach+1)*2;
			System.out.println("第"+i+"天的桃子数："+peach);
		}
	}
}
