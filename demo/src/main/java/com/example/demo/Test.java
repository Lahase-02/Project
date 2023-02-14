package com.example.demo;

import java.io.File;
import java.io.IOException;

class M{  
	 void method()throws IOException{
		 File i = new File("c:");
	  throw new IOException("device error"); 
	 }  
	}  
	public class Test{  
	   public static void main(String args[]){  
	    try{  
	     M m=new M();  
	     m.method();  
	    }catch(Exception e){}     
	  
	    System.out.println("normal flow...");  
	  }  
	} 