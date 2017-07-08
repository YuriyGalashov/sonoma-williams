/**
 * File Name: AbstractLoginTest.java<br>
 * Nepton, Jean-francois<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jul 1, 2017
 */
package com.sqa.yg.helpers;

import org.testng.annotations.*;

/**
 * AbstractLoginTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 */
public abstract class AbstractLoginTest extends BasicTest {

	public AbstractLoginTest(String baseUrl) {
		super(baseUrl);
	}

	@BeforeClass
	public void setupLogin() {
		login(getProp("userName"), getProp("password"));
	}

	private void login(String prop, String prop2) {
		// TODO Auto-generated method stub

	}

	@AfterClass
	public void setups() {
		logout();
	}

	private void logout() {
		// TODO Auto-generated method stub

	}

}
