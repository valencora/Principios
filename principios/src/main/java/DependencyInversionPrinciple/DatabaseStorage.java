package DependencyInversionPrinciple;

public class DatabaseStorage implements DataStorage {
    @Override
    public void saveData(String data) {
        System.out.println("Saving data to the database: " + data);
    }
}