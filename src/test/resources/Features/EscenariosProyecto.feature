@Proyecto
   Feature: Proyecto
      
   Background: Inicializar el driver
   
   Given El usuario  elige  el navegador "google"
   Given El usuario elige la pagina  "https://www.sophossolutions.com/"
   Then el usuario  lanza el navegador con la pagina 
 
  Scenario: Consultar los menu trabaja con nosotros 
    Given el usuario da click en trabaja con nosotros
    Then Se imprimen los datos de los perfiles
    Then el  usuario cierra el navegador
    
 
  