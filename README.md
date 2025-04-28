# 🧪 Práctica de Gestión de Compras ERP
## 📌 Información General

- **Título:** Desarrollo de Sistema de Gestión de Compras ERP
- **Asignatura:** Programación Orientada a Objetos
- **Carrera:** Computación
- **Estudiantes:** Nicolas Cedillo & Mateo Miller
- **Fecha:** 28 / 04 / 2025
- **Profesor:** Gabriel León

---

## 🛠️ Descripción

Este proyecto en Java simula un sistema de gestión de compras para una empresa. El sistema automatiza la gestión de proveedores, productos y solicitudes de compra, todo bajo un enfoque de programación orientada a objetos.

El proyecto permite:

- Registrar proveedores y productos que estos ofrecen.
- Crear y gestionar solicitudes de compra.
- Controlar el estado de cada solicitud (SOLICITADA, EN_REVISIÓN, APROBADA, RECHAZADA).
- Calcular el total de la compra dentro de cada solicitud.
- Interactuar con el sistema a través de un menú en consola.

El sistema implementa diversos conceptos de la programación orientada a objetos, como herencia, interfaces, clases abstractas, polimorfismo y enumeraciones.

---

## 🧪 Estructura
```bash
ec.edu.ups.poo/
│    ├── Controllers/
│    │   ├── ControlProductor.java
│    │   ├── ControlProvider.java
│    │   └── ControlSolicitud.java
│    │
│    ├── Models/
│    │   ├── Enums/
│    │   │   ├── EstadoSolicitud.java
│    │   │   ├── Feriado.java
│    │   │   └── Rol.java
│    │   │
│    │   └── Interface/
│    │       └── Calculable.java
│    │   │
│    │   ├── Departamento.java
│    │   ├── DetalleSolicitud.java
│    │   ├── Empleado.java
│    │   ├── Persona.java
│    │   ├── Producto.java
│    │   ├── ProductoConiva.java
│    │   ├── ProductoSiniva.java
│    │   ├── Provedor.java
│    │   └── SolicitudCompra.java
│    │
│    └── Views/
│        └── ViewConsole.java
│
└── Main.java
```
---

## 🗂️ Diagrama
![](https://raw.githubusercontent.com/MJMMiller/POO_DIAGRAMS/refs/heads/main/TrabajoColaborativo.jpg)

---
## 🚀 Ejecución

Para ejecutar el proyecto:

1. **Compila el código:**
    ```bash
    javac App.java
    ```

2. **Ejecuta la aplicación:**
    ```bash
    java App
    ```

3. **Interacción a través del menú:**

## 🍔 Menú
Este es un menu proporcioado acorde al rol, se asignaran diferentes funcionalidades: 

    - Registrar Proveedor: Registrar un nuevo proveedor en el sistema.  
    - Registrar Producto: Registrar un nuevo producto en el sistema.  
    - Registrar Solicitud: Registrar una nueva solicitud de compra.  
    - Listar Proveedores: Ver la lista de todos los proveedores.  
    - Listar Productos: Ver la lista de todos los productos.  
    - Listar Solicitudes de Compra: Ver las solicitudes de compra realizadas.  
    - Buscar proveedor por ID: Buscar un proveedor específico por su ID.  
    - Buscar proveedor por Nombre: Buscar un proveedor específico por su nombre.  
    - Buscar producto por ID: Buscar un producto específico por su ID.  
    - Buscar producto por Nombre: Buscar un producto específico por su nombre.  
    - Buscar solicitud por ID: Buscar una solicitud específica por su ID.  
    - Buscar solicitud por Estado: Buscar solicitudes según su estado.  
    - Cambiar estado solicitud de compra: Cambiar el estado de una solicitud de compra.  
    - Salir: Salir del menú.

---

## 🧑‍💻 Ejemplo de Salida

```bash
===== BIENVENIDO AL SISTEMA ERP =====
Ingrese su nombre de usuario:
Ingrese su contraseña:
Acceso concedido: 
---------------------------------------------
===== SISTEMA DE GESTIÓN DE COMPRAS ERP ( ADMIN ) =====
1.  Registrar Proveedor
2.  Registrar Producto
3.  Registrar Solicitud
4.  Listar Proveedores
5.  Listar Productos
6.  Listar Solicitudes de Compra
7.  Buscar proveedor por ID
8.  Buscar proveedor por Nombre
9.  Buscar producto por ID
10. Buscar producto por Nombre
11. Buscar solicitud por ID
12. Buscar solicitud por Estado
13. Cambiar estado solicitud de compra
14. Salir
Seleccione una opción:
```
---

## 📚 Tecnologías Utilizadas

- **Lenguaje de Programación:** 
  - Java
- **Conceptos de POO Aplicados:**
  - Herencia
  - Polimorfismo
  - Clases abstractas
  - Interfaces
  - Enumeraciones

---

## 👥 Colaboradores

- **Nicolas Cedillo - [@nicolascedillo](https://github.com/nicolascedillo)**
- **Mateo Miller - [@MJMMiller](https://github.com/MJMMiller)**

