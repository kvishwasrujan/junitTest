import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
class lastName {

	@Test
	void test() {
		String lastname1="Raj";
		String lastname2="Raj";
		String lastname3="Who";
		String lastname4="Who";
		Assert.assertEquals(lastname1,lastname2);
		Assert.assertEquals(lastname3,lastname4);
	}

}
