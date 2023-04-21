# language: es
Característica: checkout

  @positivo
  Esquema del escenario: Realizar compra con credenciales válidas
    Dado que el usuario ya ha iniciado sesión con usuario "<username>" y password "<password>"
    Cuando el usuario elige el producto "<product>"
    Y debe aparecer el mensaje emergente "Product added"
    Y el usuario crea una orden con Nombre "<Name>", País "<Country>", Ciudad "<City>", Tarjeta de crédito <card>, Mes <Month>, Año <Year>
    Entonces se muestra el mensaje emergente "Thank you for your purchase!"
    Ejemplos:
      | username | password | product           | Name   | Country | City   | card | Month | Year |
      | dimaxqp  | dimaxqp  | Samsung galaxy s6 | Nombre | Pais    | Ciudad | 213  | 12    | 234  |

  @negativo
  Esquema del escenario: Realizar compra sin Nombre
    Dado que el usuario ya ha iniciado sesión con usuario "<username>" y password "<password>"
    Cuando el usuario elige el producto "<product>"
    Y debe aparecer el mensaje emergente "Product added"
    Y el usuario crea una orden con Nombre "<Name>", País "<Country>", Ciudad "<City>", Tarjeta de crédito <card>, Mes <Month>, Año <Year>
    Entonces se debe mostrar el mensaje emergente "Please fill out Name and Creditcard"
    Ejemplos:
      | username | password | product           | Name | Country | City   | card | Month | Year |
      | dimaxqp  | dimaxqp  | Samsung galaxy s6 |      | País    | Ciudad | 213  | 12    | 234  |

  @negativo
  Esquema del escenario: Realizar compra sin País
    Dado que el usuario ya ha iniciado sesión con usuario "<username>" y password "<password>"
    Cuando el usuario elige el producto "<product>"
    Y debe aparecer el mensaje emergente "Product added"
    Y el usuario crea una orden con Nombre "<Name>", País "<Country>", Ciudad "<City>", Tarjeta de crédito <card>, Mes <Month>, Año <Year>
    Entonces se muestra el mensaje emergente "Please fill out name, country, city, Credit card, month, and year"
    Ejemplos:
      | username | password | product           | Name   | Country | City   | card | Month | Year |
      | dimaxqp  | dimaxqp  | Samsung galaxy s6 | Nombre |         | Ciudad | 213  | 12    | 234  |

  @negativo
  Esquema del escenario: Realizar compra sin Ciudad
    Dado que el usuario ya ha iniciado sesión con usuario "<username>" y password "<password>"
    Cuando el usuario elige el producto "<product>"
    Y debe aparecer el mensaje emergente "Product added"
    Y el usuario crea una orden con Nombre "<Name>", País "<Country>", Ciudad "<City>", Tarjeta de crédito <card>, Mes <Month>, Año <Year>
    Entonces se muestra el mensaje emergente "Por favor complete el nombre, el país, la ciudad, la tarjeta de crédito, el mes y el año."
    Ejemplos:
      | username | password | product           | Name   | Country | City | card | Month | Year |
      | dimaxqp  | dimaxqp  | Samsung galaxy s6 | Nombre | País    |      | 213  | 12    | 234  |

  @negativo
  Esquema del escenario: Realizar compra sin tarjeta de crédito
    Dado que el usuario ya ha iniciado sesión con usuario "<username>" y password "<password>"
    #Cuando el usuario agrega el producto "<product>" al carrito
    Cuando el usuario elige el producto "<product>"
    Y debe aparecer el mensaje emergente "Product added"
    Y el usuario crea una orden con Nombre "<Name>", País "<Country>", Ciudad "<City>", Mes <Month>, Año <Year>
    Entonces se debe mostrar el mensaje emergente "Por favor complete el nombre y la tarjeta de crédito"
    Ejemplos:
      | username | password | product           | Name | Country | City | Month | Year |
      | dimaxqp  | dimaxqp  | Samsung galaxy s6 | Name | Country | City | 12    | 234  |