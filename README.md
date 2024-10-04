# Ejercicio de Coroutines en Kotlin

Este ejercicio tiene 2 tareas principales:
- Implementar llamadas asíncronas.
- Controlar el ciclo de vida de corutinas y manejar errores.

## Descripción del Ejercicio

### **Parte 1: Llamadas asíncronas**

En este ejercicio, deberás implementar una funcion que llama a una API varias
veces y espera a que todas las llamadas terminen para devolver el resultado.

### **Parte 2: Contextos y cancelación de jobs**

En este segundo ejercicio, deberás implementar una función que crea números primos
dentro de un rango. Si la funcion tarda más del tiempo limite, deberá cancelar la
corutina y devolver un error.

## Objetivos de Aprendizaje

- Implementar llamadas asíncronas en Kotlin.
- Controlar el ciclo de vida de corutinas y manejar errores.

## Instrucciones para Comenzar

### 1. Realiza un Fork del Repositorio

- Haz clic en el botón **"Fork"** en la esquina superior derecha del repositorio para crear una copia en tu cuenta de GitHub.

### 2. Clona tu Repositorio Forkeado

```bash
git clone https://github.com/tu-usuario/nombre-del-repositorio.git
cd nombre-del-repositorio
```

### 3. A trabajar

- Escribe las funciones y corre los tests cuando acabes cada una de ellas.
- Corre los tests desde el IDE para una mejor experiencia.

## Flujo de Trabajo Recomendado

1. **Fork**: Crea una copia personal del repositorio para trabajar independientemente.
2. **Work**: Implementa las funciones y pruebas en tu entorno local.
3. **Test Locally**: Ejecuta las pruebas en tu IDE para asegurar que todo funciona correctamente.
4. **Push**: Sube tus cambios a tu repositorio en GitHub.
5. **Pull Request**: Envía un Pull Request al repositorio original para revisión.
6. **CI Checks**: Verifica que los chequeos automáticos pasan exitosamente.
7. **Feedback**: Si se solicita, realiza ajustes adicionales y actualiza tu Pull Request.

## Ejecución de Pruebas

- **Desde el IDE**:
    - Ejecuta las pruebas individualmente o todas a la vez para verificar tu implementación.
- **Desde la Línea de Comandos**:
  ```bash
  ./gradlew test
  ```

## Integración Continua

- El proyecto utiliza herramientas de CI para automatizar la ejecución de pruebas.
- Es fundamental que todas las pruebas pasen antes de que se pueda fusionar el Pull Request.
- Los resultados de los chequeos de CI aparecerán automáticamente en tu Pull Request.

## Consejos Adicionales

- **Utiliza el IDE**: IntelliJ IDEA ofrece herramientas de depuración y ejecución de pruebas que facilitan el desarrollo.
- **Escribe Pruebas Exhaustivas**: Cubre tanto casos típicos como casos borde para garantizar la robustez de tus funciones.
- **Lee los Mensajes de Error**: Si una prueba falla, los mensajes de error pueden guiarte hacia la solución.


¡Buena suerte y disfruta del proceso de aprendizaje!