# Spring boot CRUD

**Content**

1. [Como empezar a usar la aplicación](#como-empezar)
2. [Como contribuir con este proyecto](#como-contribuir-con-este-proyecto)
3. [Comandos git](#algunos-comandos-utiles-de-git)

## Como empezar

### Requisitos

1. Java 17 o superior

### Instalación

1. Clonar el repositorio
2. Entrar a la carpeta del proyecto y ejecutar el comando `./mvnw package`
3. Ejecutar el comando `java -jar target/customer-back-0.0.1-SNAPSHOT.jar`
4. Abrir el navegador en la dirección `http://localhost:8080/swagger-ui.html`
5. Opcionalmente, puedes clonar el front en angular del siguiente [repositorio:]()

## Como contribuir con este proyecto

Por favor lee CONTRIBUTING.md para detalles sobre nuestro código de conducta, y el proceso para enviarnos pull requests.

## Algunos comandos utiles de git

#### Cambiar a la rama 'develop'

```
git checkout develop
```

#### Actualizar la rama 'develop' con los últimos cambios

```
git pull
```

#### Crear y cambiar a una nueva rama de característica

```
git checkout -b feature/01-240508
```

#### Agregar todos los cambios al área de preparación

```
git add .
```

#### Hacer un commit con un mensaje

```
git commit -m "Change Description" -m "Additional message"
```

#### Si te equivocaste puedes modificar el último commit (antes de hacer push)

```
git commit --amend -m "update" -m "description"
```

#### Subir la rama de característica al remoto y establecer seguimiento

```
git push -u origin feature/add-input-s03
```
