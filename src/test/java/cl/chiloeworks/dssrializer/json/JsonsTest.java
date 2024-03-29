package cl.chiloeworks.dssrializer.json;

import cl.chiloeworks.dssrializer.models.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Camilo Jorquera on 6/17/19
 */
@JsonTest
@RunWith(SpringRunner.class)
public class JsonsTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testSerialize() throws JsonProcessingException {
        User user = new User();
        user.setRut("17452210-2");
        user.setName("imcamilo");
        user.setAddress("github");
        assertThat(objectMapper.writeValueAsString(user)).contains("dni");
    }

    @Test
    public void testDeserialize() throws IOException {
        final String USER_JSON = "{\"dni\":\"24180705-5\",\"firstName\":\"Vol\",\"address\":\"Git\"}";
        User user = objectMapper.readValue(USER_JSON, User.class);
        assertThat(user.getRut()).isEqualTo("24180705-5");
    }

}