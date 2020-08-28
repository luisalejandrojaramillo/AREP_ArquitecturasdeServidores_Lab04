package co.edu.escuelaing.sparkd.microspring;

import co.edu.escuelaing.sparkd.httpserver.HttpServer;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MicroSpringBoot {


    public static void main(String[] args) {

        args[0]="co.edu.escuelaing.sparkd.HelloController";
        try {
            MicroSpring iocServer = new MicroSpring();
            iocServer.start(args);
            HttpServer server = new HttpServer(iocServer);
            server.start();
        } catch (Exception ex) {
            Logger.getLogger(MicroSpringBoot.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
