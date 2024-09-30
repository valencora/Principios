package DependencyInversionPrinciple;

public class FileStorage implements DataStorage {
    @Override
    public void saveData(String data) {
        System.out.println("Saving data to a file: " + data);
    }
}