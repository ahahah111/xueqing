# 使用官方Java镜像作为基础镜像
FROM openjdk:8-jdk-alpine
# 挂载本地目录到容器中
VOLUME /app

# 设置工作目录
WORKDIR /app

# 将项目代码复制到容器中
COPY . /app

RUN apt-get update && apt-get install -y maven
# 编译应用程序
RUN mvn clean
RUN mvn install

# 设置应用程序入口点
CMD ["java", "-jar", "target/springboot4-1.0-SNAPSHOT.jar"]