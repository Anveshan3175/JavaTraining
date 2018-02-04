package com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.UserBean;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("loginName");
		String password = request.getParameter("password");
		
		System.out.println("username : "+username +"  password"+password);
		request.setAttribute("username", username);
		
		UserBean userBean = new UserBean();
		userBean.setLoginName(username);
		request.setAttribute("uBean", userBean);
		//throw new RuntimeException();
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/welcome.jsp");
		rd.forward(request,response);
	}

}
