package com.milan.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servletContextTest
 */
public class servletContextTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletContextTest() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		ServletContext servletContext = getServletContext();
		//获取到web.mxl中设置的全局参数
		System.out.println(servletContext.getInitParameter("servletContext-name"));
		
		//获取文件*。txt
		String realPath_A = servletContext.getRealPath("/a.txt");
		System.out.println(realPath_A);
		
		String realPath_B = servletContext.getRealPath("/WEB-INF/b.txt");
		System.out.println(realPath_B);
		
		String realPath_C = servletContext.getRealPath("/WEB-INF/classes/c.txt");
		System.out.println(realPath_C);
	
		//d.txt没有被发布，所以获取不到
	}
}
