Feature: Login page OTP feature

Background:
  Given user is on login page

  Scenario: Sign in  Functionality
#    Given user is on login page
    When user enter username "rkaur@abacusnext.com"
    And user enter password as "QAtest1@"
    And user clicks on singin Button
    Then Verify the tile of home page as "PortalWeb"

    Scenario:  Verification of forget password link
#      Given user is on login page
      Then Verify that forgotpassword link is enabled


      Scenario: Verify Invalid Credentials
#        Given user is on login page
        When user enter username "rkaur@gmail.com"
        And user enter password as "QA!"
        And user clicks on singin Button
        Then Verify error message "Your credentials are invalid"


