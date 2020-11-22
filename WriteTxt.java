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
	            }//创建TXTB文件
	        file.createNewFile();
	 
	         //write
	            FileWriter fileWriter =new FileWriter(file);
	            fileWriter.write("");
	            fileWriter.flush();
	            fileWriter.close();//清空原文件内容
	       
	    
	        FileWriter b = new FileWriter(file, true);
	        BufferedWriter b1 = new BufferedWriter(b);
	      
		   
	        b1.write("汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行翠华摇摇行复止西出都门百余里六军不发无奈何宛转蛾眉马前死花钿委地无人收翠翘金雀玉搔头君王掩面救不得回看血泪相和流黄埃散漫风萧索云栈萦纡登剑阁峨嵋山下少人行旌旗无光日色薄蜀江水碧蜀山青圣主朝朝暮暮情行宫见月伤心色夜雨闻铃肠断声天旋地转回龙驭到此踌躇不能去马嵬坡下泥土中不见玉颜空死处君臣相顾尽沾衣东望都门信马归归来池苑皆依旧太液芙蓉未央柳芙蓉如面柳如眉对此如何不泪垂春风桃李花开日秋雨梧桐叶落时西宫南内多秋草落叶满阶红不扫梨园弟子白发新椒房阿监青娥老夕殿萤飞思悄然孤灯挑尽未成眠迟迟钟鼓初长夜耿耿星河欲曙天鸳鸯瓦冷霜华重翡翠衾寒谁与共悠悠生死别经年魂魄不曾来入梦临邛道士鸿都客能以精诚致魂魄为感君王辗转思遂教方士殷勤觅排空驭气奔如电升天入地求之遍上穷碧落下黄泉两处茫茫皆不见忽闻海上有仙山山在虚无缥渺间楼阁玲珑五云起其中绰约多仙子中有一人字太真雪肤花貌参差是金阙西厢叩玉扃转教小玉报双成闻道汉家天子使九华帐里梦魂惊揽衣推枕起徘徊珠箔银屏迤逦开云鬓半偏新睡觉花冠不整下堂来风吹仙袂飘飖举犹似霓裳羽衣舞玉容寂寞泪阑干梨花一枝春带雨含情凝睇谢君王一别音容两渺茫昭阳殿里恩爱绝蓬莱宫中日月长回头下望人寰处不见长安见尘雾惟将旧物表深情钿合金钗寄将去钗留一股合一扇钗擘黄金合分钿但教心似金钿坚天上人间会相见临别殷勤重寄词词中有誓两心知七月七日长生殿夜半无人私语时在天愿作比翼鸟在地愿为连理枝天长地久有时尽此恨绵绵无绝期"
	        		);
	      
	        b1.flush();// 把缓存区内容压入文件
	        b1.close(); 
	        //
	        FileReader f = new FileReader(file);
	        BufferedReader br = new BufferedReader(f);
	        String str = br.readLine();
	        StringBuffer s=new StringBuffer(str);
	        
	         
	        	for (int j = 7;j<s.length();j+=15) {
	        	        s.insert(j, "，");//从第八个组为第一个添加逗号的地方，而后每隔7位，即在第八位添加逗号
	        	    }
	        	 for (int i = 15;i<s.length();i+=16) {
	                 s.insert(i, "。");
	                }
	             for (int c = 16;c<s.length();c+=17) {
	                s.insert(c, "\n");
	                }
	            
	 
	        String path2 = "E:\\javashiyan\\A.txt";
	        File file2 = new File(path2);
	       
	        if(!file2.exists()){
	            file2.getParentFile().mkdirs();          
	        }//创建TXTA文件
	        file2.createNewFile();
	        // write
	        FileWriter fileWriter2 =new FileWriter(file2);
            fileWriter2.write("");
            fileWriter2.flush();
            fileWriter2.close();//清空原文件内容
            
	        FileWriter a = new FileWriter(file2, true);
	        BufferedWriter a1 = new BufferedWriter(a);
	        a1.write("");//清空原文件内容 
	        Scanner console=new Scanner(System.in); //从标准输入设备（一般是键盘）中读取数
			 System.out.println("请输入你的姓名:");
		     String na = console.nextLine();//字符类型的输入方式
		     System.out.println("请输入你的性别:");
		     String se = console.nextLine();//字符类型的输入方式
		     System.out.println("请输入你的院系班级:");
		     String d1 = console.nextLine();//字符类型的输入方式		     
		     System.out.println("请输入你的年龄:");
		     int a2 = console.nextInt();//整数类型的输入方式	
		     Student g=new Student(na,se,a2,d1);
		    String m="学生信息：";
		    a1.write(m+"\r\n"+"*********************************************"+"\r\n");
		    a1.write(g+"\r\n");//回车并换行//输入个人信息
		    String n="学生作业：";
		    a1.write(n+"\r\n"+"*********************************************"+"\r\n");
	        a1.write(s.toString());
	        a1.flush();// 把缓存区内容压入文件
            a1.close();
            System.out.println("===========写入文本成功========");
	        } catch (IOException e) {
	            e.printStackTrace();
	        } 

	        
	       
	 }
}
