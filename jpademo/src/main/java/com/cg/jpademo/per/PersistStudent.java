package com.cg.jpademo.per;

import javax.persistence.*;

import com.cg.jpademo.Student;  
public class PersistStudent {  
      
    public static void main(String args[])  
    {  
          
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student_details");  
        EntityManager em=emf.createEntityManager();  
          
em.getTransaction().begin();  
          
        Student s1=new Student();  
        s1.setId(101);  
        s1.setName("Gaurav");  
        //s1.setS_age(24);  
          
        Student s2=new Student();   
        s2.setId(102);  
        s2.setName("Ronit");  
        //s2.setS_age(22);  
          
        Student s3=new Student();   
        s3.setId(103);  
        s3.setName("Rahul");  
        //s3.setS_age(26);  
          
        em.persist(s1);  
        em.persist(s2);  
        em.persist(s3);       
  
em.getTransaction().commit();  
          
        emf.close();  
        em.close();  
          
    }  
}  