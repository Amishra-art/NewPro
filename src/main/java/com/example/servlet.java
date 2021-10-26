package com.example;

import java.io.IOException;
import java.io.PrintWriter;
//import java.rmi.ServerError;
import java.rmi.ServerException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet extends HttpServlet{
    public void processRequest(HttpServletRequest request, HttpServletResponse responce) throws
    IOException{
        responce.setContentType("text/html;charset-UTF-8");
        PrintWriter out=responce.getWriter();
        try{

            out.println("<html>");
            out.println("<body>");
            out.println("<h1>Hello all from servelet</h1>");
            out.println("<h1>servlet NewServlet at" + request.getContextPath() + "</h1>");
            String usre = request.getParameter("user");
            out.println("<h2> Welcome" + usre + "</h2>");
            out.println("<body>");
            out.println("<html>");

            
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            out.close();    
        }
    
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse responce) throws
    ServerException, IOException {
        processRequest(request, responce);

    }
    public void doPost(HttpServletRequest request, HttpServletResponse responce) throws
    ServerException, IOException {
        processRequest(request, responce);

    }
    
}
