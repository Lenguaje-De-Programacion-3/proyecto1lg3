Sistema de Catálogo y Compra de Motocicletas

Aplicación web desarrollada con Spring Boot y Thymeleaf que permite gestionar un catálogo de motocicletas, realizar cotizaciones y registrar compradores.

📑 Tabla de Contenidos

Descripción General

Tecnologías Utilizadas

Requisitos Previos

Instalación y Ejecución

Estructura del Proyecto

Arquitectura

Modelos (Models)

Servicios (Services)

Controladores (Controllers)

Vistas (Templates)

Endpoints / Rutas

Funcionalidades

Flujo de la Aplicación

Configuración

Autores

 Descripción General

El Sistema de Catálogo y Compra de Motocicletas es una aplicación web desarrollada bajo el patrón MVC (Modelo–Vista–Controlador).

Permite:

Visualizar motocicletas disponibles.

Filtrar por precio, año y color.

Ver detalles individuales de cada motocicleta.

Registrar datos de compradores.

Realizar procesos de cotización y compra.

 Los datos se almacenan en memoria (ArrayList).
No se utiliza base de datos persistente.

🛠 Tecnologías Utilizadas
Tecnología	 -   Descripción
Java	     -   Lenguaje principal
Spring Boot	 -   Framework backend
Spring MVC	 -   Manejo de controladores y rutas
Thymeleaf	 -   Motor de plantillas
HTML5 / CSS3 -	 Estructura y estilos
JavaScript	 -   Comunicación frontend-backend
Maven	     -   Gestión de dependencias

📋 Requisitos Previos

Java JDK 17 o superior

Maven instalado (o usar mvnw)

Navegador web moderno

 Instalación y Ejecución
1️⃣ Clonar el repositorio
git clone https://github.com/Lenguaje-De-Programacion-3/proyecto1lg3.git
2️⃣ Compilar
mvn clean install
3️⃣ Ejecutar
mvn spring-boot:run
4️⃣ Acceder

Abrir en el navegador:

http://localhost:8081

 Estructura del Proyecto
proyecto1lg3/
├── pom.xml
├── README.md
│
└── src/
    ├── main/
    │   ├── java/
    │   │   ├── Controllers/
    │   │   ├── Models/
    │   │   ├── Service/
    │   │   └── ClientealmacenmotosApplication.java
    │   │
    │   └── resources/
    │       ├── application.properties
    │       ├── static/
    │       └── templates/

Arquitectura

La aplicación sigue el patrón MVC:

NAVEGADOR (Cliente)
        │
        ▼
CONTROLLERS
        │
        ▼
SERVICES
        │
        ▼
MODELS (ArrayList en memoria)

Controllers: gestionan las rutas y reciben peticiones HTTP.

Services: contienen la lógica del negocio.

Models: representan las entidades del sistema.

Templates: vistas HTML con Thymeleaf.

 Modelos (Models)
Moto.java

Representa una motocicleta.

Atributos principales:

id

marca

modelo

año

color

precio

Cliente.java

Representa un comprador registrado.

Atributos:

nombre

cédula

correo

⚙ Servicios (Services)

Contienen la lógica del negocio:

Registrar motocicletas.

Filtrar por precio, año y color.

Registrar compradores.

Procesar solicitudes de compra.

Listar clientes registrados.

Los datos se almacenan en un ArrayList en memoria.

 Controladores (Controllers)

Manejan las rutas del sistema:

Método	   Ruta	                       Descripción
GET	        /	                     Página principal
GET	       /motos	                  Lista de motos
POST	  /comprar	               Registrar comprador
GET	   /api/motos/DatosCliente	    Listar compradores
POST	/api/motos/DatosCliente	 Registrar comprador (API)

Vistas (Templates)

index.html → Página principal

catalogo.html → Lista de motos

detalle.html → Información detallada

cotizacion.html → Formulario de compra

Todas las vistas usan Thymeleaf y diseño responsivo.

🔗 Endpoints / Rutas

Resumen general:

Método	    Endpoint	          Función
GET	           /	               Inicio
GET	          /motos	          Catálogo
POST	/api/motos/DatosCliente	 Registrar cliente
GET	  /api/motos/DatosCliente	 Listar clientes
 

Funcionalidades

Visualización del catálogo

Filtrado por precio, año y color

Vista detallada

Registro de compradores

Proceso de compra

Listado de clientes

Flujo de la Aplicación
INICIO
   │
   ├── Ver Catálogo
   │       │
   │       ├── Filtrar
   │       └── Ver Detalle
   │
   └── Cotizar / Comprar
           │
           └── Registrar Cliente
⚙ Configuración
application.properties
spring.application.name=clientealmacenmotos
server.port=8081

 Estado del Proyecto

✅ Funcional en entorno local
✅ Arquitectura MVC implementada
✅ Integración backend-frontend correcta
✅ Release v1.0 creada

 

Autores

Esmeralda Ramos

Martin Herrera

Salvador Farah

Asignatura

Lenguaje de Programación III