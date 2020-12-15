@Clase10
   Feature: Clase numero 10
      
   Background: Nombre de la precondicion
   
   Given el usuario envia oracion "buenos dias"  
   
  
  Scenario: primer escenario
  Then el usuario valida la longitud 11
  
  
  Scenario: Segundo escenario
  When El usuario concatena la  oracion "compañeros"
  When El usuario valida la oracion esperada  "buenos diascompañeros"
  