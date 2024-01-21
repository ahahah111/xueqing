# 使用官方Java镜像作为基础镜像
FROM openjdk:8-jdk-alpine
# 挂载本地目录到容器中
VOLUME ["/root/xueqing", "/app"]

# 设置工作目录
WORKDIR /app
RUN sed -i 's/dl-cdn.alpinelinux.org/mirrors.aliyun.com/g' /etc/apk/repositories

RUN apk update && apk add --no-cache maven
#RUN apk add --no-cache maven

# 编译应用程序
copy . /app
RUN mvn clean
RUN mvn install
RUN mvn dependency:resolve
RUN mvn dependency:copy-dependencies
# 设置应用程序入口点
#CMD ["java", "-jar", "target/springboot4-1.0-SNAPSHOT.jar"]
CMD ["java", "-jar", "-Dspring.config.location=/app/src/main/resources/application.yaml", "target/springboot4-1.0-SNAPSHOT.jar"]