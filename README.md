Sistema de Catálogo y Compra de Motocicletas

Este proyecto es una aplicación web desarrollada con Spring Boot que permite visualizar un catálogo de motocicletas, filtrarlas según sus características y gestionar el proceso de cotización y compra.

El sistema implementa el patrón MVC (Modelo – Vista – Controlador) para una organización clara y escalable.

 Objetivo del Sistema

Desarrollar una aplicación web que permita administrar un catálogo de motocicletas y facilitar a los usuarios el proceso de consulta, cotización y compra.

 Funcionalidades

✔ Visualización del catálogo de motos disponibles
✔ Filtrar motocicletas por:

 Precio

 Año

 Color

✔ Ver detalles de cada motocicleta
✔ Solicitar cotización
✔ Registrar datos del comprador
✔ Gestionar proceso de compra
✔ Consultar lista de compradores

 Arquitectura del Proyecto

El sistema está estructurado bajo el patrón MVC:

📁 Backend
src/main/java/
 ├── Controllers   → Manejo de rutas y vistas
 ├── Models        → Entidades del sistema
 ├── Service       → Lógica de negocio
 └── ClientealmacenmotosApplication.java
📁 Recursos
src/main/resources/
 ├── templates     → Vistas HTML (Thymeleaf)
 └── application.properties

⚙️ Configuración

Archivo application.properties:

spring.application.name=clientealmacenmotos
server.port=8081

 Tecnologías Utilizadas

Java

Spring Boot

Spring MVC

Thymeleaf

HTML5

CSS3

JavaScript

Maven

▶️ Cómo Ejecutar el Proyecto
1️⃣ Clonar el repositorio
git clone https://github.com/Lenguaje-De-Programacion-3/proyecto1lg3.git
2️⃣ Abrir el proyecto en IntelliJ IDEA o VS Code
3️⃣ Ejecutar la clase principal
ClientealmacenmotosApplication.java
4️⃣ Abrir en el navegador
http://localhost:8081

 Autores

Proyecto desarrollado por:

Esmeralda Ramos

Martin Herrera

Salvador Farah

Estado del Proyecto

✅ Funcional en entorno local
✅ Arquitectura MVC implementada
✅ Comunicación cliente-servidor operativa
✅ Interfaz web interactiva

Asignatura

Lenguaje de Programación III