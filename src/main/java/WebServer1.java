import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class WebServer1 {
    public static void main(String[] args) throws Exception {
        new Server(8001) {{
            setHandler(new ServletContextHandler(){{
                           addServlet(new ServletHolder(new HttpServlet() {
                               @Override
                               protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
                                   resp.getWriter().write("hello world");
                               }
                           }),"/*");
                       }}
            );
            start();
            join();
        }};
    }
}