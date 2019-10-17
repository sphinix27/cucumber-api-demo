Feature: Test Get Users endpoint

   Just review the Users endpoint

  # Scenario: Get simple assertion
  #   Given enpoint "public-api/users"
  #   When request GET
  #   Then response status code is 200

  # Scenario: Get simple assertion 2
  #   Given enpoint "public-api/posts"
  #   When request GET
  #   Then response status code is 200

  @common
  Scenario: Get simple assertion common steps
    Given uri enpoint "public-api/posts"
    When a GET request
    Then status code is 200
