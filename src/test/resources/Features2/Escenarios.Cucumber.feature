@tag
Feature: Clase 8 
  esta es la prueba realizada con gherkin cucumber y javva 

  @Fabrica3
  Scenario Outline: primera prueba con cucumber
  Given ingresar primer numero <NumerooA>
  Given ingresar segundo numero <nuemeroB>
  Given instanciar la  calculadora
  When  sume los valores 
  Then  La suma debe ser igual a <ResultadoSuma>
  When  reste los valores 
  Then  La resta debe ser igual a <ResultadoResta>
  When  multiplique los valores 
  Then la multiplicacion debe ser igual a <ResultadoMultiplicacion>
  When divida los valores
  Then la divisio es igual a  <Resultadodivision>

  
    Examples: 
      | NumerooA | nuemeroB | ResultadoSuma |ResultadoResta|ResultadoMultiplicacion|Resultadodivision|
      |    5     |     1    |      6        |     4        |      5                |        5        |
      |    7     |     1    |      8        |     6        |      7                |        7        |