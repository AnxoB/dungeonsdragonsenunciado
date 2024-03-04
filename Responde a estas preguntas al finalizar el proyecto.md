
### Tras finalizarr el proyecto, responde de forma concisa (máximo 1 párrafo) y clara a las siguientes preguntas que te darán indicios de  tu grado de entendimiento del patrón Strategy

- ¿Cuáles son las estrategias?
- 
- ¿Está el código de las diferentes ataques mezclado?¿El código del ataque con espada es independiente del código del ataque con arco?  .Relaciona esto con algún principio SOLID.
  No, el código no está mezclado, ya que cada ataque es independiente de otro, cada uno con su clase implementando la interfaz EstrategiaAtaque.
  Se relaciona con el principio SOLID ya que cada tipo de ataque en su clase tiene solo una responsabilidad, y solo necesita cambiar si ese ataque
  tiene que cambiar.

- ¿Para que vale la interface Ataque?
  Para definir un método que todas las clases de ataque tienen que implementar. Así podemos cambiar el comportamiento de ataque de un personaje simplemente cambiando la implementación de Ataque que está usando.

- ¿Qué clase o clase se encarga del papel de contexto?
  La clase Personaje o sus subclases como Rey, Caballero y Troll.

- ¿En que se parece y  en que se diferencia el  contexto de tu proyecto al contexto del Patrón teórico del boletín?


- ¿Quién es el Cliente?
  La clase Personaje.

- ¿Como cambia el cliente de estrategia?
- 
- ¿Para cambiar de estrategia, tiene que conocer el cliente detalles de implementación de la estrategia?
No, el cliente solo necesita saber que las estrategias implementan una interfaz común. 

- ¿Si creamos un nuevo tipo de ataque para un nuevo cliente, por ejemplo App2,  es
necesario modificar el cliente antiguo? Relaciona esto con algún principio SOLID.
No, ya que cada uno implementa independientemente la estrategia. Se relaciona con el principio Abierto/Cerrado, que establece que las entidades de software deben estar abiertas para la extensión pero cerradas para la modificación. Con la estrategia podemos agregar nuevos ataques creando nuevas clases que implementen la interfaz, sin necesidad de modificar clases existentes.
