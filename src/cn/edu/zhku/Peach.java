package cn.edu.zhku;
/*
 * ��Ŀ����̲����һ�����ӣ���ֻ�������֡���һֻ���Ӱ��������ƾ�ݷ�Ϊ��ݣ�����һ������ֻ���ӰѶ��һ
�����뺣�У�������һ�ݡ��ڶ�ֻ���Ӱ�ʣ�µ�������ƽ���ֳ���ݣ��ֶ���һ������ͬ���Ѷ��һ�����뺣��
��������һ�ݣ����������ġ�����ֻ���Ӷ����������ģ��ʺ�̲��ԭ�������ж��ٸ����ӣ�
 * */
public class Peach {
	public static void main(String[] args) {
		int num = 1;  //���� ��� ÿ��һ��
		int total = 0;
		boolean isout = false;
		while(!isout) {
			for(int i=0;i<4;i++) { //�������  ��4�鼴��
				if(i==0) {
					total = num * 5 + 1;
				}
				if(total%4==0) {  //ÿ�������������֮һ�����Ӻ�ʣ�µ��ķ���������4�ı���
					total = (total/4) * 5 + 1;  
					if(i==3) {  //i = 0��1��2��3 �������� 4������ ����ɹ�
						isout = true;
					}
				}else {
					break;
				}
			}
			num++;
		}
		System.out.println("������������ߵ�������Ϊ��num="+(--num));
		System.out.println("�ܵ�������="+total);
	}
}
