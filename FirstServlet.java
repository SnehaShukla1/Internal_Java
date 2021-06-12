2.	import java.io.*;  
3.	import javax.servlet.*;  
4.	import javax.servlet.http.*;  
5.	  
6.	  
7.	public class FirstServlet extends HttpServlet {  
8.	  
9.	  public void doPost(HttpServletRequest request, HttpServletResponse response){  
10.	    try{  
11.	  
12.	    response.setContentType("text/html");  
13.	    PrintWriter out = response.getWriter();  
14.	          
15.	    String n=request.getParameter("userName");  
16.	    out.print("Welcome "+n);  
17.	  
18.	    Cookie ck=new Cookie("uname",n);
19.	    response.addCookie(ck);aa
20.	  
21.	      
22.	    out.print("<form action='servlet2'>");  
23.	    out.print("<input type='submit' value='go'>");  
24.	    out.print("</form>");  
25.	          
26.	    out.close();  
27.	  
28.	        }catch(Exception e){System.out.println(e);}  
29.	  }  
30.	}  
