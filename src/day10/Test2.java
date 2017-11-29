package day10;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/*2. 自定义一个“三角形类”，其中有成员 x,y,z,作为三边长，重载构造方法分别给x,y,z 三个成员变量赋值，
	在此类中应该有一个方法：求三角形面积“getArea”和显示三角形信息(三个边长)“showInfo”，在这2个
	方法中当三条边不能构成一个三角形时要抛出自定义异常NotSanjiaoException，否则显示正确信息。
	在测试类中的主方法中构造一个三角形对象(三边为命令行输入的三个整数)， 显示三角形信息和面积，并捕获异常。*/
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
		System.out.println("请输入第一边长：");
		x = scan.nextInt();
		System.out.println("请输入第二边长：");
		y = scan.nextInt();
		System.out.println("请输入第三边长：");
		z = scan.nextInt();
		System.out.println("三角形三边长分别是："+x+"  "+y+"  "+z);
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
		System.out.println("请输入第一边长：");
		x = scan.nextInt();
		System.out.println("请输入第二边长：");
		y = scan.nextInt();
		System.out.println("请输入第三边长：");
		z = scan.nextInt();
		try {
			while(x+y < z && x+z < y && z+y < x);
			
		
		} catch (Exception e) {
			System.out.println("不能构成三角形");
		}
		System.out.println("666");
	}
}