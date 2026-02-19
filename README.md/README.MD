# 📚 Sistema de Gestión de Biblioteca (BST)

Proyecto desarrollado en **Java** que implementa un **Sistema de Gestión de Biblioteca**
utilizando un **Árbol Binario de Búsqueda (BST)** como estructura principal de datos.

Este sistema permite registrar, buscar, listar y administrar libros, así como manejar
préstamos y devoluciones mediante un menú interactivo en consola.

---

## 👨‍🎓 Información Académica

- **Estudiante:** Leider Rodríguez  
- **Asignatura:** Estructuras de Datos  
- **Universidad:** Universidad Remington  
- **Tema:** Árbol Binario de Búsqueda (BST)  
- **Lenguaje:** Java  

---

## 🧠 Estructura del Proyecto

biblioteca-bst/
│
├── src/
│ ├── estructura/
│ │ ├── ArbolBST.java
│ │ └── NodoBST.java
│ │
│ ├── modelo/
│ │ └── Libro.java
│ │
│ ├── servicio/
│ │ └── BibliotecaService.java
│ │
│ └── vista/
│ └── MenuPrincipal.java
│
└── README.md

---

## ⚙️ Funcionalidades del Sistema

El programa presenta un menú interactivo con las siguientes opciones:

1. Registrar nuevo libro  
2. Buscar libro por autor  
3. Buscar libro por ISBN  
4. Eliminar libro del catálogo  
5. Listar libros (InOrden – alfabético)  
6. Listar libros (PreOrden – estructura del árbol)  
7. Listar libros (PostOrden)  
8. Registrar préstamo de libro  
9. Registrar devolución de libro  
10. Listar libros disponibles  
11. Listar libros prestados  
12. Buscar libros por categoría  
13. Estadísticas del catálogo  
0. Salir  

---

## 🌳 Uso del Árbol Binario de Búsqueda (BST)

- Los libros se organizan en el árbol según un criterio de comparación (ISBN o título).
- Se utilizan recorridos:
  - **InOrden:** listado alfabético
  - **PreOrden:** visualización de la estructura del árbol
  - **PostOrden:** recorrido completo del árbol
- Cada nodo contiene un objeto `Libro`.

---

## ▶️ Ejecución del Programa

1. Abrir el proyecto en **Visual Studio Code**
2. Asegurarse de tener **Java JDK 17 o superior**
3. Ejecutar la clase principal:


4. El sistema se ejecutará en la terminal con el menú interactivo.

---

## 📌 Observaciones

- El sistema funciona completamente en consola.
- No utiliza bases de datos, toda la información se maneja en memoria.
- El proyecto fue desarrollado con fines académicos.

---

## ✅ Estado del Proyecto

✔️ Proyecto completo  
✔️ Funcional  
✔️ Cumple con los requerimientos del parcial  

---

## 📎 Repositorio

Este proyecto se encuentra alojado en GitHub y puede ser descargado o clonado
para su revisión académica.

