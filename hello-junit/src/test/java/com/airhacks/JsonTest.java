package com.airhacks;

import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author airhacks.com
 */
public class JsonTest {

    @Test
    public void readJson() throws FileNotFoundException {
        FileReader read = new FileReader("hello.json");
        JsonReader reader = Json.createReader(read);
        JsonObject object = reader.readObject();
        assertNotNull(object);
        System.out.println("object = " + object);
    }

}
