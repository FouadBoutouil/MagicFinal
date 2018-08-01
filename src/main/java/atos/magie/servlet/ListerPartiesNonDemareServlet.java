/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.magie.servlet;

import atos.magie.service.PartieService;
import atos.magie.spring.AutowireServlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Administrateur
 */
@WebServlet(name = "ListerPartiesNonDemaré", urlPatterns = {"/listerParties"})
public class ListerPartiesNonDemareServlet extends AutowireServlet {

    @Autowired
    PartieService serviceP;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("listePartie", serviceP.listePartiesNonDemaree());
        req.getRequestDispatcher("lister-parties.jsp").forward(req, resp);
    }

}
