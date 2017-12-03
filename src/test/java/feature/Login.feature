Feature: LoginFeature
  This is responsible for logging in and out

  Scenario: Login with correct credentials
    Given User goes to the login page
    When User attempts to login with the following credentials
      | username | password      |
      | Tamas    | TamasPassword |
    Then User is logged in

  Scenario Outline: Login as multiple users
    Given User goes to the login page
    When User attempts to login with credentials "<username>" and "<password>"
    Then User is logged in

    Examples:
      | username | password  |
      | Tamas    | tamasPass |
      | Liz      | lizzard   |
      | Feri     | feriPass  |
