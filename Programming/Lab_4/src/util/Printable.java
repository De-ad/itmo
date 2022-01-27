package util;

public interface Printable {
    String getType();
    void getMessage(String message);
    void staySilentAbout();
    void print(String message);
}
