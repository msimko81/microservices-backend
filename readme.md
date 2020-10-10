# Backend application

## Endpoints

There are two simple endpoints.

[List](http://localhost:8080/list)
```
curl --location --request GET 'localhost:8080/list'
```

[Save](http://localhost:8080/save?name=miro)
```
curl --location --request POST 'localhost:8080/save' \
--form 'name=miro'
```

## Local build and run

### Build using local installation of gradle

```gradle build```

### Build using gradle wrapper

```./gradlew build```

### Run application

```java -jar build/libs/microservices-backend-0.0.1-SNAPSHOT.jar```

##  Docker build and run

### Build docker image with backend application using two stage docker build

```DOCKER_BUILDKIT=1 docker build -t miro/backend .```

### Run backend application in docker container

```docker run -it miro/backend```

