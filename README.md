# READ ME

![LogoWhite](https://github.com/01010011011001010110010001110100/Final-Proyect/assets/89937780/d61fad7f-b851-4b79-9cea-94204ca2cee1)

# Información general

Sistema en la version 1.0.0

# Importacion de paquetes y recursos:


*Paquetes:*
---
Los `paquenes necesarios` para que el programa funcione son los siguientes:

- JCalendar 1.5 jar
- mysql-connector-java-8.0.30.jar
- TimingFramework-0.55.jar
- flatlaf-3.2.5.jar
- itextpdf-5.5.9.jar
- flatlaf-extras-2.4.jar
- miglayout-4.0.jar

Todos estos paquetes se encuentran en la `carpeta raiz del proyecto`, por si falla alguna importacion, se pueda
buscar de manera manual en el directorio: [ `Lib\lib` ]

*Fuentes:*
--

Por temas de que se utilizan `fuente tipograficas externas`, las cuales no suelen tener todos los sistemas, recomendamos importar las siguientes fuentes en su sistema
para que el programa funcione de la forma correcta, las fuentes utilizadas son las siguientes:

- Paquete de la familia [ `poppins` ]
  - Light
  - Thin
  - Bold
  - Black

- Fuente [ `Gorgonzolla` ]
  - Normal


Estas familias de fuentes estaran en una carpeta del proyecto llamada `fonts`, ubicada en la carpeta raiz del proyecto

*Guia de como agregar fuentes a su computador:*
-----
Si no sabe agregar nuevas fuentes al computador puede seguir esta guia, de lo contrario, puede pasar al siguiente punto:

*Windows:*

1 - En la barra de busqueda de su sistema operativo, escriba `Panel de control`  
2 - ingrese en la seccion `Apariencias y personalizacion`   
3 - Luego ingrese en la carpeta `Fuentes`  
4 - Arrastre todas las fuentes que estan la carpeta `Fonts` del proyecto  
5 - Listo  

*Base de datos:*
-----

Para que el proyecto corra de forma correcta debemos de estar `conectados a una base de datos`, en este caso estaremos utilizando `MySQL 8.30`, entonces
, debemos utilizar alguna herramienta que nos permita utilizar `MySQL`, una vez hecho esto, hay que ejecutar un `Archivo.sql` ubicado
en en el siguiente directorio: `[ Lib\src\Backup\LibQuery - Lite.sql ]`, para que se cree la base de datos y sus regitros estaticos.

En este punto se podra utilizar la aplicacion, pero si hay algun problema con la base de datos, se puede deber a los siguientes puntos:

1 - La version del MySQL es muy antigua y no es compatible con el `JDBC 8.0.30` del proyecto  
2 - La `IP` iniciado en el MySQL es diferente de la `IP` en el archivo `[ ConnectionMYSQL.java ]` del proyecto ya que el proyecto esta conectado al `localhost`   
3 - Versiones diferentes de JDK  

*****

#

# Como utilizar la aplicacion [Manual usuario]

**Log in**

Cuando la aplicacion inicia, lo primero que vera es una pantalla de `Log in`:

![Screenshot_1](https://github.com/01010011011001010110010001110100/Final-Proyect/assets/89937780/5a29f743-e21a-485d-8359-d6eb6eefee43)

Esta ventana le dara la opcion de iniciar sesion para poder acceder a las herramientas que ofrece el software.

> **Nota:** Dependiendo de que tipo de cuenta se inicie, las opciones que apareceran van a variar, Si se inicia con una cuenta de `ADMIN`,
> esta mostrara todas las ventanas que estan mas abajo, pero, si se inicia con una cuenta de `USER`,
> esta se vera limitada en ciertos aspectos.

**Panel de administración:**

![Screenshot_2](https://github.com/01010011011001010110010001110100/Final-Proyect/assets/89937780/3838495b-1426-422f-ad94-a649aa6d0d58)

Este panel nos permitira realizar las varias acciones segun el menu y submenu que seleccionemos:

*En el menu #1 esta:*
----

- Saber mas del software

![Screenshot_4](https://github.com/01010011011001010110010001110100/Final-Proyect/assets/89937780/afc69e2b-70ed-437a-8b3a-1ef588bd449f)

Mediante esta ventana podremos informarnos de las nociones basicas del software, como, de que va, que version es y contactos
de los desarrolladores

*En el menu #2 esta:*
----

- Registrar usuarios:

![Screenshot_3](https://github.com/01010011011001010110010001110100/Final-Proyect/assets/89937780/121a302f-8d1a-41e1-822c-cff5d3615fa1)

Aqui introduciremos una serie de datos necesarios para poder agregar nuevos usuarios `(PARA INICIAR SESION CON EL LOGIN)`,
donde incluye el nombre del usuario, correo, password y acceso que tendra el usuario.

> **Nota:** Access, es el nivel de acceso que tendra el usuario, depende el accesso este podra utilizar ciertos botones
> y acciones

- Registrar clientes *(aun por realizar)*
- Registrar empleados:

![Screenshot_6](https://github.com/01010011011001010110010001110100/Final-Proyect/assets/89937780/9902cf25-9baf-448d-97de-1eee3cbcd41c)

Aqui podremos registrar nuevos empleados e incluirlos en el sistema para poder gestionarlos.

- Manejar usuarios:

![Screenshot_7](https://github.com/01010011011001010110010001110100/Final-Proyect/assets/89937780/bf17d27e-5a9d-4e81-9184-03a00e77c066)

En el siguiente manejador podremos realizar lo siguiente (Actualizar informacion del usuario, eliminar usuario y buscar usuario)

- Manejar clientes *(aun por realizar)*
- Manejar empleados:

![Screenshot_8](https://github.com/01010011011001010110010001110100/Final-Proyect/assets/89937780/e542b903-b5fb-4938-90bd-4bfc4d2aa850)

Aqui podremos manejar todas las informaciones relacionadas a los empleados, NDI, nombre, etc.
ya sea actualizar, borrar o buscar.

- visualizar el historial de acciones filtrando solo los usuarios *(aun por realizar)*

*En el menu #3 esta:*
----

- Agregar libros *(aun por realizar)*
- Agregar categorias *(aun por realizar)*
- Manejar libros *(aun por realizar)*
- Manejar categorias *(aun por realizar)*
- visualizar el historial de acciones filtrando solo el inventario *(aun por realizar)*

*En el menu #4 esta:*
----

- Aplicar a un prestamo de libro *(aun por realizar)*
- Manjear las devoluciones *(aun por realizar)*
- visualizar el historial de acciones filtrando la circulacion *(aun por realizar)*

*En el menu #5 esta:*
----

- Descargar todo las tablas de todos los manejadores de cada menu *(aun por realizar)*

*En el menu #6 esta:*
----

- Cambiar de cuenta
- Cerrar el programa

![Screenshot_9](https://github.com/01010011011001010110010001110100/Final-Proyect/assets/89937780/78df729a-feb3-42ef-87ed-2b4b7c91b656)

Aqui por ultimo, podremos cambiar de usuario dandole al boton `Cambiar de cuenta` para no tener que cerrar y abrir el programa de nuevo
y tambien podremos salir del porgrama dandole al `boton exit program`

#

Bueno de momento esta fue la guia de usuario para poder utilizar el porgrama de forma correcta, espero que halla sido de ayuda ***:)***

