package com.hibernatefirstexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


//org = opensource hai 
//agar ye import nahi hua toh dependency is  missing hai
public class ClientSave {

	public static void main(String[] args) {
		
		//ye line always constant hoti hai //spring boot ye bhi automativc kr deta hai
		//or cfg.xml file bhi spring boot vo bhi auto kr deta hai
		//step(1)class load in jdbc
		Configuration cfg= new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);//pure code me bs class name he change hoga
		//strp(2)connection in jdbc
		//connection factory connection le rahe
		SessionFactory factory= cfg.buildSessionFactory();//connection factory
		
		Session session = factory.openSession(); //connection
		//Step-(3)
		Transaction trans= session.beginTransaction(); 
		Student stu= new Student(111, "Suk"); //(null=class name ,args = primary key)(param1,param2)
		
		session.save(stu);
		trans.commit();
		
		//But Hibernate annotations pe chlta hai so jao Student class me annotation lgao
		
		
		

	}

}
