package com.example.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.GenreModel;
import com.example.model.NationModel;
import com.example.service.GenreService;
import com.example.service.NationService;

/**
 * Servlet implementation class GenreController
 */
@WebServlet(urlPatterns = { "/the-loai" })
public class GenreController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GenreController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Inject
	GenreService genreService;
	@Inject
	NationService nationService;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		GenreModel genre = new GenreModel();
		genre.setGenreName("AAA");
		genreService.insert(genre);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/web/genre.jsp");
//		request.setAttribute("movies", moviesService.findById(1l));
//		request.setAttribute("genres", genreService.findbyId(3l));
		request.setAttribute("genres", genreService.findAll());
		request.setAttribute("nations", nationService.findAll());
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
