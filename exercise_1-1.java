import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Exercise{
	public static void main(String []args) {
		Scanner s = new Scanner(System.in);	
		while(s.hasNext())
		{       
			String str = s.next();	
			System.out.print("This is "+str);
			Integer i = s.nextInt();
			System.out.println("This is "+i);
			Double d = s.nextDouble();
			System.out.println("This is "+d);
			System.out.printf("%d; %d; %f; %f ", -500, 2343L, -756.403f, 7464.232641d);
		}
	}
}