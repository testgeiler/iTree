package com.iTree.TestX;

import java.util.Scanner;

public class Kapai {
	public static  int start=1;//��ʼ����
	public static int end;//ѡ������
	static int s,p;//sΪѭ����ʼ��,pΪѡ���˵ı�־��sumΪ��ǰ��ֽ��������
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
			System.out.println("���ֻ�ʤ");
		}else{
			System.out.println("���ֻ�ʤ");
		}

	}
	public  int add(int sum,int num,int people){//numΪѡ��ֽ������peopleΪ��ǰѡ�Ƶ���
		if(sum==0){
			sum+=num;
			people=(people+1)%2;
			System.out.println("ȡ"+num+"��"+"ʣ��"+(n-sum)+"����һλ����ȡ��������");
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
					return people;//���ú���ΪINT;Ŀ�����ģ���ھ���
				}else{
					people=(people+1)%2;
					System.out.println("ȡ"+num+"��,ʣ��"+(n-sum)+"����һλ����ȡ��������");
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
	public static boolean guize(int xinqu,int num){//��������Ƿ񰴹���
		if(xinqu<=0||xinqu>2*num){
			System.out.println("������������������");
			return false;
		}else{
			return true;
		}
	}
	public int FirstIn(){//�жϵ�һ����������
		System.out.println("������������");
		n=input.nextInt();
		System.out.println("�������һ��������");
		napai=input.nextInt();
		if(napai>=n || napai<=0){
			System.out.println("�밴�������");
			return 0;
		}else{
			return napai;
		}
	}
	

}
