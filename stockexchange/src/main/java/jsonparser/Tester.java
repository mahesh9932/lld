package jsonparser;

import jsonparser.data.Json;
import jsonparser.parser.JsonParser;
import jsonparser.parser.NaiveJsonParser;
import jsonparser.tokenizer.NaiveTokenizer;

public class Tester {
    public static void main(String[] args) {
        String jsonText = "{\"k1\": \"abc\", \"sem-1\": {\"maths\":\"90\", \"phy\": { \"1\": \"90\", \"2\": \"20\"}  } }";
        JsonParser parser = new NaiveJsonParser(new NaiveTokenizer());
        Json json = parser.parse(jsonText);
        System.out.println(json.getKeys());
        System.out.println(parser.toString(json.get("sem-1")));
    }
}
