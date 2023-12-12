package com.hibernatefirstexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


//org = opensource hai 
//agar ye import nahi hua toh dependency is  missing hai
public class Client {

	public static void main(String[] args) {
		
		//ye line always constant hoti hai //spring boot ye bhi automativc kr deta hai
		//or cfg.xml file bhi spring boot vo bhi auto kr deta hai
		//step(1)(class load like in jdbc)
		Configuration cfg= new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);//pure code me bs class name he change hoga
		//step(2)connection like in jdbc
		//connection factory connection le rahe
		SessionFactory factory= cfg.buildSessionFactory();//connection factory
		
		Session session = factory.openSession(); //connection
		//load method se tum data nikal payogei
		//hibernate bolta :teko data hona toh tu only primary key se he nikal skta hai bs
		//(step 3) create statment like in jdbc
		Student stu = session.load(Student.class, 106);//(null=class name ,args = primary key)(param1,param2)
		//
		System.out.println("Student detail : "+ stu);
		
		//But Hibernate annotations pe chlta hai so Student.class me annotation lgao
		
		
		

	}

}
