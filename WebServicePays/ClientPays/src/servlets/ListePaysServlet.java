package servlets;

import client.PaysServiceMonExceptionException;
import client.PaysServiceStub;
import org.apache.axis2.AxisFault;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class ListePaysServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            paysWebService(request, response);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void paysWebService(HttpServletRequest request, HttpServletResponse response) {
        PaysServiceStub service = null;
        try {
            service = new PaysServiceStub();
            PaysServiceStub.ConsulterListePays consulterListePays= new PaysServiceStub.ConsulterListePays();
            PaysServiceStub.ConsulterListePaysResponse consulterListePaysResponse ;
            List<PaysServiceStub.Pays> listPays = new ArrayList<>();
            consulterListePaysResponse = service.consulterListePays(consulterListePays);
            PaysServiceStub.Pays[] tabPays = consulterListePaysResponse.get_return();
            for (PaysServiceStub.Pays pays : tabPays) {
                listPays.add(pays);
            }
            request.setAttribute("listePays", listPays);

            this.getServletContext().getRequestDispatcher("/listePays.jsp").forward(request, response);
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

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            paysWebService(request, response);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
