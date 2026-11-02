# language: es
Característica: Product - Store


  @test
  Esquema del escenario:Product Store
    Dado que estoy en la página de la tienda
    Y me logueo con mi usuario "<usuario>" y clave "<clave>"
   Cuando navego a la categoria "<categoria>" y subcategoria "<subcategoria>"
    Y agrego 2 unidades del primer producto al carrito
    Entonces valido en el popup la confirmación del producto agregado
   Y valido en el popup que el monto total sea calculado correctamente
    Cuando finalizo la compra
    Entonces valido el titulo de la pagina del carrito
    Y vuelvo a validar el calculo de precios en el carrito

    Ejemplos: Usuario y clave válidos
      | usuario                    | clave     | categoria | subcategoria |
     | mariapruebas12@yopmail.com | Hola2026* | Clothes   | Men          |

   Ejemplos: Usuario y clave inválidos
     | usuario           | clave      | categoria | subcategoria |
    | usuario123@mail.com | clave01 | Clothes   | Men          |
#
#    Ejemplos: Categoría inexistente
#      | usuario            | clave    | categoria | subcategoria |
#      | mariapruebas12@yopmail.com | Hola2026* | Autos     | Men |
