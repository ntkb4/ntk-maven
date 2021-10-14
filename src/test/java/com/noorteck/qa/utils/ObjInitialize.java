package com.noorteck.qa.utils;

import com.noorteck.qa.pages.CommonElementPage;
import com.noorteck.qa.pages.DashboardPage;
import com.noorteck.qa.pages.JobTitlesPage;
import com.noorteck.qa.pages.LoginPage;
import com.noorteck.qa.pages.MenuPage;
import com.noorteck.qa.pages.PayGradesPage;

public class ObjInitialize extends Constants {

	public static void initializeClassObj() {
		loginObj = new LoginPage();
		loginObj = new LoginPage();
		menuObj = new MenuPage();
		dashboardObj = new DashboardPage();
		jobTitlesObj = new JobTitlesPage();
		payGradesObj = new PayGradesPage();
		commonObj = new CommonElementPage();
	}

}
