import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            // Create an instance of the server object
            Calculator calculator = new CalculatorImpl();

            // Create the RMI registry on the default port (1099)
            Registry registry = LocateRegistry.createRegistry(1099);

            // Bind the server object to the registry with a unique name
            registry.bind("CalculatorService", calculator);

            System.out.println("Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}