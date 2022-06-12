Feature: Home Page Feature


 Background:
  Given user is on login page
  Given user in on login page by login method
  When  user clicks on invoice tab
  And  user clicks on makePayment button

 Scenario:Verification of Make payment page
  Then select Payment Method
  Then Pays with card
  Then verify the Payment Successful message
  Then select Paymnet Method

  Scenario:Verification of ADD Card Make payment page

   Then I click on addCart button
#  Then user scroll down till add payment detail page displayed
    Then user add card details
    Then select Paymnet Method
    Then Pays with card
    Then verify the Payment Successful message


 Scenario:Delete payment Method
  When user clicks on delete









