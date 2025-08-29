import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        port(9000);
        get("/", (req, res) -> "Hello from Microservice App!");
    }
}
