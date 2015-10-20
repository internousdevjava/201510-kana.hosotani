	import java.io.*;
	public class kisokadai2 
	{
	        public static void main(String args[])
	        {
	        	final int answer=(int)(Math.random()*100)+1;
	            int number=0;
	                InputStreamReader isr = new InputStreamReader(System.in);
	                BufferedReader br = new BufferedReader(isr);
                    System.out.println("1����100�܂ł̐��������Ă�");
	                    for(number=0;number!=answer;){
	                    	try{
	                      System.out.print("���������Ă�= ");
		                  number=Integer.parseInt(br.readLine());
	                      if(number<answer){
	                        System.out.println("�����Əゾ��B");
	                      }else if(number>answer){
	                        System.out.println("�����Ɖ�����B");
	                      }else if(number==answer){
	                    	System.out.println("�����I���߂łƂ��I");
	                      }
	                      }catch(Exception e){
	  	                	System.out.println("Error�@���������Ă�");
	  	                  }
	                    }
	        }
	}
