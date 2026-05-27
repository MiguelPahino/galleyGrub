# GalleyGrub 🍽️

Aplicación desarrollada en Java que permite gestionar y tickets de un restaurante.

## Índice

- [Introducción](#introducción)
- [Manual](#manual)
  - [Requisitos](#requisitos)
  - [Instalación](#instalación)
  - [Uso](#uso)
- [Metodología](#metodología)
  - [Historias de usuario](#historias-de-usuario)
- [Diseño](#diseño)
  - [Herramientas utilizadas](#herramientas-utilizadas)
- [Conclusión](#conclusión)


---

# Introducción

GalleyGrub es un programa desarrollado en Java que permite a los usuarios explorar, guardar y gestionar tickets de un pedido de forma sencilla e intuitiva.

Este proyecto está hecho por:

- Miguel Gutierrez Pahino

---

# Manual

## Requisitos

- Java 21+
- Gradle 8+
- Android Studio Hedgehog o superior
- Android SDK 34+
- Dispositivo o emulador Android (API 26+)

## Instalación

1. **Clonar el repositorio**

```bash
git clone https://github.com/MiguelPahino/galleyGrub.git
cd galleyGrub
```

2. **Instalar dependencias con Gradle**

El proyecto usa el wrapper de Gradle, no es necesario tener Gradle instalado globalmente:

```bash
# En Linux/macOS
./gradlew build

# En Windows
gradlew.bat build
```


## Uso


**Desde la terminal:**

```bash

# Ejecutar tests
./gradle test

# Limpiar y compilar desde cero
./gradle clean build


./gradle jar  o ./gradle jar →  java -jar app/build/libs/app.jar
```

---

# Metodología

La metodología empleada fue **TDD (Tets Driven Development)**, definiendo primero los test de cada funcionalidad antes de escribir el código.

También hemos utilizado **Scrum** como marco de trabajo, organizando el desarrollo en sprints con historias de usuario.

---

# Descripción técnica


# Diseño


## Herramientas utilizadas

- **Java 21**
  - **JUnit 5**: framework de testing para pruebas unitarias.
  - **Gradle**: sistema de construcción y gestión de dependencias.
  - **Guava**: librería de utilidades de Google (colecciones, streams).

- **Android**
  - **Android SDK**: plataforma de desarrollo para Android.
  - **Room**: librería de persistencia local (base de datos SQLite).
  - **Retrofit**: cliente HTTP para consumo de APIs REST.
  - **RecyclerView**: componente para listas de recetas eficientes.

- **Markdown**

---

# Conclusión

En este proyecto hemos puesto en práctica el desarrollo con Java, aplicando patrones de diseño como Chain of responsability y principios de la POO como encapsulación y herencia.

Hemos aprendido el funcionamiento del ciclo de vida de Android, la gestión de dependencias con Gradle y el consumo de APIs externas.

