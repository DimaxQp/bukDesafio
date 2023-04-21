# language: es
Característica: Agregar al Carrito


  @positivo @TC-13
  Esquema del escenario: Agregar producto al carrito sin elegir categorías
    Dado que el usuario ya ha iniciado sesión con usuario "<username>" y password "<password>"
    Cuando el usuario elige el producto "<product>"
    Entonces debe aparecer el mensaje emergente "Product added."
    Y el producto "<product>" se agrega a la página del carrito
    Ejemplos:
      | username | password | product           |
      | dimaxqp  | dimaxqp  | Samsung galaxy s6 |

  @negativo @TC-14
  Esquema del escenario: Agregar producto al carrito sin iniciar sesión
    Dado que el usuario ya se encuentra en la página principal
    Cuando el usuario elige el producto "<product>"
    Entonces debe aparecer el mensaje emergente "Product added"
    Y el producto "<product>" se agrega a la página del carrito
    Ejemplos:
      | product       |
      | Iphone 6 32gb |

  @positivo @TC-15
  Esquema del escenario: Agregar producto al carrito eligiendo categorías
    Dado que el usuario ya ha iniciado sesión con usuario "<username>" y password "<password>"
    Cuando el usuario elige el producto "<product>" seleccionando primero la categoría "<categories>"
    Entonces debe aparecer el mensaje emergente "Product added."
    Y el producto "<product>" se agrega a la página del carrito
    Ejemplos:
      | username | password | product       | categories |
      | dimaxqp  | dimaxqp  | Iphone 6 32gb | Phones     |

  @positivo @TC-16
  Esquema del escenario: Eliminar producto del carrito
    Dado que el usuario ya ha iniciado sesión con usuario "<username>" y password "<password>"
    Cuando el usuario agrega el producto "<product>" al carrito
    Y el usuario hace clic en el botón de eliminación
    Entonces el producto "<product>" se elimina del carrito
    Ejemplos:
      | username | password | product          |
      | dimaxqp  | dimaxqp  | Nokia lumia 1520 |