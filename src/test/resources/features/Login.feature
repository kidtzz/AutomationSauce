Scenario: login with valid credentials
Given I am on the login page
When I fill in "Email" with "standard_user"
And I fill in "Password" with "secret_sauce"
And I press "Login"
Then I should be on the users home page
And I should see "Login successful"

Scenario:
Given Masukan username dan klik login
When masukan password tanpa username
And masuk dengan username dan password salah
And menginputkanbeberapa username dan password