#
#
# @description Java 8 example
#
# @author Peer David 
# @date 2015-09-30
#


# Pull base java 8 image.
FROM java:8

# Define working directory.
WORKDIR /data

# Copy my hello world java file(s) into /data/
COPY out/production/HelloJava /data/

# Define commonly used JAVA_HOME variable
ENV JAVA_HOME /usr/lib/jvm/java-8-oracle

# Execute my java hello world prog
CMD java tirol.peer.david.tirol.peer.david.hellojava.Main
