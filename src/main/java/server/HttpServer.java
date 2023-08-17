package server;

import java.io.File;

public class HttpServer {
    public static final String WEB_ROOT =
            System.getProperty("user.dir") + File.separator + "webroot";

    public static void main(String[] args) {
        HttpConnector connector = new HttpConnector();
        ServletContext container = new ServletContext();
        connector.setContainer(container);
        container.setConnector(connector);
        connector.start();
    }

}