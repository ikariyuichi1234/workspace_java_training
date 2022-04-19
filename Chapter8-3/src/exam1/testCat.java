package exam1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testCat {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	Cat caTest = new Cat();

	@Test	
	public void 名前を設定する () {
		caTest.Name = "にゃんじろう";
		assertEquals(caTest.Name, "にゃんじろう");
	}
	public void 年齢を設定する () {
		caTest.Age = 10;
		assertEquals(caTest.Age, 10);
	}
}
