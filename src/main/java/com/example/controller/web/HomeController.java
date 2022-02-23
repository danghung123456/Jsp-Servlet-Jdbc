package com.example.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.service.GenreService;
import com.example.service.MovieService;
import com.example.service.NationService;

@WebServlet(urlPatterns = { "/trang-chu" })
public class HomeController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7050788148223736617L;
	@Inject
	private MovieService moviesService;
	@Inject
	private GenreService genresService;
	@Inject
	private NationService nationsService;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		get data movie
		RequestDispatcher dispatcher = request.getRequestDispatcher("/decorators/web.jsp");
		request.setAttribute("movies", moviesService.findAll());
//		get data menu
		request.setAttribute("genres", genresService.findAll());
//		get data nation type movie
		request.setAttribute("nations", nationsService.findAll());
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) {

	}
}
