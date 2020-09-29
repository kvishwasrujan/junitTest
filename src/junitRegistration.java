
import org.junit.jupiter.api.Test;
import org.junit.Assert;
class junitRegistration {

	@Test
	public void test() {
		String firstname1="Abc";
		String firstname2="Abc";
		String firstname3="Rjd";
		String firstname4="Rjd";
		Assert.assertEquals(firstname1,firstname2);
		Assert.assertEquals(firstname3,firstname4);
	}

}
