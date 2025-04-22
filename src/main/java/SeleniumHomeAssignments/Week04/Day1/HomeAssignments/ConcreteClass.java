package SeleniumHomeAssignments.Week04.Day1.HomeAssignments;

public class ConcreteClass implements DatabaseConnection {

    @Override
    public void connect() {
        System.out.println("Connected to the database");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from the database");
    }

    @Override
    public void executeUpdate() {
        System.out.println("Update executed");
    }
}
