# HelloJava - Continuous Integration
This is a simple hello world (java) project with a continuous integration workflow including the following steps:

1.) Code changes pushed into the master branch on GitHub
2.) This automatically triggers a new build on CircleCi
3.) After all tests are succeeded, CircleCi builds a new docker image
4.) Rollout image via DockerHub

## Gradle

## CircleCi - Hosted Continuous Integration and Deployment (circle.yml)
1) Build java source code using gradle
2) Run all unit tests
3) Create a new version of the docker image peerdavid/hellojava
4) Push image to dockerhub
<b> If you want to create your own ci you have to set the environment variables EMAIL, USER and PASSWORD to connect CircleCi with DockerHub </b>
  
## DockerImage (Dockerfile)
