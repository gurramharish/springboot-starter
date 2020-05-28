# Springboot Starter with Springboot parent

1. This a simple springboot starter project which can be used a template to create new springboot projects.

1. This project contains web, jpa, thymeleaf, security and h2 as dependencies.

1. This project is generated using spring cli int command.

```bash
$ spring init -d=web --java-version=14 --groupId=com.hans --artifactId=springboot-starter --packaging=jar springboot-starter
```

1. In this project we are using spring-boot-starter-parent as parent pom.

1. First we will add spring-boot-starter-web as dependency like bellow.

```xml
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

1. By using web dependencies we can write spring web mvc controllers or expose rest api using RestControllers.

1. Next add thymeleaf as dependencies to add basic UI.

```xml
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>
```

1. Now create HomePageController.java to load the home page.

1. Adding spring security to our application.

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>
```

