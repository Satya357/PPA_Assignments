interface DataService {
    void fetchData();
}

class DatabaseService implements DataService {
    @Override
    public void fetchData() {
        System.out.println("Fetching data from the database");
    }
}

class APIService implements DataService {
    @Override
    public void fetchData() {
        System.out.println("Fetching data from the API");
    }
}

public class LooseCoupling {
    public static void main(String[] args) {
        DataService dataService = new DatabaseService();
        processData(dataService);
    }

    public static void processData(DataService dataService) {
        dataService.fetchData();
    }
}
