package servlet;

import com.perp.beans.PerpSasEnv;

import com.vc.sasn.bookmarks.Index;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class BookmarkProcessServlet extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=UTF-8";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException,
                                                           IOException {
        String bookmark = request.getParameter("bookmark");
        Index index = new Index();
        index.setBookmark(bookmark);
        response.setContentType(CONTENT_TYPE);        
        response.sendRedirect("http://127.0.0.1:7101/sasn/faces/index?bookmark=" + bookmark);

    }
}
