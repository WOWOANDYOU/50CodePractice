package cn.edu.zhku;
/*
 * 题目：海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子凭据分为五份，多了一个，这只猴子把多的一
个扔入海中，拿走了一份。第二只猴子把剩下的桃子又平均分成五份，又多了一个，它同样把多的一个扔入海中
，拿走了一份，第三、第四、第五只猴子都是这样做的，问海滩上原来最少有多少个桃子？
 * */
public class Peach {
	public static void main(String[] args) {
		int num = 1;  //假设 最后 每份一个
		int total = 0;
		boolean isout = false;
		while(!isout) {
			for(int i=0;i<4;i++) { //五个猴子  算4遍即可
				if(i==0) {
					total = num * 5 + 1;
				}
				if(total%4==0) {  //每个猴子拿走五分之一的桃子后，剩下的四份桃子数是4的倍数
					total = (total/4) * 5 + 1;  
					if(i==3) {  //i = 0、1、2、3 即进行了 4次运算 就算成功
						isout = true;
					}
				}else {
					break;
				}
			}
			num++;
		}
		System.out.println("第五个猴子拿走的桃子数为：num="+(--num));
		System.out.println("总的桃子数="+total);
	}
}
