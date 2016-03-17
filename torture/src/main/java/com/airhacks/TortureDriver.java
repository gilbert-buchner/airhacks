package com.airhacks;

import com.airhacks.insurance.control.InsuranceDataFetcher;
import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author airhacks.com
 */
@WebServlet("/st")
public class TortureDriver extends HttpServlet {

    @Inject
    InsuranceDataFetcher df;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print("" + df.amount());
    }

}
