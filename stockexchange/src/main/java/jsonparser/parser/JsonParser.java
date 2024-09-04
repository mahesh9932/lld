package jsonparser.parser;

import jsonparser.data.Json;

public interface JsonParser {
    Json parse(String jsonText);

    String toString(Json json);
}
