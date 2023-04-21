# language: es
Característica: Inicio de sesión

  @positive @TC-07
  Esquema del escenario: Usuario inicia sesión con todos los datos válidos
    Dado que el usuario ya está en la página de inicio
    Cuando realiza click en el menu login
    Y el usuario inicia sesión con el nombre de usuario "<username>" y la contraseña "<password>"
    Entonces el usuario es redirigido a la página de inicio con la cuenta "<username>"
    Ejemplos:
      | username | password |
      | dimaxqp312636363  | dimaxqp312636363  |


  @negative @TC-08
  Esquema del escenario: Usuario inicia sesión con datos no registrados
    Dado que el usuario ya está en la página de inicio
    Cuando realiza click en el menu login
    Y el usuario inicia sesión con el nombre de usuario "<username>" y la contraseña "<password>"
    Entonces debe aparecer el mensaje "User does not exist.".
    Ejemplos:
      | username | password |
      | dimaxqp123  | dimaxqp    |

  @negative @TC-09
  Esquema del escenario: Usuario inicia sesión con todos los datos vacíos
    Dado que el usuario ya está en la página de inicio
    Cuando realiza click en el menu login
    Y el usuario inicia sesión con el nombre de usuario "<username>" y la contraseña "<password>"
    Entonces debe aparecer el mensaje "Please fill out Username and Password.".
    Ejemplos:
      | username | password |
      |          |          |

  @positive @TC-10
  Esquema del escenario: Usuario inicia sesión con nombre de usuario completamente numérico
    Dado que el usuario ya está en la página de inicio
    Cuando realiza click en el menu login
    Y el usuario inicia sesión con el nombre de usuario "<username>" y la contraseña "<password>"
    Entonces el usuario es redirigido a la página de inicio con la cuenta "<username>"
    Ejemplos:
      | username | password |
      | 123459876    | dimaxqp    |

  @positive @TC-11
  Esquema del escenario: Usuario inicia sesión con nombre de usuario completamente de caracteres especiales
    Dado que el usuario ya está en la página de inicio
    Cuando realiza click en el menu login
    Y el usuario inicia sesión con el nombre de usuario "<username>" y la contraseña "<password>"
    Entonces el usuario es redirigido a la página de inicio con la cuenta "<username>"
    Ejemplos:
      | username | password |
      | !@!#{-   | dimaxqp    |

  @positive @TC-12
  Esquema del escenario: Usuario inicia sesión con nombre de usuario de caracteres largos
    Dado que el usuario ya está en la página de inicio
    Cuando realiza click en el menu login
    Y el usuario inicia sesión con el nombre de usuario "<username>" y la contraseña "<password>"
    Entonces el usuario es redirigido a la página de inicio con la cuenta "<username>"
    Ejemplos:
      | password | username |
      | dimaxqp123    | qwertyuio1234567890.-asd         |