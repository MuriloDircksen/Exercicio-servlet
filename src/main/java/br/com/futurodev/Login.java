package br.com.futurodev;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();

        String login = req.getParameter("login");
        String password = req.getParameter("password");


        if(login.equals("admin")){
            if(password.equals("password")){
                writer.println("<h4>Bem vindo usuario " +login+"! </h4>");
            }else{
                writer.println("<h4> Login e/ou senha inválidos </h4>");
            }
        }else{
            writer.println("<h4> Login e/ou senha inválidos </h4>");
        }
    }
}
