# 使用官方Java镜像作为基础镜像
FROM maven:3.6.0-jdk-8 AS build

# 设置工作目录
WORKDIR /app

# 编译应用程序
COPY . .


CMD ["/bin/bash", "boot.sh"]
# 设置应用程序入口点
#CMD ["java", "-jar", "target/springboot4-1.0-SNAPSHOT.jar"]
#CMD ["java", "-jar", "-Dspring.config.location=/app/src/main/resources/application.yaml", "target/springboot4-1.0-SNAPSHOT.jar"]