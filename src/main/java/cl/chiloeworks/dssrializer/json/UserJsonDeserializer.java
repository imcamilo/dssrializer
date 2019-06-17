package cl.chiloeworks.dssrializer.json;

import cl.chiloeworks.dssrializer.models.User;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.node.TextNode;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

/**
 * Created by Camilo Jorquera on 6/17/19
 */
@JsonComponent
public class UserJsonDeserializer extends JsonDeserializer<User> {

    @Override
    public User deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        TreeNode treeNode = p.getCodec().readTree(p);
        TextNode rut = (TextNode) treeNode.get("dni");
        TextNode firstName = (TextNode) treeNode.get("firstName");
        TextNode address = (TextNode) treeNode.get("address");
        return new User(rut.asText(), firstName.asText(), address.asText());
    }

}