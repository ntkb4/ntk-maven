Feature: Login functionality

  @scrumu
  Scenario: Verify Pay Grades header title
    Given User is logged into NTK application "scrum"
    When User navigates to Pay Grades Page | click "menu.payGrades"
    Then System displays page header | verify "payGrades.header"

    Examples: 
      | region  | gradeName           |
      | "scrum" | "Senior SDET2336nn" |

  Scenario Outline: Verify User able to edit existing Pay grades
    Given User is logged into NTK application <region>
    When User navigates to Pay Grades Page | click "menu.payGrades"
    And User clicks edit icon | click "common.editIcon"
    And User enters name | enterValue "payGrades.name" <gradeName>
    And User clicks save button | click "common.saveButton"
    Then System displays message "Successfully Updated"

    Examples: 
      | region  | gradeName           |
      | "scrum" | "Junior SD333EnnT"  |
      | "scrum" | "Senior SDET2336nn" |
      | "scrum" | "Junior SD444Ennt"	|
      
        Scenario Outline: Verify User able to edit existing Pay grades
    Given User is logged into NTK application <region>
    When User navigates to Pay Grades Page | click "menu.payGrades"
    And User clicks edit icon | click "common.editIcon"
    And User enters name | enterValue "payGrades.name" <gradeName>
    And User clicks save button | click "common.saveButton"
    Then System displays message "Successfully Updated"

    Examples: 
      | region  | gradeName           |
      | "scrum" | "Junior SD333EnnT"  |
      | "scrum" | "Senior SDET2336nn" |
      | "scrum" | "Junior SD444Ennt"	|
      | "scrum" | "Junior Sd44Ennt" 	|