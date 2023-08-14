Feature: Login Functionality



Background: 
And user launch site URl
And select allow all from cookie pop up and select over 18 age confirmation option



@test(priority=0)
Scenario: verify the login functionality 
And user login into application with valid username and password
And user navigates to Cart page and empty basket


@test(priority=1)
Scenario: verify the login functionality 
And user login into application with invaildusername and password
And user navigates to Cart page and empty basket


@test(priority=2)
Scenario: verify the login functionality 
And user login into application with valid username and invaildpassword
And user navigates to Cart page and empty basket

@test(priority=3)
Scenario: verify the login functionality 
And user login into application with valid username and blankpassword
And user navigates to Cart page and empty basket

@test(priority=4)
Scenario: verify the login functionality 
And user login into application with valid blankusername and password
And user navigates to Cart page and empty basket











