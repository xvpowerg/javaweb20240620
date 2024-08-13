package tw.com.cdi;

import java.util.ArrayList;

import jakarta.enterprise.inject.Produces;
import jakarta.inject.Named;
import tw.com.beans.MyApple;

public class MyProdues {
	
	@Produces
	@Named("redApple")
	private MyApple getRedApple() {
		MyApple myApple = new MyApple();
		myApple.setName("Red Apple");
		myApple.setPrice(100);
		return myApple;
	}
	
	@Produces
	@Named("appleList")
	private ArrayList<MyApple> getAppleList() {
		ArrayList<MyApple> myAppleList = new ArrayList();
		MyApple myApple1 = new MyApple();
		MyApple myApple2 = new MyApple();
		MyApple myApple3 = new MyApple();
		myApple1.setName("Appl1");
		myApple1.setPrice(10);
		myApple2.setName("Appl2");
		myApple2.setPrice(20);
		myApple3.setName("Appl3");
		myApple3.setPrice(30);
		myAppleList.add(myApple1);
		myAppleList.add(myApple2);
		myAppleList.add(myApple3);
		return myAppleList;
		
	}
	
}
