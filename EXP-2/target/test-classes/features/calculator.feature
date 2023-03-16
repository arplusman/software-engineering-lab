@tag
Feature: Calculator

  Scenario: add two numbers
    Given Two input values, 1 and 2
    When I add the two values
    Then I expect the result 3


  Scenario Outline: add two numbers
    Given Two input values, <first> and <second>
    When I add the two values
    Then I expect the result <result>
    Examples:
      | first | second | result |
      | 1     | 12     | 13     |
      | -1    | 6      | 5      |
      | 2     | 2      | 4      |

  Scenario: compute useless calculation
    Given Two input values, 100 and sqr
    When I calculate the result of this number using the operator
    Then I expect the result to be 10


  Scenario Outline: compute useless calculation
    Given Two input values, <input> and <opt>
    When I calculate the result of this number using the operator
    Then I expect the result to be <result>

    Examples:
      | input | opt | result |
      | 4     | rvs | 0.25   |
      | 4     | sqr | 2      |
      | 25.0  | sqr | 5.0    |