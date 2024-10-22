# Data Structure
## Taller: Pilas y Colas
### Descripción del Problema
En la actualidad, la música digital se ha convertido en un elemento esencial de entretenimiento y expresión personal. Con una gran cantidad de canciones disponibles en plataformas de streaming, los usuarios necesitan herramientas efectivas para gestionar sus listas de reproducción de forma ágil y organizada.

### Definición del Problema
El objetivo es desarrollar un gestor de reproducción musical que facilite la organización y reproducción de canciones de manera eficiente. Para lograr esto, se abordarán los siguientes aspectos:

#### Tipo de Datos a Gestionar:

- Canciones: Cada canción será representada por un objeto que contenga información relevante, como el nombre del artista, el título de la canción y otros metadatos que puedan ser útiles para el usuario.
Organización de los Datos:

#### Se gestionarán dos tipos de listas:

##### Lista de Reproducción:
- Utilizando una pila, donde las canciones se agregarán y reproducirán en orden inverso al que fueron añadidas. Esto significa que la última canción agregada será la primera en reproducirse.

##### Lista de Canciones Repetidas: 
- Utilizando una cola, donde las canciones se agregarán en el orden en que se soliciten para su repetición. Esto significa que la primera canción solicitada para repetir será la primera en reproducirse.

#### Orden de Procesamiento de los Datos:

- En la pila (lista de reproducción), se implementará el principio de "último en entrar, primero en salir"(LIFO), permitiendo que las canciones más recientes sean las primeras en ser reproducidas.
- En la cola (canciones repetidas), se utilizará el principio de "primero en entrar, primero en salir" (FIFO), asegurando que las canciones se reproduzcan en el orden en que se solicitaron para ser repetidas.
---
### Uso de pila (Stack) 
Se utiliza una pila para gestionar la lista de reproducción de canciones porque permite un acceso rápido a la última canción añadida. Por lo tanto, la lógica de LIFO implica que el último elemento agregado es el primero en ser eliminado. En el contexto de la reproducción musical, esto significa que la última canción que el usuario agregó a la lista de reproducción es la primera que se reproducirá. asimismo. Se utilizara diferentes tipos de operaciones tal como: 
       
- Inserción: agregar canciones a la pila mediante el método push()
- Eliminación: reproducir la siguiente canción eliminándola de la pila con el método 	pop().
- Consulta: revisar cuál es la canción en la cima de la pila usando peek(), sin eliminarla.

### Ventajas y desventajas (Stack)
#### Ventajas 
- Acceso rápido a la última canción añadida.
- Simplicidad en la gestión de la lista de reproducción.
#### Desventajas
- Las canciones no pueden ser reproducidas en el orden en que fueron añadidas, lo que puede ser inconveniente si el usuario desea escuchar canciones en secuencia.

---
### Uso de cola (Queue)
Se utiliza una cola para gestionar las canciones que se desean repetir porque permite acceder a las canciones en el orden en que fueron solicitadas. Esto es ideal para la funcionalidad de repetición, donde la primera canción en ser repetida debe ser la primera en reproducirse. Por lo tanto, la lógica de FIFO implica que el primer elemento añadido es el primero en ser eliminado. En el contexto de la repetición de canciones, esto significa que si un usuario solicita repetir una canción, se reproducirá en el mismo orden en que fue solicitada. Por ende, se usaran diferentes tipos de operaciones con Colas. tales como:
- Inserción: Agregar canciones a la cola mediante el método add().
- Eliminación: Reproducir la siguiente canción eliminándola de la cola con el método poll().
- Consulta: Revisar la próxima canción en la cola utilizando peek().

### Ventajas y desventajas (Queue)
#### Ventajas
- Las canciones se reproducen en el orden en que fueron solicitadas, lo que es intuitivo para el usuario.
- Permite manejar las repeticiones de manera efectiva sin interferir con la lista de reproducción principal.
#### Desventajas
- La cola no permite acceder a la última canción añadida de manera rápida, lo que puede ser un inconveniente si el usuario desea cambiar rápidamente su selección.
---
### Comparacion entre pila (Stack) y cola (Queue)
La elección entre pila y cola depende de la funcionalidad deseada. Para la lista de reproducción, la pila es más adecuada porque se alinea con el comportamiento esperado de "último en entrar, primero en salir". Para la repetición de canciones, la cola es más apropiada, ya que asegura que se reproduzcan en el orden en que fueron solicitadas. No obstante, existen limitaciones y problemas especificos en cada enfoque. Por ejemplo, la pila no permite reproducir canciones en el orden original de adición y por otro lado las colas no proporcionan acceso rápido a la última canción añadida.

Aunque, recomendaría usar ambas estructuras de datos en conjunto, ya que, cada una cumple un propósito específico y complementa la otra. La pila es ideal para gestionar la lista de reproducción, permitiendo acceso rápido a las canciones más recientes, mientras que la cola es perfecta para manejar las repeticiones, asegurando que las canciones se reproduzcan en el orden adecuado.

---
### Conclusion
En conclusión, el desarrollo de un gestor de reproducción musical con pilas y colas ha resaltado la importancia de elegir la estructura de datos adecuada para resolver problemas específicos en programación. Este proyecto no solo ha permitido mejorar la experiencia del usuario al gestionar listas de reproducción de manera efectiva, sino que también ha brindado una oportunidad práctica para aplicar conceptos teóricos en un contexto real.
