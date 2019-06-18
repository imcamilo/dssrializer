## _dssrializer_

@JsonComponent implementation, serialize and deserialize JSON on Java/Spring 

Create POJO

```java
public class User
```
Create UserJsonSerializer class
```java
@JsonComponent
public class UserJsonSerializer extends JsonSerializer<User>
```
And UserJsonDeserializer class
```java
@JsonComponent
public class UserJsonDeserializer extends JsonDeserializer<User>
```
Automatic registration on ObjectMapper

How use it
```java
@Autowired
private ObjectMapper objectMapper;

//serialize
assertThat(objectMapper.writeValueAsString(user)).contains("dni");

//deserialize
User user = objectMapper.readValue(USER_JSON, User.class);
```
   
Test 

```groovy
gradle test
```
