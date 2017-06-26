import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;


/**
 * @author Sasha on 6/27/2017.
 */
public class ApiTest {
    private String GET_LINK = "https://dev.twitter.com/rest/reference/get/statuses/home_timeline";
    private String GET_TEST_LINK = "https://api.twitter.com/1.1/statuses/home_timeline.json";

    @Test
    public void ApiVerifyGet() {
        Response value =get(GET_TEST_LINK);
        System.out.println(value.body().prettyPeek());
        value.then().assertThat().body("errors.code",equalTo(215));
    }


}
