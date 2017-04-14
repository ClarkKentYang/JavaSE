package com.milan.request;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestDemo
 */
public class RequestDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getMethod();
		String uri= request.getRequestURI();
		StringBuffer url = request.getRequestURL();
		String path = request.getContextPath();
		String parms= request.getQueryString();
		String IP = request.getRemoteAddr();
		String host= request.getRemoteHost();
		int port = request.getRemotePort();
		String user = request.getRemoteUser();
		
		String username = request.getParameter("username");//类似的方法还有
		request.getParameterValues("");//返回所有的值
		request.getParameterNames();//返回所有的请求参数
		request.getParameterMap();//返回参数的键值对
		
		System.out.println("method:"+method);//请求方式
		System.out.println("uri:"+uri);//请求资源
		System.out.println("url:"+url);//请求地址
		System.out.println("path:"+path);//项目路径
		System.out.println("parms:"+parms);//请求参数，post请求为null
		System.out.println("IP:"+ IP);
		System.out.println("host:"+ host);
		System.out.println("port:"+ port);
		System.out.println("user:"+ user);
		
		System.out.println("username:"+username);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
