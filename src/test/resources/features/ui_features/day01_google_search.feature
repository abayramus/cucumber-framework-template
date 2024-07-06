Feature: google_search_feature

  Scenario: TC01_iphone_search

#    Step 1
  Given user navigates to google home page
  When user search for iphone
  Then verify page result contains iphone
  Then close the application

#  HW add this step Then close the application and Complete the step definition

  #All feature files begins with Feature: keyword
  #Scenario: keyword is used to create test scenario / test cases / test scripts
  #Each step must begin with a Gherken keyword : Given, When, And, Then, But, *
  #Each step must have a MATCHING STEP DEFINITION


#  Done with step -> Yes
#  Run FF or RUNNER to create step definitions

