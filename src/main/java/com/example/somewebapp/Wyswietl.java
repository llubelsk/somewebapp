package com.example.somewebapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/wyswietl")

public class Wyswietl extends HttpServlet {	
	private static final long serialVersionUID = 1L;

	@Override

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {	
		
		  String imie = request.getParameter("imie");
		  String rok = request.getParameter("rok");
		  String plec = request.getParameter("plec");
		  String[] placek;
		  placek = request.getParameterValues("placek");
		  //String placek2 = request.getParameter("placek2");		  
		  String cars = request.getParameter("cars");
		  String toppings = request.getParameter("toppings");

		response.setContentType("text/html");		

		PrintWriter out = response.getWriter();	
		
		out.print("<html><body>" +		  
				"Imie: " + imie + "<br />" +
				"<br />" +
				"Rok urodzenia: " + rok + "<br />" +
				"<br />" +
				"Plec: " + plec + "<br />" +
				"<br />" +
				"Lubiane placki: <br />" +
				"</body></html>");
		
		for(int i = 0; i < placek.length; i++){
			out.print(placek[i] +"</br>"); }
		
		out.print("<html><body>" +
				"<br />" +
				"Posiadany samochod: " + cars + "<br />" +
				"<br />" +
				"Ulubione warzywo: " + toppings + "<br />" +				 
				"</body></html>");	
		
		
		
		out.close();
	}
}	
