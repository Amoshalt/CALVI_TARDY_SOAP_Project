package servlets;

import client.PaysServiceMonExceptionException;
import client.PaysServiceStub;
import org.apache.axis2.AxisFault;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.rmi.RemoteException;

public class PaysServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        paysWebService(request,response);
    }

    private void paysWebService(HttpServletRequest request, HttpServletResponse response) {

        try {
            PaysServiceStub service = new PaysServiceStub();
            PaysServiceStub.ConsulterPays consulterPays = new PaysServiceStub.ConsulterPays();
            PaysServiceStub.ConsulterPaysResponse consulterPaysResponse;
            PaysServiceStub.Pays pays;
            consulterPays.setNom(request.getParameter("nom"));
            consulterPaysResponse = service.consulterPays(consulterPays);
            pays = consulterPaysResponse.get_return();
            request.setAttribute("pays", pays);
            this.getServletContext().getRequestDispatcher("/pays.jsp").forward(request, response);
        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (PaysServiceMonExceptionException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        try {
            paysWebService(request, response);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
