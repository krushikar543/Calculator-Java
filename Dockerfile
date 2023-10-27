FROM openjdk:17
COPY ./target/calculator-1.0-SNAPSHOT.jar ./
COPY ./target/lib/* ./
WORKDIR ./
CMD ["java","-cp", "calculator-1.0-SNAPSHOT.jar:lib/*", "com.sample.Main"]

