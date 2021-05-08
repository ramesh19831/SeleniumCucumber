Feature: Verify the login page scenarios end to end

  @Regression
  Scenario: Verify the Login with invalid Data
    Given User should be able to navigate to site url
    Then I Verify the title of the home page "Demo Web Shop"
    When I Click on Login link
    Then I Verify the login page Title
    When I click login button
    Then I verify the login error messages "Login was unsuccessful. Please correct the errors and try again."
    Then I Verify the error message  "No customer account found"

@Smoke
  Scenario: Verify the Login with Valid Data
    Given User should be able to navigate to site url
    Then I Verify the title of the home page "Demo Web Shop"
    When I Click on Login link
    Then I Verify the login page Title
    When I Enter email address in Email "rameshk@gmail.com"
    When I Enter the password in pwd "Test@112"
    When I click login button
    Then I verify User is successfully loggedin
