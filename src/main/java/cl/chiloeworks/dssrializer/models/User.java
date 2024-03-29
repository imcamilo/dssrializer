package cl.chiloeworks.dssrializer.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Camilo Jorquera on 6/17/19
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String rut;
    private String name;
    private String address;

}
