1.	import java.io.*;  
2.	import javax.servlet.*;  
3.	import javax.servlet.http.*;  
4.	  
5.	public class SecondServlet extends HttpServlet {  
6.	  
7.	public void doPost(HttpServletRequest request, HttpServletResponse response){  
8.	    try{  
9.	  
10.	    response.setContentType("text/html");  
11.	    PrintWriter out = response.getWriter();  
12.	      
13.	    Cookie ck[]=request.getCookies();  
14.	    out.print("Hello "+ck[0].getValue());  
15.	  
16.	    out.close();  
17.	  
18.	         }catch(Exception e){System.out.println(e);}  
19.	    }  
20.	      
21.	  
22.	}  
