package generic;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.assertEquals;
import io.restassured.response.Response;

public class Assertions_Methods {

	Response response;

	public void verifyResponseBody(String actual, String expected) {
		assertEquals(actual, expected);
	}

	public void verifyResponseBody(int actual, String expected) {

		assertEquals(actual, expected);
	}

	public void verifyResponseCode(Response response, int expectedStatusCode) {
		assertEquals(response.getStatusCode(), expectedStatusCode);

	}
	
	public void verifyStringKey(String keyExpected ,String keyActual) 
	{
		// From AssertJ
		assertThat(keyExpected).isNotNull();
		assertThat(keyExpected).isNotBlank();
		assertThat(keyExpected).isEqualTo(keyActual);
	}
	
	public void verifyStringKeyNotNull(String keyExpected)
	{
		assertThat(keyExpected).isNotNull();
	}
	
	public void verifyIntegerKeyNotNull(String keyExpected)
	{
		assertThat(keyExpected).isNotNull();
	}

	public void verifyIntegerKey(String keyExpected ,String keyActual) 
	{
		// From AssertJ
		assertThat(keyExpected).isNotNull();
		assertThat(keyExpected).isEqualTo(keyActual);
	}
}
