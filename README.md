# HelloJava - Continuous Integration
This is a simple hello world (java) project with continuous integration workflow including the following steps:
<br />
1.) Code changes pushed into the master branch on GitHub<br />
2.) This automatically triggers a new build on CircleCi<br />
3.) If everything succeeds (java build, junit tests, etc.), CircleCi builds a new docker image<br />
4.) Rollout image via DockerHub<br />

## Gradle
Build the hello world java code, which will be included and executed in the docker container. <br />

## CircleCi - Hosted Continuous Integration and Deployment (circle.yml)
1) Build java source code (./gradlew build)<br />
2) Run all unit tests (./gradlew test)<br />
3) Create a new version of the docker image 'peerdavid/hellojava'<br />
4) Push image to dockerhub<br />
<br />
<b> If you want to create your own ci you have to set the environment variables EMAIL, USER and PASSWORD to connect CircleCi with DockerHub </b>
  
## DockerImage (Dockerfile)
1.) Use java 8 base image<br />
2.) Copy java class files into the docker container
3.) Execute it
