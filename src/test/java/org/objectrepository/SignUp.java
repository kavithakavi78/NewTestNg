package org.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.BaseClass;

public class SignUp extends BaseClass {
	public SignUp() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="firstname")
	private WebElement firstName;
	@FindBy(name="lastname")
	private WebElement lastName;
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement email;
	@FindBy(xpath="//input[@name='reg_email_confirmation__']")
	private WebElement reEmail;
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement password;
	@FindBy(id="day")
	private WebElement day;
	@FindBy(id="month")
	private WebElement month;
	@FindBy(id="year")
	private WebElement year;
	@FindBy(xpath="(//input[@name='sex'])[1]")
	private WebElement sex;
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement submit;
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getReEmail() {
		return reEmail;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getDay() {
		return day;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getSex() {
		return sex;
	}
	public WebElement getSubmit() {
		return submit;
	}
	


}
