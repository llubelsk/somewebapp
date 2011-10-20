package com.example.somewebapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/message")

public class Dane extends HttpServlet {	
	private static final long serialVersionUID = 1L;

	@Override

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		

		response.setContentType("text/html");		

		PrintWriter out = response.getWriter();	
		out.print("<html><body>" +			

		"<form method=\"post\" action =\""+ request.getContextPath() + "/message\" >" +
		
		"Imie: <input type='text' name='imie' /><br />" +

		"Rok urodzenia: <input type='integer' name='rok' /><br />" +		

		"Plec:<br />" +
		"<input type='radio' name='plec' value='mezczyzna' /> Mezczyzna<br />" +
		"<input type='radio' name='plec' value='kobieta' /> Kobieta<br />" +	

		"Jakie placki lubisz:<br />" + 
		"<input type='checkbox' name='placek1' value='Jablkowe' /> Jablkowe <br />" +
		"<input type='checkbox' name='placek2' value='Wisniowe' /> Wisniowe<br />" +

		"<action=''>" +
		"<select name='cars'>" +
		"<option value='volvo'>Volvo</option>" +
		"<option value='saab'>Saab</option>" +
		"<option value='fiat'>Fiat</option>" +
		"<option value='audi'>Audi</option>" +
		"</select><br />" +	

		"<SELECT NAME='toppings' MULTIPLE SIZE=5>" +
		"<OPTION VALUE='mushrooms'>mushrooms" +
		"<OPTION VALUE='greenpeppers'>green peppers" +
		"<OPTION VALUE='onions'>onions" +
		"<OPTION VALUE='tomatoes'>tomatoes" +
		"<OPTION VALUE='olives'>olives" +
		"</SELECT><br />" +	
		
		"<input type='submit' value='Submit' /></form>" +		

		"</body></html>");	
		
	}
	
	  public void doPost(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, java.io.IOException {

		  String imie = request.getParameter("imie");
		  String rok = request.getParameter("rok");
		  String plec = request.getParameter("plec");
		  String placek1 = request.getParameter("placek1");
		  String placek2 = request.getParameter("placek2");
		  String cars = request.getParameter("cars");
		  String toppings = request.getParameter("toppings");
		  
		  response.setContentType("text/html");
		  
		  PrintWriter out = response.getWriter();
		  
		  out.print("<html><body>" +		  
				 "Imie: " + imie + "<br />" +
				 "Rok urodzenia: " + rok + "<br />" +
				 "Plec: " + plec + "<br />" +
				 "Lubiane placki: " + placek1 + " " + placek2 + "<br />" +
				 "Posiadany samochod: " + cars + "<br />" +
				 "Ulubione warzywo: " + toppings + "<br />" +
				 
	  		"</body></html>");		
		  
	  }
	
}

