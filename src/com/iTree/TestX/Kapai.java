package com.iTree.TestX;

import java.util.Scanner;

public class Kapai {
	public static  int start=1;//开始牌数
	public static int end;//选牌上限
	static int s,p;//s为循环开始数,p为选择人的标志，sum为当前的纸牌数量。
	static Scanner input=new Scanner(System.in);
	public int people=0;
	public static int n; 
	int sta=1;
	static int napai;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kapai kp=new Kapai();
		kp.FirstIn();
		int p=kp.add(0,napai,0);
		if(p==1){
			System.out.println("先手获胜");
		}else{
			System.out.println("后手获胜");
		}

	}
	public  int add(int sum,int num,int people){//num为选的纸牌数，people为当前选牌的人
		if(sum==0){
			sum+=num;
			people=(people+1)%2;
			System.out.println("取"+num+"张"+"剩余"+(n-sum)+"请下一位输入取的牌数：");
			int xinqu=input.nextInt();
			boolean chenk=guize(xinqu,num);
			if(chenk){
				add(sum,xinqu,people);
			}
		}else{
			for(;sum<=sum+2*num;sum=sum+1){
				//p=people;
				sum+=num;
				if(sum>=n){
					return people;//设置函数为INT;目的提高模块内聚性
				}else{
					people=(people+1)%2;
					System.out.println("取"+num+"张,剩余"+(n-sum)+"请下一位输入取的牌数：");
					int xinqu=input.nextInt();
					boolean chenk=guize(xinqu,num);
					if(chenk){
						add(sum,xinqu,people);
					}else{
						break;
					}
					return people;
				}
			}
		}
		return -3;
	}
	public static boolean guize(int xinqu,int num){//检测拿牌是否按规则
		if(xinqu<=0||xinqu>2*num){
			System.out.println("输入有误，请重新输入");
			return false;
		}else{
			return true;
		}
	}
	public int FirstIn(){//判断第一次拿牌数据
		System.out.println("请输入总牌数");
		n=input.nextInt();
		System.out.println("请输入第一次拿牌数");
		napai=input.nextInt();
		if(napai>=n || napai<=0){
			System.out.println("请按规则出牌");
			return 0;
		}else{
			return napai;
		}
	}
	

}
