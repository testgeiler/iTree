package com.iTree.TestFour;

public class sdf {
	
	public static int[] a;
	public static int c,n,m;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n = 5;
		m =5;
		work(0, 1);
		

	}
	public static void work(int s,int cc){
		int i;//�������iĿ��
		if(s == m) { //�ж�s�Ƿ����m��m��
			for(i = 0; i < c; ++i)//ѭ��i��0��c��
				System.out.println(a[i]);//ѭ���������a��������֡�		
			return;
		}
		for(i = cc; i <= n; ++i)//��ʼ��i����cc(1)��ѭ����1��N,
		{
			if(s + i > m) return;//���s(0)+i(ѭ������)��������֮�ͣ���ֱ�ӷ���
			if(s + i <= m) {//���s(0)+i(ѭ������)С������֮�ͣ���
				a[c++] = i;//��i��ֵ������a���ҵ�һ����0��n,֮���һ����
				work(s + i, i + 1);//Ȼ�󽫣�1��2������work����
				--c;//��ȥ���һ�����ϸ����
			}
		}
	}

}
