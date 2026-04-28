# HttpMetodosPrueba-Spring-UNRN
Este repositorio esta dedicado a tener una vision practica de los metodos Http🌐.

-------------------------------- CONCEPTOS📕 ------------------------------------------

🌐¿Qué es una HTTP Request?🌐
Una HTTP Request (petición HTTP) es un mensaje que envía el navegador al servidor para pedir algo.

Para qué funcionan las HTTP Requests?🤔
Sirven para pedir o enviar información entre cliente y servidor.

Ejemplos:

| Lo que hacés      | HTTP Request que ocurre  |
| ----------------- | ------------------------ |
| Abrís una página  | Pedís HTML               |
| Se carga CSS      | Pedís archivo CSS        |
| Se muestra imagen | Pedís imagen             |
| Enviás formulario | Mandás datos             |
| Guardás usuario   | Enviás datos al servidor |

¿Qué tiene una HTTP Request?

Una request tiene 3 partes importantes:

1️⃣Método HTTP ¿Que va a hacer?

| Método | Para qué sirve | Ejemplo           |
| ------ | -------------- | ----------------- |
| GET    | Pedir datos    | Ver página        |
| POST   | Enviar datos   | Formulario        |
| PUT    | Actualizar     | Editar usuario    |
| DELETE | Borrar         | Eliminar registro |

2️⃣ URL (la dirección)
ej: http://localhost:8080/usuarios

3️⃣ Body (los datos enviados)
Solo existe en POST, PUT, etc.
Ejemplo
  formulario:
    <form action="/guardar" method="post">
  Se envia al controller esto:
    nombre=Mario
    edad=25

⚠️ Importante:
Cada recurso es una request distinta.
Ejemplo:
  home.html --> GET /
  style.css --> GET /css/style.css
  imagen1.png --> GET /images/imagen1.png

----------------------------🎯 Objetivo del proyecto ----------------------------------

Notas Web
 ├── Ver notas
 ├── Crear nota
 ├── Editar nota
 └── Eliminar nota
 
 -------------------------------📁 ESTRUCTURA -----------------------------------------
testSpring.Http
 ├── HttpApplication.java
 ├── controller
 ├── service
 └── model
 

