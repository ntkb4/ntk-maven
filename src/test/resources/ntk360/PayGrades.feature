Feature: Login functionality

  @scrumu
  Scenario: Verify Pay Grades header title 1
    Given User is logged into NTK application "scrum"
    When User navigates to Pay Grades Page | click "menu.payGrades"
    Then System displays page header | verify "payGrades.header"

 
 
  @scrumu
  Scenario: Verify Pay Grades header title 2
    Given User is logged into NTK application "scrum"
    When User navigates to Pay Grades Page | click "menu.payGrades"
    Then System displays page header | verify "payGrades.header"
