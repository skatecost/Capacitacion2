@tag
Feature: Case 8 
  esta es la prueba realizada con gherkin cucumber y javva 

  @Fabrica1
  Scenario: primera prueba con cucumber
    Given dada unalista de numeros
    And el usuario envia la palabra "curso automatizacione nivel 11"
    Given el numero a igual a 5
    Given el numero b igual a 6
    Given el numero a igual a 7
    When  sume los  dos valores
    Then la suma debe ser igual a 18

  @Fabrica3
  Scenario Outline: primera prueba con cucumber
  Given dada unalista de numeros
  And el usuario envia la palabra "<Oracion>"
  Given el numero a igual a <nuemeroA>
  Given el numero b igual a <numrtoB>
  Given el numero a igual a <numeroC>
  When  sume los  dos valores
  Then la suma debe ser igual a <resultado>
  
  
  Examples:
  |Oracion           |nuemeroA| numrtoB| numeroC| resultado|
  |esta es la oracion|       2|       3|       4|         9|
  |esta es la oracion|       2|       4|       4|        10|
  |esta es la oracion|       2|       5|       4|        11|
  |esta es la oracion|       2|       6|       4|        12|
  |esta es la oracion|       2|       7|       4|        13|
  |esta es la oracion|       2|       8|       4|        16|
  |esta es la oracion|       2|       3|       4|        18|
  