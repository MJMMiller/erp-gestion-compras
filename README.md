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

- `models/Proveedor.java`: Clase para representar a los proveedores con sus datos.
- `models/Producto.java`: Clase que define los productos y sus atributos.
- `models/SolicitudCompra.java`: Clase que representa una solicitud de compra, con el estado de la solicitud y los productos solicitados.
- `interfaces/Calculable.java`: Interfaz que define el método para calcular el costo total de un objeto.
- `enums/EstadoSolicitud.java`: Enum que define los posibles estados de una solicitud de compra.
- `controllers/MenuController.java`: Controlador para gestionar la interacción con el menú y las operaciones del sistema.
- `App.java`: Clase principal que ejecuta el menú y las operaciones de registro, listado, búsqueda y cálculo.
---

## 🗂️ Diagrama
![](https://github.com/MJMMiller/EST_DIAGRAMS/blob/66a5794679cd2d6c5091c71d91e92dd515abc2c3/icc-est-u1-OrdenamientoBusqueda01.03.png?raw=true)

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

    El menú ofrecerá las siguientes opciones:
    - Registrar proveedor
    - Registrar producto
    - Registrar solicitud de compra
    - Listar proveedores
    - Listar productos
    - Listar solicitudes de compra
    - Buscar proveedor por ID
    - Buscar producto por nombre
    - Buscar solicitud por ID
    - Aprobar/Rechazar solicitud de compra
    - Calcular total de una solicitud
    - Salir

---

## 🧑‍💻 Ejemplo de Salida


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

- **Nicolas Cedillo - @ nicolascedillo**
- **Mateo Miller - @MJMMiller**

