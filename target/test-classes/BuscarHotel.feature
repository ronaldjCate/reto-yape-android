Feature: Ingresar Login
  @IngresaraBooking
  Scenario Outline: Loguearse a a aplicación de booking
    Given ingreso a la aplicacion de booking
    When doy clic a ingresar por gmail
    And ingreso destino "<destino>"
    And selecciono el hotel destino
    And selecciono la habitacion
    And selecciono la estancia
    And completo los datos de reserva
    Then se debe mostrar la pagina de reserva
    Examples:Selecciono hotel
        | destino|
        |Cusco   |


