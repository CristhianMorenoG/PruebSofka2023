Bienvenidos 


El proyecto fue desarrollado usando JAVA como lenguaje de programacion, se tiene como base la solicitud de agregar datos a una base de datos que permita su consulta posteriormente.
Para esto se crearon las clases requeridas para la creacion y posterior consulta de las mismas, como base de datos se utilizo Mongodb ya que esto permite que los datos queden almacenados en la nube lo que facilita su accesibilidad.


Dentro de las clases encontramos la clases y metodos necesarios para realizar la actualizacion de informacion y su consulta. Para facilitar el reemplazo de parametros estos fueron ubicados en un archivo ResourceBundle .properties en el cual fue ubicada la direccion de acceso y la configuracion de colecciones y base de datos facilitando asi su cambio de ser necesario.
Se pueden añadir 3 tipos de naves diferentes a las cuales se parametrizan sus campos con entrada desde el teclado que seran enviados a las colecciones de Mongodb lo que facilitara su posterior consulta. Las consultas se encuentran configuradas para que en caso de buscar un item que no se encuentre dentro de las colecciones de Mongodb indique que no se encuentra este item en la BD.



Al momento de ingresar informacion el sistema solicitara informacion de la nave a ingresar. Inicialmente solicitara el tipo de nave a ingresar. Una vez ingresado el tipo deseado se solicitaran datos de la anve mas especificos como su ID, la nacionalidad, el peso, el tamaño, si la nave puede ser reutilizada y en algunos casos la cantidad de pasajeros. Esta informacion es guardada en la coleccion de Mongodb y podra ser accedida utilizando la parte de validacion del sistema. 
El sistema permite validar los parametros de la base de datos ya se por alguna de sus caracteristicas como peso o tamaño y filtrarlas por un valor exacto o un valor menor/mayor al valor insertado. El programa continua en ejecucion a menos que la opcion de salida sea seleccionada.

 


COMO EJECUTAR EL ALGORITMO 

El proyecto fue completado usando Intellij y Mongodb. Su ejecucion e ingreso de data puede ser realizado desde la consola del entorno de desarrollo.