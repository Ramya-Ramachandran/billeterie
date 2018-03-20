package billeterieTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exceptions.ChampVideException;
import exceptions.EmailInvalidException;
import model.BilletModel;

class BilletModelTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testBilletWithInvalidEmail() {
		
		BilletModel billet = new BilletModel("", "Pascal", "invalidEmail", "concertName", true);
		try {
			billet.isValid();
			fail("Expected an EmailInvalidException to be thrown");
		} catch (EmailInvalidException exp) {
			assert(true);
		}		
	}

	@Test
	void testBilletWithEmptyNom() {		
		BilletModel billet = new BilletModel("", "Pascal", "invalidEmail", "concertName", true);
		try {
			billet.isValid();
			fail("Expected an ChampVideException to be thrown");
		} catch (ChampVideException exp) {
			assert(true);
		} catch (EmailInvalidException exp) {
			fail("Expected an ChampVideException to be thrown. Not the EmailInvalidException");
		}		
	}

	@Test
	void testBilletWithEmptyPrenom() {		
		BilletModel billet = new BilletModel("John", null, "invalidEmail@hh.com", "concertName", true);
		try {
			billet.isValid();
			fail("Expected an ChampVideException to be thrown");
		} catch (ChampVideException exp) {
			assert(true);
		} catch (EmailInvalidException exp) {
			fail("Expected an ChampVideException to be thrown. Not the EmailInvalidException");
		}		
	}
}
