import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class passwordNumeric {

	@Test
	void test() {
		String password1="Hell3hai";
		String password2="Hell3hai";
		String password3="Whoelse8";
		String password4="Whoelse8";
		Assert.assertEquals(password1,password2);
		Assert.assertEquals(password3,password4);

	}

}
