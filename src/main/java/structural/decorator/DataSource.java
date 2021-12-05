package structural.decorator;

interface DataSource {
    void write(String text);
    String read();
}
