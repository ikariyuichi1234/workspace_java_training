package test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exam.Exam1;


class Exam1Test {
	
	//最初の一発だけ
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	
	//テストが呼ばれるたびに
	@BeforeEach
	void setUp() throws Exception {
	}

	
	//テストが呼ばれるたびの事後処理
	@AfterEach
	void tearDown() throws Exception {
	}
	
	//最後の事後処理
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}


	@Test
	public void 値を２乗する() {

		assertEquals(Exam1.exp(5), 5 * 5);

		int testnum = 10;
		assertEquals(Exam1.exp(testnum), testnum * testnum);

		}

	}
	


