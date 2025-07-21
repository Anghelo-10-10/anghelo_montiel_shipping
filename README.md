# 🚚 Shipping - Sistema de Gestión de Envíos

Sistema de gestión de envíos de paquetes desarrollado con **Spring Boot** y **Kotlin** que permite registrar, consultar y gestionar el estado de paquetes. Proyecto académico para la materia de Arquitectura Empresarial.

---

## 📋 Descripción General

**Shipping** es una API REST que permite gestionar de forma eficiente el ciclo de vida de un envío. Las funcionalidades principales incluyen:

### ✅ Registro de Envíos

- Tipos de paquete: `DOCUMENT`, `SMALL_BOX`, `FRAGILE`
- Validación de peso y descripción del contenido
- Registro de ciudades de origen y destino
- Generación automática de `tracking ID` único
- Estado inicial asignado: `PENDING`
- Cálculo de fecha estimada de entrega

### ✅ Consulta de Envíos

- Listado completo de todos los paquetes registrados
- Consulta detallada de un paquete por su `tracking ID`
- Historial de todos los cambios de estado de un envío

### ✅ Gestión de Estados

- Estados permitidos: `PENDING`, `IN_TRANSIT`, `DELIVERED`, `ON_HOLD`, `CANCELLED`
- Validaciones de transición entre estados
- Registro automático de historial en cada cambio
- Comentarios opcionales en cada transición

---

## ⚙️ Requisitos Previos

Antes de ejecutar el proyecto, asegúrate de tener instalado:

- Java 21
- Docker y Docker Compose
- Git
- Gradle (incluido en el wrapper)

---

## 🚀 Instalación y Ejecución

### 1. Clonar el Repositorio

```bash
git clone https://github.com/tuusuario/nombre_apellido_shipflow.git
cd nombre_apellido_shipflow
