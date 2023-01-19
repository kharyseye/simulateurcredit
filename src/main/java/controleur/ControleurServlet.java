package controleur;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import metier.CreditMetierImpl;
import metier.ICreditMetier;
import model.CreditModel;

import java.io.IOException;

@WebServlet(name="controleur", urlPatterns="/controleur")
public class ControleurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ICreditMetier metier;
       
   
	public void init(ServletConfig config) throws ServletException {
		metier = new CreditMetierImpl();
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.setAttribute("creditModel", new CreditModel());
		request.getRequestDispatcher("vueCredit.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		double montant = Double.parseDouble(request.getParameter("montant"));
		double taux = Double.parseDouble(request.getParameter("taux"));
		int duree = Integer.parseInt(request.getParameter("duree"));
		
		CreditModel model = new CreditModel();
		model.setMontant(montant);
		model.setTaux(taux);
		model.setDuree(duree);
		
		double resultat = metier.calculMensualite(montant, taux, duree);
		
		model.setMensualite(resultat);
		
		request.setAttribute("creditModel", model);
		
		request.getRequestDispatcher("vueCredit.jsp").forward(request, response);
	}

}
