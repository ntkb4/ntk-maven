package com.noorteck.qa.utils;


import java.util.Properties;

import org.openqa.selenium.WebDriver;
//import org.testng.asserts.SoftAssert;

import com.noorteck.qa.pages.CommonElementPage;
import com.noorteck.qa.pages.DashboardPage;
import com.noorteck.qa.pages.JobTitlesPage;
import com.noorteck.qa.pages.LoginPage;
import com.noorteck.qa.pages.MenuPage;
import com.noorteck.qa.pages.PayGradesPage;

import io.restassured.path.json.JsonPath;
//import io.restassured.response.Response;

/**
 * This class will store all the OBJECTS declarations shared among all the
 * classes
 * 
 * @author noort
 *
 */
public class Constants {

	public static WebDriver driver;	
	public static JsonPath jsonPath;

	// Create object for each Webpage class
	public static LoginPage loginObj;
	public static MenuPage menuObj;
	public static DashboardPage dashboardObj;
	public static JobTitlesPage jobTitlesObj;
	public static PayGradesPage payGradesObj;
	public static CommonElementPage commonObj;
//	public static SoftAssert apiSoftAssert = new SoftAssert();


}
