package wiki;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

public class CreateServlet extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException{
		//######ì˙ñ{åÍèoóÕëŒâû
		response.setContentType("text/html; charset=Windows-31J");

		String name = request.getParameter("name");
		String content = request.getParameter("content");

		System.out.println("---------------------------");
		System.out.println(content);

		try {
			if(content==""){
				request.getRequestDispatcher("create.jsp").forward(request, response);
			}else{
			WikiPage wikipage = new WikiPage();
			wikipage.setName(name);
			wikipage.setContent(content);

			WikiPageDAO.getInstance().insert(wikipage);
			RequestUtils.setMessage(request,"Made " + name  );

			request.getRequestDispatcher("/refer").forward(request, response);
			}
		}catch(SQLException e){
			throw new ServletException(e);
		}
	}


}
