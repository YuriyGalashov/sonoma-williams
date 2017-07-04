/**
 * File Name: BasicPage.java<br>
 * Nepton, Jean-francois<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jul 1, 2017
 */
package com.sqa.yg.auto;

import org.openqa.selenium.support.PageFactory;

import com.sqa.yg.helpers.BasicTest;

/**
 * BasicPage //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 */
public class BasicPage extends Core {

	public BasicPage(BasicTest test) {
		super(test);
		PageFactory.initElements(getDriver(), this);
	}
}
