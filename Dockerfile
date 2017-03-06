FROM anapsix/alpine-java:8_jdk_unlimited
MAINTAINER 'techMenaka'
VOLUME '/tmp'
ENV USER_NAME menaka
ENV APP_HOME /opt/$USER_NAME

RUN mkdir $APP_HOME
RUN adduser -S $USER_NAME

ADD kubernetes-0.0.1.jar  $APP_HOME/kubernetes.jar

RUN chown $USER_NAME $APP_HOME/kubernetes.jar

USER $USER_NAME
WORKDIR $APP_HOME

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-jar","kubernetes.jar"]
