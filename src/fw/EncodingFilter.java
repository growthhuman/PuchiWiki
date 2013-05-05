package fw;

import java.io.*;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter implements Filter{

	public void init(FilterConfig filterConfig)
			throws ServletException {

	}

	public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain)
			throws IOException,ServletException{

		System.out.println("calls EncodingFilter#doFilter()");

		request.setCharacterEncoding("Windows-31J");
		chain.doFilter(request, response);
	}

	public void destroy() {

	}

}
