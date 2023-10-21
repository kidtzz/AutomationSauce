Scenario: login with valid credentials
Given I am on the login page
When I fill in "Email" with "standard_user"
And I fill in "Password" with "secret_sauce"
And I press "Login"
Then I should be on the users home page
And I should see "Login successful"