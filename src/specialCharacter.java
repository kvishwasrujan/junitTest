import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class specialCharacter {

	@Test
	void test() {
		String password1="Hell3ha%";
		String password2="Hell3ha%";
		String password3="Whoe$se8";
		String password4="Whoe$se8";
		Assert.assertEquals(password1,password2);
		Assert.assertEquals(password3,password4);
	}

}
