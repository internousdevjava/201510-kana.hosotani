import java.io.*;
public class kisokadai3 {
	public static void main(String[] args)throws IOException{
		
		System.out.println("              ���j���[��\�����܂�     "); 
		System.out.println("              �ԍ�����͂��Ă�������     "); 
		System.out.println("               1  �t�@�C���̍쐬"); 
		System.out.println("               2  �t�@�C���̏�������"); 
		System.out.println("               3  �t�@�C���̓ǂݍ���"); 
		System.out.println("               4  �I��"); 
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
		System.out.println("�t�@�C�����쐬���܂�");
		System.out.println("�t�@�C���������߂Ă�������");
		
			String str1 = br.readLine(); 
			File newfile1 = new File("c:\\tmp\\"+str1); 
			newfile1.createNewFile(); 
		}else if(a==2){
			System.out.println("�t�@�C���ɏ������݂����܂�"); 
			System.out.println("�t�@�C����I�����Ă�������"); 
			String str2 = br.readLine(); 
			
			File newfile2 = new File(str2); 
			FileWriter filewriter2 = new FileWriter(newfile2); 
			
			newfile2.exists(); 
			System.out.print("���͂��Ă�������   ��  "); 
			
			
			String str3 = br.readLine(); 
			System.out.println(str3); 
			filewriter2.write(str3); 
			System.out.println("�t�@�C���ɏ������݂��܂���"); 
			System.out.println(" "); 
			System.out.println("Enter�Ń��j���[�ɖ߂�܂�"); 
			filewriter2.close(); 

		}
	}
}