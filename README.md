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

2. Configurar la Base de Datos
Levanta PostgreSQL usando Docker:

bash
Copiar
docker-compose up -d
Asegúrate de que el puerto 5432 no esté ocupado.

3. Ejecutar la Aplicación
bash
Copiar
./gradlew bootRun
La API estará disponible en:
📍 http://localhost:8080/shipping/api

📋 API Endpoints
📦 Gestión de Paquetes
Crear Envío
POST /shipping/api/packages

json
Copiar
{
  "type": "DOCUMENT",
  "weight": 0.5,
  "description": "Contrato de compraventa",
  "cityFrom": "Quito",
  "cityTo": "Guayaquil"
}
Listar Todos los Envíos
GET /shipping/api/packages

Consultar Envío por Tracking ID
GET /shipping/api/packages/{trackingId}

Consultar Historial del Envío
GET /shipping/api/packages/{trackingId}/history

Actualizar Estado del Envío
PUT /shipping/api/packages/{trackingId}/status

json
Copiar
{
  "status": "IN_TRANSIT",
  "comment": "Paquete recogido en oficina central"
}
📦 Notas Adicionales
Asegúrate de revisar las reglas de validación de transición de estados antes de actualizar.

El historial de cada envío se guarda automáticamente para auditoría.

Se recomienda probar la API con Postman o Insomnia.

👨‍💻 Autor
Anghelo Montiel
Proyecto académico - Arquitectura Empresarial