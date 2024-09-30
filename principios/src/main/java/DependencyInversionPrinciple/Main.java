package DependencyInversionPrinciple;

public class Main {
    public static void main(String[] args) {
        DataStorage dbStorage = new DatabaseStorage();
        DataStorageService service1 = new DataStorageService(dbStorage);
        service1.store("User data");

        DataStorage fileStorage = new FileStorage();
        DataStorageService service2 = new DataStorageService(fileStorage);
        service2.store("Log data");
    }
}
