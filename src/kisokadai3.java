import java.io.*;
public class kisokadai3 {
	public static void main(String[] args)throws IOException{
		
		System.out.println("              メニューを表示します"); 
		System.out.println("              番号を選択してください"); 
		System.out.println("              １　ファイルの作成"); 
		System.out.println("              ２　ファイルの書き込み"); 
		System.out.println("              ３　ファイルの読み込み"); 
		System.out.println("              ４　終了"); 
		System.out.println(" "); 
		
		int a; 
		InputStreamReader isr= new InputStreamReader(System.in); 
		BufferedReader br = new BufferedReader(isr); 
		try{ 
		       String buf = br.readLine(); 
		       a = Integer.parseInt(buf); 
		}catch(Exception e){ 
		       a = 0; 
		} 

		if(a==1){
		System.out.println("ファイルを作成します");
		System.out.println("ファイル名を決めてください");
		
			String str1 = br.readLine(); 
			File newfile1 = new File("c:\\tmp\\"+str1); 
			newfile1.createNewFile(); 
		}else if(a==2){
			System.out.println("ファイルに書き込みします"); 
			System.out.println("ファイルを選択してください"); 
			String str2 = br.readLine(); 
			
			File newfile2 = new File(str2); 
			FileWriter filewriter2 = new FileWriter(newfile2); 
			
			newfile2.exists(); 
			System.out.print("内容を入力してください："); 
			
			
			String str3 = br.readLine(); 
			System.out.println(str3); 
			filewriter2.write(str3); 
			System.out.println("ファイルへの書き込みが完了しました"); 
			System.out.println(" "); 
			System.out.println("Enterでメニューに戻ります"); 
			filewriter2.close(); 

		}
	}
}