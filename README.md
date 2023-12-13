# READ ME

![LogoWhite](https://github.com/01010011011001010110010001110100/Final-Proyect/assets/89937780/d61fad7f-b851-4b79-9cea-94204ca2cee1)

# Información general

Sistema en la versión 1.0.0

# Importación de paquetes y recursos:


*Paquetes:*
---
Los `paquetes necesarios` para que el programa funcione son los siguientes:

- JCalendar 1.5 jar
- mysql-connector-java-8.0.30.jar
- TimingFramework-0.55.jar
- flatlaf-3.2.5.jar
- itextpdf-5.5.9.jar
- flatlaf-extras-2.4.jar
- miglayout-4.0.jar

Todos estos paquetes se encuentran en la `carpeta raíz del proyecto` ya cargados en el programa, pero, si surge algún fallo en cuanto a paquetes, 
se pueden encontrar en el directorio: [ `Lib\lib` ] para cargarlos de manera manual.

*Fuentes:*
--

Por temas de que se utilizan `fuentes tipográficas externas`, las cuales no suelen tener todos los sistemas, recomendamos importar las siguientes fuentes en su sistema
para que el programa funcione de la forma correcta, las fuentes utilizadas son las siguientes:

- Paquete de la familia [ `poppins` ]
  - Light
  - Thin
  - Bold
  - Black

- Fuente [ `Gorgonzolla` ]
  - Normal


Estas familias de fuentes estarán en una carpeta del proyecto llamada `fonts`, ubicada en la carpeta raíz del proyecto

*Guía de como agregar fuentes a su computador:*
-----
Si no sabe agregar nuevas fuentes al computador, puede seguir esta guía o puede pasar al siguiente punto:

*Windows:*

1 - En la barra de búsqueda de su sistema operativo, escriba `Panel de control`  
2 - ingresé en la sección `Apariencias y personalización`   
3 - Luego ingrese en la carpeta `Fuentes`  
4 - Arrastre todas las fuentes que están la carpeta `Fonts` del proyecto  
5 - Listo  

*Base de datos:*
-----

Para que el proyecto corra de forma correcta debemos de estar `conectados a una base de datos`, en este caso estaremos utilizando `MySQL 8.30`, entonces
, debemos utilizar alguna herramienta que nos permita utilizar `MySQL`, una vez hecho esto, hay que ejecutar un `Archivo.sql` ubicado
en el siguiente directorio: `[ Lib\src\Backup\LibQuery - Lite.sql ]`, para que se cree la base de datos.

En este punto se podrá utilizar la aplicación, pero si surge algún problema con la conexion a la base de datos, se puede deber a los siguientes puntos:

1 - La versión del MySQL es muy antigua y no es compatible con el `JDBC 8.0.30` del proyecto  
2 - La `IP` iniciada en MySQL es diferente de la `IP` en el archivo `[ ConnectionMYSQL.java ]` del proyecto, ya que el proyecto está conectado al `localhost`   
3 - Versiones diferentes de JDK  

#

# Como utilizar la aplicación [Manual usuario]

**Log in**

Cuando la aplicación inicia, lo primero que verá es una pantalla de `Log in`:

![Screenshot_1](https://github.com/01010011011001010110010001110100/Final-Proyect/assets/89937780/5a29f743-e21a-485d-8359-d6eb6eefee43)

Esta ventana le dará la opción de iniciar sesión para poder acceder a las herramientas que ofrece el software.

> **Nota:** Dependiendo de que tipo de cuenta se inicie, las opciones que aparecerán van a variar, Si se inicia con una cuenta de `ADMIN`,
> esta mostrará todas las ventanas que están más abajo, pero, si se inicia con una cuenta de `USER`,
> esta se vera limitada en ciertos aspectos, como la capacidad de generar reportes, el poder eliminar registros de forma directa a la base de datos, etc.

**Panel de administración:**

![Screenshot_2](https://github.com/01010011011001010110010001110100/Final-Proyect/assets/89937780/3838495b-1426-422f-ad94-a649aa6d0d58)

Este panel nos permitirá realizar varias acciones según el menú y sub-menú que seleccionemos:

*En el menú #1 esta:*
----

- Saber más del software

![Screenshot_4](https://github.com/01010011011001010110010001110100/Final-Proyect/assets/89937780/afc69e2b-70ed-437a-8b3a-1ef588bd449f)

Mediante esta ventana podremos informarnos de las nociones básicas del software, como, de qué va, 
qué versión es y contactosde los desarrolladores.

*En el menú #2 esta:*
----

- Registrar usuarios:

![Screenshot_3](https://github.com/01010011011001010110010001110100/Final-Proyect/assets/89937780/121a302f-8d1a-41e1-822c-cff5d3615fa1)

Aquí introduciremos una serie de datos necesarios para poder agregar nuevos usuarios `(PARA INICIAR SESIÓN CON EL LOGIN)`,
donde incluye el nombre del usuario, correo, password y acceso que tendrá el usuario.

> **Nota:** Access, es el nivel de acceso que tendrá el usuario, depende el access este podrá utilizar ciertos botones
> y acciones

- Registrar clientes *(aún por realizar)*
- Registrar empleados:

![Screenshot_6](https://github.com/01010011011001010110010001110100/Final-Proyect/assets/89937780/9902cf25-9baf-448d-97de-1eee3cbcd41c)

Aquí podremos registrar nuevos empleados e incluirlos en el sistema para poder gestionarlos.

- Manejar usuarios:

![Screenshot_7](https://github.com/01010011011001010110010001110100/Final-Proyect/assets/89937780/bf17d27e-5a9d-4e81-9184-03a00e77c066)

En el siguiente manejador podremos realizar lo siguiente (Actualizar información del usuario, eliminar usuario y buscar usuario)

- Manejar clientes *(aún por realizar)*
- Manejar empleados:

![Screenshot_8](https://github.com/01010011011001010110010001110100/Final-Proyect/assets/89937780/e542b903-b5fb-4938-90bd-4bfc4d2aa850)

Aquí podremos manejar todas las informaciones relacionadas con los empleados, NDI, nombre, etc.
Ya sea actualizar, borrar o buscar.

- visualizar el historial de acciones filtrando solo los usuarios *(aún por realizar)*

*En el menú #3 esta:*
----

- Agregar libros *(aún por realizar)*
- Agregar categorías *(aún por realizar)*
- Manejar libros *(aún por realizar)*
- Manejar categorías *(aún por realizar)*
- visualizar el historial de acciones filtrando solo el inventario *(aún por realizar)*

*En el menú #4 esta:*
----

- Aplicar a un préstamo de libro *(aún por realizar)*
- Manejar las devoluciones *(aún por realizar)*
- visualizar el historial de acciones filtrando la circulación *(aún por realizar)*

*En el menú #5 está:*
----

- Descargar todas las tablas de todos los manejadores de cada menú *(aún por realizar)*

*En el menú #6 esta:*
----

- Cambiar de cuenta
- Cerrar el programa

![Screenshot_9](https://github.com/01010011011001010110010001110100/Final-Proyect/assets/89937780/78df729a-feb3-42ef-87ed-2b4b7c91b656)

Aquí, por último, podremos cambiar de usuario dándole al botón `Cambiar de cuenta` para no tener que cerrar el programa y abrirlo de nuevo solo para iniciar sesión.
Y también podremos salir del programa dándole al botón `exit program`

#

Bueno, de momento esta fue la guía de usuario para poder utilizar el programa de forma correcta, espero que haya sido de ayuda ***:)***

