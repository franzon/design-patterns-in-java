package structural.facade;

class HttpClient {

    public String request(String url) {
        System.out.println("Requesting " + url);

        return "response";
    }
}
