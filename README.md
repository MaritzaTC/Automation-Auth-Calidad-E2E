# Automatización E2E con Serenity BDD

**Integrantes:**

- [X] [Maritza Tabares Cárdenas](https://github.com/MaritzaTC)
- [X] [Ana María Vega Angarita](https://github.com/anavegaa)
- [X] [Juan David Vásquez Ospina](https://github.com/JuanVasquezO)


> [!IMPORTANT]  
> Repositorio con fines académicos


## Descripción

El proyecto está enfocado en la **automatización de pruebas E2E** utilizando **Serenity BDD** como marco principal para la ejecución de las pruebas. Serenity BDD ofrece un enfoque estructurado para pruebas con un reporte detallado, lo que permite una comprensión clara de los resultados de las pruebas y de los flujos de la aplicación.

Las pruebas están diseñadas para cubrir aspectos clave como:

- **Autenticación de usuarios** Verificar que los procesos de inicio de sesión funcionen correctamente.
- **Registro de Usuarios**: Asegurar que se pueda crear un usuario correctamente. 


## Características

- **Automatización de pruebas**: Pruebas que simulan escenarios reales de interacción de usuarios.
- **Serenity BDD**: Generación de reportes detallados para facilitar el análisis de resultados.
- **BDD (Behavior-Driven Development)**: Pruebas basadas en comportamientos, lo que facilita la comunicación entre desarrolladores y otros stakeholders.
- **Pruebas E2E**: Pruebas que simulan el recorrido completo del usuario en la aplicación.

## Requisitos

- **Java 17** 
- **Maven** para gestionar dependencias
- **Serenity BDD** y **Cucumber** (utilizados para crear pruebas basadas en comportamiento)
- Entorno de pruebas con la aplicación configurada para autenticación.

## Instalación

Sigue los pasos a continuación para configurar el proyecto en tu máquina local:

1. Clona este repositorio:

   ```bash
   git clone https://github.com/MaritzaTC/Automation-Auth-Calidad-E2E.git
2. Navega al directorio del proyecto:
    ```bash
    cd Automation-Auth-Calidad-E2E

3. Ejecuta el siguiente comando para instalar las dependencias:
   ```bash
    gradle build

   

## Ejecución de las pruebas

Para ejecutar las pruebas con Serenity BDD, usa el siguiente comando Gradle:
 ```bash
./gradle clean test
