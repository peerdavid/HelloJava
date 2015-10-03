# Continuous Integration
This is a simple hello world (java) project with a continuous integration workflow including the following steps:

1.) Code changes pushed into the master branch on GitHub
2.) This automatically triggers a new build on CircleCi
3.) After all tests are succeeded, CircleCi builds a new docker image
4.) Rollout image via DockerHub

# CircleCi - Hosted Continuous Integration and Deployment (circle.yml)
.) Build java source code using gradle
.) Run all unit tests
.) Create a new version of the docker image peerdavid/hellojava
.) Push image to dockerhub
  
# DockerImage (Dockerfile)
