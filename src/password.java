import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.Assert;
class password {

	@Test
	void test() {
		String password1="hellohai";
		String password2="hellohai";
		String password3="whoelsee";
		String password4="whoelsee";
		Assert.assertEquals(password1,password2);
		Assert.assertEquals(password3,password4);;
	}

}
