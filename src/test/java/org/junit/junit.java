package org.junit;



import static org.junit.Assert.assertEquals;

import java.util.Date;

public class junit extends BaseMethod{
	@BeforeClass
	public static void BeforeClass(){
		browserlaunch("chromee");
		System.out.println("beforecloass");
		
	}
	@Before
	public void before(){
   System.out.printf("date",new Date());
	   
	}
	@Test
	public  void test() {
 	geturl("https://adactinhotelapp.com/");
	Logipage l=new Logipage();
	sendkeys(l.user(),"Anil6536");
	String a = getattribute(l.user());
	Assert.assertEquals("Anil6536",a);
	sendkeys(l.pass(),"Anil6536");
	String getattribute = getattribute(l.pass());
	Assert.assertEquals("Anil6536", getattribute);
	
	
	}
	
	

}
