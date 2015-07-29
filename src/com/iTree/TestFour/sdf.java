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
		int i;//定义变量i目的
		if(s == m) { //判断s是否等于m，m是
			for(i = 0; i < c; ++i)//循环i从0到c，
				System.out.println(a[i]);//循环输出数组a里面的数字。		
			return;
		}
		for(i = cc; i <= n; ++i)//初始化i等于cc(1)，循环从1到N,
		{
			if(s + i > m) return;//如果s(0)+i(循环变量)大于所求之和，则直接返回
			if(s + i <= m) {//如果s(0)+i(循环变量)小于所求之和，则
				a[c++] = i;//把i赋值给数组a，找到一个从0到n,之间的一个数
				work(s + i, i + 1);//然后将（1，2）带进work函数
				--c;//出去最后一个不合格的数
			}
		}
	}

}
