import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class passwordCapital {

	@Test
	void test() {
		String password1="Hellohai";
		String password2="Hellohai";
		String password3="Whoelsee";
		String password4="Whoelsee";
		Assert.assertEquals(password1,password2);
		Assert.assertEquals(password3,password4);
	}

}
