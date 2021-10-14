@NTK-1111
Feature: Filter Functionality

  Background: 
    Given User is logged into NTK application "region"
    And User navigates to Employee List Page | click "menu.empList"
    When User clicks filter icon | click "empList.filterIcon"

  Scenario: Verify the header title for filter pop up form
    Then System displays page header | verify "empList.filterHeader"

  @Regression
  Scenario: Verify  field label name for filter pop-up form
    Then User verifies label name for fields | verifyEmpLable
      | employeeName    | employmentStatus    | supervisorName    | jobTitle    | subUnit    | include   | location   | cost          |
      | "Employee Name" | "Employment Status" | "Supervisor Name" | "Job Title" | "Sub Unit" | "Include" | "Location" | "Cost Center" |

  @Regression
  Scenario Outline: Verify user able to filter using all parameters
    And User enters Employee Name | enterValue "empList.name" <name>
    And User enters Employee ID | enterValue "empList.id" <id>
    And User selects Employment Status | selectValueFromDropdown "empList.status" <status>
    And User selects Supervisor Name | selectValueFromDropdown "empList.supervisor" <supervisor>
    And User selects Job Title | selectValueFromDropdown "empList.jobTitle" <jobTitle>
    And User selects Include | selectValueFromDropdown "empList.include" <include>
    And User selects location | selectValueFromDropdown "empList.location" <location>
    And User clicks Search button | click "empList.search"
    Then User verifies search result values | verifyEmpFilterResult
      | name   | id   | status   | supervisor   | jobTitle   | subUnit   | location   |
      | <name> | <id> | <status> | <supervisor> | <jobTitle> | <subUnit> | <location> |

    Examples: 
      | name          | id     | status                | supervisor     | jobTitle      | subUnit   | include                  | location                      |
      | "Gavin Louis" | "0087" | "Full-Time Permanent" | "Khloe Jayden" | "QA Engineer" | "QA Team" | "Current Employees Only" | "Canadian Development Center" |

  @Smoke
  Scenario Outline: Verify user able to filter using employee name field
    And User enters Employee Name | enterValue "empList.name" <name>
    And User clicks Search button | click "empList.search"
    Then System displays search result | verifyResult  <name>

    Examples: 
      | name          |
      | "Gavin Louis" |

  Scenario: Verify message for no record
    And User enters wrong Employee Name | enterValue "empList.name" <name>
    And User clicks Search button | click "empList.search"
    Then System displays message "No Record Fund"
