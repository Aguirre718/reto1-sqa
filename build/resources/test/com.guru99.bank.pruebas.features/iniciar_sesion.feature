#language:es

  Característica: Inicio de sesión en Gtpl Bank

    Escenario: Inicio de sesión exitoso en Gtpl Bank
      Dado que estoy en la página de inicio de Gtpl Bank
      Cuando ingreso mi usuario "mngr337769" y clave "UqadurY"
      Entonces valido el inicio de sesión

    Esquema del escenario: Inicio de sesión fallido en Gtpl Bank
      Dado que estoy en la página de inicio de Gtpl Bank
      Cuando ingreso mis credenciales
        | usuario | clave |
        |<usuario>|<clave>|
      Entonces valido la alerta

      Ejemplos:
        |usuario   |clave  |
        |mngr331124|UqadurA|
        |mngr331125|UqadurB|
        |mngr331126|UqadurC|
