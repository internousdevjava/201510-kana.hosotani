	import java.io.*;
	public class kisokadai2 
	{
	        public static void main(String args[])
	        {
	        	final int answer=(int)(Math.random()*100)+1;
	            int number=0;
	                InputStreamReader isr = new InputStreamReader(System.in);
	                BufferedReader br = new BufferedReader(isr);
                    System.out.println("1から100までの数字を入れてね");
	                    for(number=0;number!=answer;){
	                    	try{
	                      System.out.print("数字を入れてね= ");
		                  number=Integer.parseInt(br.readLine());
	                      if(number<answer){
	                        System.out.println("もっと上だよ。");
	                      }else if(number>answer){
	                        System.out.println("もっと下だよ。");
	                      }else if(number==answer){
	                    	System.out.println("正解！おめでとう！");
	                      }
	                      }catch(Exception e){
	  	                	System.out.println("Error　数字を入れてね");
	  	                  }
	                    }
	        }
	}
