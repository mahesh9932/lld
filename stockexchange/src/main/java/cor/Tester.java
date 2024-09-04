package cor;

public class Tester {
    public static void main(String[] args) {
        new GetDataApi().getData(new Request("header", null, "token"));
    }
}
