package day10;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/*2. �Զ���һ�����������ࡱ�������г�Ա x,y,z,��Ϊ���߳������ع��췽���ֱ��x,y,z ������Ա������ֵ��
	�ڴ�����Ӧ����һ���������������������getArea������ʾ��������Ϣ(�����߳�)��showInfo��������2��
	�����е������߲��ܹ���һ��������ʱҪ�׳��Զ����쳣NotSanjiaoException��������ʾ��ȷ��Ϣ��
	�ڲ������е��������й���һ�������ζ���(����Ϊ�������������������)�� ��ʾ��������Ϣ��������������쳣��*/
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Triangle tr = new Triangle();
		tr.show();*/
		getArea ga = new getArea();
		ga.Area();
		
	}

}
class Triangle{
	int x;
	int y;
	int z;
	Triangle(){
		
	}
	Triangle(int x,int y,int z){
		
		this.x = x;
		this.y = y;
		this.z = z;
	}
	void show(){
		Scanner scan = new Scanner(System.in);
		System.out.println("�������һ�߳���");
		x = scan.nextInt();
		System.out.println("������ڶ��߳���");
		y = scan.nextInt();
		System.out.println("����������߳���");
		z = scan.nextInt();
		System.out.println("���������߳��ֱ��ǣ�"+x+"  "+y+"  "+z);
	}

}


class getArea extends Exception{
	int x;
	int y;
	int z;
	getArea(){
		
	}
	getArea(int x,int y,int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	void Area(){
		Scanner scan = new Scanner(System.in);
		System.out.println("�������һ�߳���");
		x = scan.nextInt();
		System.out.println("������ڶ��߳���");
		y = scan.nextInt();
		System.out.println("����������߳���");
		z = scan.nextInt();
		try {
			while(x+y < z && x+z < y && z+y < x);
			
		
		} catch (Exception e) {
			System.out.println("���ܹ���������");
		}
		System.out.println("666");
	}
}