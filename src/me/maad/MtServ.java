package me.maad;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Manan Sharma on 22-12-2016 for GoKrazee Innovations Private Limited.
 */
@WebServlet(name = "MtServ", urlPatterns = "/abc")
public class MtServ extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        if (request.getHeader("Content-Type").equalsIgnoreCase("application/json"))
            out.println("{\"name\":\"Manan\"}");
        else if (request.getHeader("Content-Type").equalsIgnoreCase("application/xml")) {
            out.println("<name>\n\tManan\n</name>");
        } else {
            out.println(" name Manan ");
        }

        out.println(Read.getBody(request));
        new Gson().fromJson(Read.getBody(request), ModelUsers.class);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendError(405, "This is not a valid port here.");
    }
}
