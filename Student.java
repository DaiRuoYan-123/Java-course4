package wu;

public class Student {
	String name; //����
	String sex; //�Ա�
	int age;   //����
	String departments;//Ժϵ
	Student(String n,String s,int a,String d){     
		 this.name=n;    
		 this.sex=s;  
		 this.age=a;
		 this.departments=d;
		 
		 }
	public String toString() {
		return "������"+name+"\n"+"�Ա�"+sex+"\n"+"���䣺"+age+"\n"+"Ժϵ�༶��"+departments;
	}

}
