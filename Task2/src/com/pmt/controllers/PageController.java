package com.pmt.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pmt.exceptions.NotSupportNegativeException;
import com.pmt.utils.MyBigNumber;

/**
 * Servlet implementation class BigNumberController
 */
@WebServlet("/")
public class PageController extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * Default constructor.
   */
  public PageController() {
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/home.jsp");
    dispatcher.forward(request, response);
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // TODO Auto-generated method stub
    String s1 = request.getParameter("number1");
    String s2 = request.getParameter("number2");
    String result = "";
    try {
      MyBigNumber myBigNumber = new MyBigNumber();
      result = "Result: " + myBigNumber.sum(s1, s2);
    } catch (NumberFormatException e) {
      result = e.getMessage();
    } catch (NotSupportNegativeException e) {
      result = e.getMessage();
    } catch (Exception e) {
      result = e.getMessage();
    } finally {
      response.getWriter().write(result);
    }

  }

}
