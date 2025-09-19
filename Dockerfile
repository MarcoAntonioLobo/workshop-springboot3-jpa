# ===== STAGE 1: BUILD =====
FROM maven:3.9.3-eclipse-temurin-17 AS build

WORKDIR /app

# Copia pom.xml e baixa dependências
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copia o código-fonte e builda o JAR
COPY src ./src
RUN mvn package -DskipTests -B

# ===== STAGE 2: RUNTIME =====
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Copia o JAR gerado do stage de build
COPY --from=build /app/target/*.jar app.jar

# Expõe porta
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java","-jar","app.jar"]
