package codeu.controller;

import java.io.IOException;
import java.time.Instant;
import java.util.List;
import java.util.UUID;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jsoup.Jsoup;
import org.jsoup.safety.Whitelist;

/** 
 * This servlet class is for the admin page
 * it will handle getting all the database information
 * and showing stats about it.
 */
public class AdminServlet extends HttpServlet {
  /** 
   * TO-DO(Matthew Oakley) I need to add getting the data from the 
   * the database and checking to make sure its valid and not null
   * and sending this information to the webpage
   */
  
  /** This is for the inital setup of the admin page */
  @Override
  public void init() throws ServletException {
    super.init();
  }
  
  /** when user visits this sends them to admin page */
  @Override
  public void doGet(HttpServletRequest request, 
      HttpServletResponse response)
      throws IOException, ServletException {
    String requestUrl = request.getRequestURI();
    
    request.getRequestDispatcher("/WEB-INF/view/admin.jsp").forward(request, response);
  }
}