# 使用官方Java镜像作为基础镜像
FROM openjdk:8-jdk-alpine
# 挂载本地目录到容器中
VOLUME ["/root/xueqing", "/app"]

# 设置工作目录
WORKDIR /app
RUN sed -i 's/dl-cdn.alpinelinux.org/mirrors.aliyun.com/g' /etc/apk/repositories

RUN apk update && apk add --no-cache maven
#RUN apk add --no-cache maven


# 复制你自己的 settings.xml 文件到 Maven 配置目录
COPY your-settings.xml /root/.m2/settings.xml
# 编译应用程序
COPY . /app
RUN mvn clean
# 编译应用程序，使用你自己的 settings.xml 文件
RUN mvn --settings /root/.m2/settings.xml clean install

RUN mvn dependency:resolve
RUN mvn dependency:copy-dependencies
# 设置应用程序入口点
#CMD ["java", "-jar", "target/springboot4-1.0-SNAPSHOT.jar"]
CMD ["java", "-jar", "-Dspring.config.location=/app/src/main/resources/application.yaml", "target/springboot4-1.0-SNAPSHOT.jar"]