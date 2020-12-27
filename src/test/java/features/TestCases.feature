Feature: Getir Test Cases

  Scenario: Case 1
    Given Open to the GetirApp
    Then Login by entering username "hello@getir.com" password "hello"
    Then Go to the basket.
    Then Checking for no items in the basket
    Then Return to the homepage
    Then Go to the "Atıştırmalık" category
    Then "1" product is added from the "1". product
    Then The status of adding "1" of the "1". product to the basket is controlled
    Then "1" product is added from the "2". product
    Then The status of adding "1" of the "2". product to the basket is controlled
    Then Return to the homepage
    Then Go to the "İçecek" category
    Then "1" product is added from the "1". product
    Then The status of adding "1" of the "1". product to the basket is controlled
    Then Go to the basket.
    Then All items in the basket are deleted.
    Then Checking for no items in the basket


  Scenario: Case 2
    Given Open to the GetirApp
    Then Login by entering username "hello@getir.com" password "hello"
    Then Go to the basket.
    Then Checking for no items in the basket
    Then Return to the homepage
    Then Write Console Category items
    Then Go to the "Atıştırmalık" category
    Then "2" product is added from the "1". product
    Then The status of adding "2" of the "1". product to the basket is controlled
    Then "2" product is added from the "2". product
    Then The status of adding "2" of the "2". product to the basket is controlled
    Then Return to the homepage
    Then Go to the "Yiyecek" category
    Then "3" product is added from the "1". product
    Then The status of adding "3" of the "1". product to the basket is controlled
    Then Go to the basket.
    Then Increasing the number of items in the basket.
    Then All items in the basket are deleted.
    Then Checking for no items in the basket



