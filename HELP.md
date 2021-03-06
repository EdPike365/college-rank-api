# Read Me First

The following was discovered as part of building this project:

* The original package name 'com.edpike365.college-rank-api' is invalid and this project uses 'com.edpike365.collegerankapi' instead.

## Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.5/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.5.5/reference/htmlsingle/#using-boot-devtools)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.5.5/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.5.5/reference/htmlsingle/#boot-features-jpa-and-spring-data)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

## Dev Container Extensions

The Spring Boot Extension Pack includes Spring Book Dashboard. Dashboard may not detect your project. I had enable and disable it. When enabling, the dev container is "workspace" (?verify)

## Auto App Reload and Web Page Reload

## Live Reload

* LiveReload: Spring dev tools docs points to http://livereload.com/extensions/, which returns 403. Use [chrome store](https://chrome.google.com/webstore/detail/livereload/jnihajbhpnppcggbcgedagnkighmdlei//go)

* RemoteLiveReload: Go to [chrome store](https://chrome.google.com/webstore/detail/remotelivereload/jlppknnillhjgiengoigajegdpieppei?hl=en-GB).


## Commands

build: mvn clean install
run: mvn spring-boot:run
If shutdown is enabled, [run this to shutdown tomcat:](//https://www.baeldung.com/spring-boot-shutdown)
curl -X POST localhost:8080/actuator/shutdown
