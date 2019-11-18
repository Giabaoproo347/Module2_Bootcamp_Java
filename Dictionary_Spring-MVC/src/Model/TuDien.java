package Model;

import java.util.HashMap;
import java.util.Map;

public class TuDien {

        public static Map<String, String> dictionary;

    static {
        dictionary = new HashMap<>();
        dictionary.put( "hello", "xin chào");
        dictionary.put("good bye", "tạm biệt");
        dictionary.put("dog", "con chó");
        dictionary.put("cat", "con mèo");
    }
}
