package structural.facade;

import java.util.List;

class Facade {

    private final HttpClient client;
    private final Repository repository;
    private final Filesystem filesystem;

    public Facade(HttpClient client, Repository repository, Filesystem filesystem) {
        this.client = client;
        this.repository = repository;
        this.filesystem = filesystem;
    }

    public void doSomeOperation() {
        String data = client.request("127.0.0.1");
        List<Integer> numbers = repository.getNumbers();

        filesystem.writeFile(data + numbers.toString());
    }
}
