# Spring boot CRUD

**Content**   
1. [Como contribuir con este proyecto](#como-contribuir-con-este-proyecto)
2. [Como empezar a usar la aplicación](#como-empezar)


## Como contribuir con este proyecto.

1. Primero, necesitas hacer un fork del repositorio al que deseas contribuir. Esto creará una copia del repositorio en tu cuenta de GitHub. Puedes hacer un fork de un repositorio haciendo clic en el botón "Fork" en la esquina superior derecha de la página del repositorio.
Puedes hacer el fork de todas las ramas o de la rama develop 

2. A continuación, necesitas clonar tu repositorio bifurcado en tu máquina local. Esto te permitirá trabajar en los archivos del proyecto sin conexión. Puedes clonar tu repositorio bifurcado utilizando el comando git clone con la URL de tu bifurcación.

3. Después de clonar tu repositorio bifurcado, necesitas crear una rama para trabajar en tus cambios. Una rama es una versión separada del código que puedes modificar sin afectar la rama principal. Puedes crear una rama utilizando el comando git branch con el nombre de tu rama.

4. Una vez que hayas creado una rama, necesitas cambiar a ella utilizando el comando git checkout con el nombre de tu rama. Esto hará que tu rama sea la activa y cualquier cambio que hagas se aplicará a ella. 

5. Ahora puedes empezar a trabajar en tus cambios. Puedes editar, agregar o eliminar cualquier archivo en tu rama como desees. Puedes utilizar cualquier editor de código o IDE que prefieras. 

6. Después de hacer tus cambios, necesitas hacer commit de ellos en tu rama. 

7. A continuación, necesitas enviar tus cambios a tu repositorio bifurcado en GitHub. Esto subirá tu rama y sus commits a tu repositorio en línea. Puedes enviar tus cambios utilizando el comando git push con el nombre de tu remoto (normalmente origin) y el nombre de tu rama.

8. Por último, necesitas crear una solicitud de extracción (pull request) desde tu rama al repositorio original del que hiciste la bifurcación. Una solicitud de extracción es una solicitud para que los mantenedores del repositorio original revisen y fusionen tus cambios en su rama principal. Puedes crear una solicitud de extracción haciendo clic en el botón "Pull Request" en la página de tu repositorio bifurcado en GitHub. 

## Como empezar
### Requisitos
1. Java 17 o superior

### Instalación
1. Clonar el repositorio
2. Entrar a la carpeta del proyecto y ejecutar el comando `./mvnw package`
3. Ejecutar el comando `java -jar target/customer-back-0.0.1-SNAPSHOT.jar`
4. Abrir el navegador en la dirección `http://localhost:8080/swagger-ui.html`
5. Opcionalmente, puedes clonar el front en angular del siguiente [repositorio:]()
