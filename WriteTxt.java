package wu;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteTxt {
	 public static void main(String[] args) throws IOException{
		 try {
	        String path = "E:\\javashiyan\\B.txt";
	        File file = new File(path);
	        if(!file.exists()){
	            file.getParentFile().mkdirs();          
	            }//����TXTB�ļ�
	        file.createNewFile();
	 
	         //write
	            FileWriter fileWriter =new FileWriter(file);
	            fileWriter.write("");
	            fileWriter.flush();
	            fileWriter.close();//���ԭ�ļ�����
	       
	    
	        FileWriter b = new FileWriter(file, true);
	        BufferedWriter b1 = new BufferedWriter(b);
	      
		   
	        b1.write("������ɫ˼�����������󲻵������Ů���������������δʶ��������������һ��ѡ�ھ��������һЦ������������������ɫ������ԡ�������Ȫˮ��ϴ��֬�̶���������ʼ���³ж���ʱ���޻��ս�ҡܽ����ů�ȴ�����������ո���Ӵ˾������糯�л���������Ͼ���Ӵ���ҹרҹ�󹬼�����ǧ����ǧ�谮��һ�����ױ�ɽ���ҹ��¥�����ʹ���õ��ֽ���ʿ����������Ż��������¸�ĸ�Ĳ�����������Ů�깬�ߴ����������ַ�Ʈ�����Ż���������˿���վ�������������ܱ�Ķ����������������������س����̳���ǧ�����������д仪ҡҡ�и�ֹ�������Ű����������������κ���ת��ü��ǰ������ί�������մ��̽�ȸ��ɦͷ��������Ȳ��ûؿ�Ѫ��������ư�ɢ����������ջ�����ǽ������ɽ������������޹���ɫ����ˮ����ɽ��ʥ������ĺĺ���й���������ɫҹ�����峦����������ת����Ԧ���˳������ȥ�������������в������տ�����������˾�մ�¶�����������������Է������̫Һܽ��δ����ܽ����������ü�Դ���β��ᴹ�����������������ͩҶ��ʱ�������ڶ������Ҷ���׺첻ɨ��԰���Ӱ׷��½������������Ϧ��ө��˼��Ȼ�µ�����δ���߳ٳ��ӹĳ���ҹ�����Ǻ�������ԧ������˪�����������˭�빲��������������ǲ���������������ʿ�趼�����Ծ����»���Ϊ�о���շת˼��̷�ʿ�������ſ�Ԧ����������������֮����������»�Ȫ����ãã�Բ������ź�������ɽɽ�����������¥���������������д�Լ����������һ����̫��ѩ����ò�β��ǽ�������ߵ����ת��С��˫���ŵ���������ʹ�Ż������λ꾪�����������ǻ��鲭�������ο����ް�ƫ��˯�����ڲ����������紵����Ʈ�u�������������������ݼ�į�������滨һ֦�����꺬������л����һ����������ã������������������������³���ͷ������徴���������������Ω�������������Ͻ��μĽ�ȥ����һ�ɺ�һ����뢻ƽ�Ϸ��䵫�����ƽ���������˼������ٱ������ؼĴʴ�����������֪�������ճ�����ҹ������˽��ʱ����Ը���������ڵ�ԸΪ����֦�쳤�ؾ���ʱ���˺������޾���"
	        		);
	      
	        b1.flush();// �ѻ���������ѹ���ļ�
	        b1.close(); 
	        //
	        FileReader f = new FileReader(file);
	        BufferedReader br = new BufferedReader(f);
	        String str = br.readLine();
	        StringBuffer s=new StringBuffer(str);
	        
	         
	        	for (int j = 7;j<s.length();j+=15) {
	        	        s.insert(j, "��");//�ӵڰ˸���Ϊ��һ����Ӷ��ŵĵط�������ÿ��7λ�����ڵڰ�λ��Ӷ���
	        	    }
	        	 for (int i = 15;i<s.length();i+=16) {
	                 s.insert(i, "��");
	                }
	             for (int c = 16;c<s.length();c+=17) {
	                s.insert(c, "\n");
	                }
	            
	 
	        String path2 = "E:\\javashiyan\\A.txt";
	        File file2 = new File(path2);
	       
	        if(!file2.exists()){
	            file2.getParentFile().mkdirs();          
	        }//����TXTA�ļ�
	        file2.createNewFile();
	        // write
	        FileWriter fileWriter2 =new FileWriter(file2);
            fileWriter2.write("");
            fileWriter2.flush();
            fileWriter2.close();//���ԭ�ļ�����
            
	        FileWriter a = new FileWriter(file2, true);
	        BufferedWriter a1 = new BufferedWriter(a);
	        a1.write("");//���ԭ�ļ����� 
	        Scanner console=new Scanner(System.in); //�ӱ�׼�����豸��һ���Ǽ��̣��ж�ȡ��
			 System.out.println("�������������:");
		     String na = console.nextLine();//�ַ����͵����뷽ʽ
		     System.out.println("����������Ա�:");
		     String se = console.nextLine();//�ַ����͵����뷽ʽ
		     System.out.println("���������Ժϵ�༶:");
		     String d1 = console.nextLine();//�ַ����͵����뷽ʽ		     
		     System.out.println("�������������:");
		     int a2 = console.nextInt();//�������͵����뷽ʽ	
		     Student g=new Student(na,se,a2,d1);
		    String m="ѧ����Ϣ��";
		    a1.write(m+"\r\n"+"*********************************************"+"\r\n");
		    a1.write(g+"\r\n");//�س�������//���������Ϣ
		    String n="ѧ����ҵ��";
		    a1.write(n+"\r\n"+"*********************************************"+"\r\n");
	        a1.write(s.toString());
	        a1.flush();// �ѻ���������ѹ���ļ�
            a1.close();
            System.out.println("===========д���ı��ɹ�========");
	        } catch (IOException e) {
	            e.printStackTrace();
	        } 

	        
	       
	 }
}
