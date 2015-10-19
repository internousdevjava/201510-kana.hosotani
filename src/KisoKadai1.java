import java.io.*;
public class KisoKadai1
{
        public static void main(String args[])
        {
        	int a=0;
            int b=0;
        	while(a<1 | a>100 | b<1 | b>100){
        	System.out.println("1~100までの数字を入力してください");
                System.out.print("y軸の最大値aを入力＝");
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                try{
                        String buf = br.readLine();
                        a = Integer.parseInt(buf);
                }catch(Exception e){
                        a = 0;
                }
                System.out.print("x軸の最大値bを入力＝");
                InputStreamReader isrb = new InputStreamReader(System.in);
                BufferedReader brb = new BufferedReader(isrb);
                try{
                        String bufb = brb.readLine();
                        b = Integer.parseInt(bufb);
                }catch(Exception e){
                        b = 0;
                }
                }
                //表のプログラム
                int y;
                int x;
                for(y=a;y>0;y--){
                	for(x=1;x<=b;x++){
                		if((x*y)<=9){
                			System.out.print("    "+(x*y)+" ");
                		}else if((x*y)<=99){
                			System.out.print("   "+(x*y)+" ");
                		}else if((x*y)<=999){
                			System.out.print("  "+(x*y)+" ");
                		}else if((x*y)<=9999){
                			System.out.print("  "+(x*y)+" ");
                		}else{System.out.print(" "+(x*y)+" ");
                	}
                	}
                	System.out.println(" ");}
        }
}