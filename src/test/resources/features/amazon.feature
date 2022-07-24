Feature: User can browse to Amazon page and applies the needed search filters in order to
  find the desired Samsung TV to purchase

  Scenario: User is on the Amazon homepage and clicks
  on the filters to find the second high priced Samsung TV

    Given The user is on the amazon homepage and clicks on hamburger menu
    When departments appear clicks on TV, Appliances, Electronics
    And  clicks on Televisions where he selects Samsung under brand and clicks on search
    Then the outcome result is filtered for High to Low price and About This Item section is printed