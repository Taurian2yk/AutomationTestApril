Feature: Header links test
  As a user
  I should be able to click all the links and should be directed appropriately

  @MyAccount @regression
  Scenario: validate the My Account Link

    Given I'm on Home page "https://www.next.co.uk"
    When I click on My Account link
    Then I should be on sign in page

    @Help @regression
    Scenario: validate the Help Link

      Given  I'm on home page "https://www.next.co.uk"
      When I click on Help link
      Then I should be on Help page

      @StoreLocator @regression
      Scenario: validate Store Locator Link

        Given  I'm on home page "https://www.next.co.uk"
        When I click on Store Locator link
        Then I should be on Find A Store page