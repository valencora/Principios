package DependencyInversionPrinciple;

public class DataStorageService {
    private DataStorage dataStorage;

    public DataStorageService(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }

    public void store(String data) {
        dataStorage.saveData(data);
    }
}