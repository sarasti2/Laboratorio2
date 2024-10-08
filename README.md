# WorkShop 2

[![CI/CD Pipeline](https://github.com/sarasti2/Laboratorio2/actions/workflows/build.yml/badge.svg)](https://github.com/sarasti2/Laboratorio2/actions/workflows/build.yml) [![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=sarasti2_Laboratorio2-ArqSoftware&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=sarasti2_Laboratorio2-ArqSoftware)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=sarasti2_Laboratorio2-ArqSoftware&metric=bugs)](https://sonarcloud.io/summary/new_code?id=sarasti2_Laboratorio2-ArqSoftware)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=sarasti2_Laboratorio2-ArqSoftware&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=sarasti2_Laboratorio2-ArqSoftware)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=sarasti2_Laboratorio2-ArqSoftware&metric=coverage)](https://sonarcloud.io/summary/new_code?id=sarasti2_Laboratorio2-ArqSoftware)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=sarasti2_Laboratorio2-ArqSoftware&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=sarasti2_Laboratorio2-ArqSoftware)

Implementation of a Simple App with the next operations:
* Get random nations
* Get random currencies
* Get random Aircraft
* Get application version
* health check
  Including integration with GitHub Actions, Sonarqube (SonarCloud), Coveralls and
  Snyk
### Folders Structure
In the folder `src` is located the main code of the app
In the folder `test` is located the unit tests
### How to install it
Execute:
```shell
$ mvnw spring-boot:run
```
to download the node dependencies
### How to test it
Execute:
```shell
$ mvnw clean install
```
### How to get coverage test
Execute:
```shell
$ mvwn -B package -DskipTests --file pom.xml
```