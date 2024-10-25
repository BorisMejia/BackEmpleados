# Usar una imagen base con JDK 17
FROM openjdk:17-jdk-alpine

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el código fuente al contenedor
COPY target/crud-0.0.1-SNAPSHOT.jar java-app.jar

# Compilar y ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "java-app.jar"]


