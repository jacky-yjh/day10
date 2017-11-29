package day10;

/*1.  参考下面的程序，试修改程序，捕获相关异常，使得程序能正常运行。[提示：用 错误数据测试，即可得到异常类名，
                                    运行时主方法参数输入 abc 测试]  */

	public class Test1{  
		public static void main(String args[])  {   
			System.out.println("字符串索引越界异常");  
			String str=args[0];   
			System.out.println("第四个字符为 "+str.charAt(3));   
			int aa=Integer.parseInt(args[0]);
			 System.out.println("平方为 "+aa*aa);  
			} 
	}


