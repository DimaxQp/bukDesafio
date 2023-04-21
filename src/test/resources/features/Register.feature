# language: es
Característica: Registrar nuevo usuario

  @positivo @TC-01
  Esquema del escenario: Registrar usuario con todos los datos válidos
    Dado que el usuario ya está en la página de inicio
    Cuando el usuario se registre con el nombre de usuario "<username>" y la contraseña "<password>"
    Entonces debe aparecer el mensaje "Sign up successful.".
    Ejemplos:
      | username   | password   |
      | dimaxqp312636363 | dimaxqp312636363 |

  @negativo @TC-02
  Esquema del escenario: Registrar usuario con datos ya registrados
    Dado que el usuario ya está en la página de inicio
    Cuando el usuario se registre con el nombre de usuario "<username>" y la contraseña "<password>"
    Entonces debe aparecer el mensaje "This user already exist.".
    Ejemplos:
      | username   | password   |
      | dimaxqp312 | dimaxqp312 |

  @negativo @TC-03
  Esquema del escenario: Registrar usuario con todos los datos vacíos
    Dado que el usuario ya está en la página de inicio
    Cuando el usuario se registre con el nombre de usuario "<username>" y la contraseña "<password>"
    Entonces debe aparecer el mensaje "Please fill out Username and Password.".
    Ejemplos:
      | username | password |
      |          |          |

  @positivo @TC-04
  Esquema del escenario: Registrar usuario con nombre de usuario completamente numérico
    Dado que el usuario ya está en la página de inicio
    Cuando el usuario se registre con el nombre de usuario "<username>" y la contraseña "<password>"
    Entonces debe aparecer el mensaje "Sign up successful.".
    Ejemplos:
      | username | password |
      | 09090978678    | 09090978678    |

  @positivo @TC-05
  Esquema del escenario: Registrar usuario con nombre de usuario completamente de caracteres especiales
    Dado que el usuario ya está en la página de inicio
    Cuando el usuario se registre con el nombre de usuario "<username>" y la contraseña "<password>"
    Entonces debe aparecer el mensaje "Sign up successful.".
    Ejemplos:
      | username | password |
      | !@!#@$'¿+{{{¿¡¡¡   | dimaxqp312    |

  @positivo @TC-06
  Esquema del escenario: Registrar usuario con nombre de usuario largo
    Dado que el usuario ya está en la página de inicio
    Cuando el usuario se registre con el nombre de usuario "<username>" y la contraseña "<password>"
    Entonces debe aparecer el mensaje "Sign up successful.".
    Ejemplos:
      | password | username                                           |
      | havid    | qwertyuiop09w46+.,kasjJASOQJDQWD1344{{{{{-.ASIQ0FI |