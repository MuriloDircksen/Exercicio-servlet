package br.com.futurodev;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class CadastroAlunoPost extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();

        writer.println("<h1>Aluno cadastrado com sucesso!</h1>");

        String nome = req.getParameter("nome");
        String disciplina = req.getParameter("disciplina");
        String nota1 = req.getParameter("nota1");
        String nota2 = req.getParameter("nota2");
        String nota3 = req.getParameter("nota3");
        String nota4 = req.getParameter("nota4");

        Double dNota1 = Double.parseDouble(nota1);
        Double dNota2 = Double.parseDouble(nota2);
        Double dNota3 = Double.parseDouble(nota3);
        Double dNota4 = Double.parseDouble(nota4);
        double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;

        writer.println("<h3>Olá "+nome+" suas notas são nota 1: "+nota1+
                ", nota 2: "+nota2+", nota 3: "+nota3+", nota 4: " +nota4+
                ", e sua média na disciplina "+ disciplina+" foi "+media+".</h3>");

        if (media>=7){
            writer.println("<h4>Aprovado!</h4>");
        } else if (media>=6&&media<=6.9) {
            writer.println("<h4>Recuperação!</h4>");
        }else{
            writer.println("<h4>Reprovado!</h4>");
        }
    }

}
