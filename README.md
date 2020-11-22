# 计191戴若妍2019311217

## 实验目的

1.掌握字符串String及其方法的使用
2.掌握文件的读取/写入方法
3.掌握异常处理结构

## 实验内容

在某课上,学生要提交实验结果，该结果存储在一个文本文件A中。
文件A包括两部分内容：
一是学生的基本信息；
二是学生处理后的作业信息，该作业的业务逻辑内容是：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能方法，实现如下功能：

1.每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
2.允许提供输入参数，统计古诗中某个字或词出现的次数
3.输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A
4.考虑操作中可能出现的异常，在程序中设计异常处理程序

输入：汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行<未完，待续>

输出：
汉皇重色思倾国，御宇多年求不得。
杨家有女初长成，养在深闺人未识。
天生丽质难自弃，一朝选在君王侧。
回眸一笑百媚生，六宫粉黛无颜色。
春寒赐浴华清池，温泉水滑洗凝脂。
侍儿扶起娇无力，始是新承恩泽时。
云鬓花颜金步摇，芙蓉帐暖度春宵。
春宵苦短日高起，从此君王不早朝。
......

## 实验要求

1.设计学生类（可利用之前的）；
2.采用交互式方式实例化某学生；
3.设计程序完成上述的业务逻辑处理，并且把“古诗处理后的输出”结果存储到学生基本信息所在的文本文件A中。

## 实验过程

1.先设计学生类创建学生基本信息；

2.在WriteTxt类中创建文本B本次实验将文本B路径设计为"E:\\javashiyan\\B.txt"；

3.将作业信息输入到文本B中，运用b1.write()写入内容；

4.利用已学的字符串处理知识编程将古诗的整理对齐，采用for循环（从第7个个字开始每隔15个加一个“，”，从第15个字开始每隔16个加一个“。”，从第16个开始每隔17个加一个换行符。）；

5.添加路径"E:\\javashiyan\\A.txt"，创建文本文件A；

6.将所处理的作业信息s化为s.toString()字符串形式用a1.write()写入文本文件A中;

7.运用Scanner类交互式方法将学生信息实例化，Scanner console=new Scanner(System.in); 从标准输入设备（一般是键盘）中读取信息；

8.将个人信息以字符串形式用a1.write()写入文本文件A中；

9.用于try-catch语句判断语句是否异常，发在输入属性那段语句中，运用printStackTrace()在命令行打印异常信息在程序中出错的位置及原因。

## 核心代码

1.创建文本文件，添加路径，判断文件是否存在，不存在则创建文件
```
String path = "E:\\javashiyan\\B.txt";
	        File file = new File(path);
	        if(!file.exists()){
	            file.getParentFile().mkdirs();          
	            }//创建TXTB文件
	        file.createNewFile();
 ```
2.将内容写入文件中，创建“文件输出流”对应的BufferedWriter，将缓冲区的内容写入到输出流。
```
FileWriter b = new FileWriter(file, true);
	        BufferedWriter b1 = new BufferedWriter(b);
	        b1.write("汉皇重色思倾国......恨绵绵无绝期");
	        b1.flush();// 把缓存区内容压入文件
	        b1.close(); 
``` 
3.取读文件内容，运用 BufferedReader类从字符输入流中读取文本内容并缓冲字符，以便有效地读取字符，数组和行,用a1.write()将内容写入
```
FileReader f = new FileReader(file);
	        BufferedReader br = new BufferedReader(f);
	        String str = br.readLine();
	        StringBuffer s=new StringBuffer(str);
```
```
a1.write(g+"\r\n");//回车并换行//输入个人信息

a1.write(s.toString());
```
4.采用for循环，对文本内容进行处理
```
for (int j = 7;j<s.length();j+=15) {
	        	        s.insert(j, "，");
	        	    }
	        	 for (int i = 15;i<s.length();i+=16) {
	                 s.insert(i, "。");
	                }
	             for (int c = 16;c<s.length();c+=17) {
	                s.insert(c, "\n");
	                }
  ```  
5.  写入内容前将原文件中的内容清空，方便阅读
```
FileWriter fileWriter2 =new FileWriter(file2);
            fileWriter2.write("");
            fileWriter2.flush();
            fileWriter2.close();//清空原文件内容
```
 6.用 try-catch语句判断语句是否异常， 运用printStackTrace()在命令行打印异常信息在程序中出错的位置及原因
 ```
 try {
 } catch (IOException e) {
	            e.printStackTrace();
	        } 
 ```
 ## 运行结果
 ![a](
 ![b](
 ![c](
 


