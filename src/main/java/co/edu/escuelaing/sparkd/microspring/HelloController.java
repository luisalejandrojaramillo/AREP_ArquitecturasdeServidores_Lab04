package co.edu.escuelaing.sparkd.microspring;

public class HelloController {

    @RequestMapping("/hola")
    static public String index() {
        return "Greetings from Micro Spring Boot!";
    }

    @RequestMapping("/pi")
    static public String pi(){
        return "PI: " + Math.PI;
    }

    @RequestMapping("/pag")
    static public String pag() {
        String outputLine = "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<head>\n"
                + "<meta charset=\"UTF-8\">\n"
                + "<title>Title of the document</title>\n"
                + "</head>\n"
                + "<body>\n"
                + "<h1>Constante de Euler</h1>\n" + Math.E
                + "</body>\n"
                + "</html>\n";
        return outputLine;
    }

}
