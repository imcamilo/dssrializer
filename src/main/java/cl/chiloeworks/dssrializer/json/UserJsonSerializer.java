package cl.chiloeworks.dssrializer.json;

import cl.chiloeworks.dssrializer.models.User;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

/**
 * Created by Camilo Jorquera on 6/17/19
 */
@JsonComponent
public class UserJsonSerializer extends JsonSerializer<User> {

    @Override
    public void serialize(User user, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeStartObject();
            gen.writeStringField("dni",user.getRut());
            gen.writeStringField("firstName",user.getName());
            gen.writeStringField("address",user.getAddress());
        gen.writeEndObject();
    }

}
