# 挂载本地目录到容器中的/root/xueqing路径
VOLUME . /app

# 设置工作目录
WORKDIR /app

# 将项目代码复制到容器中
COPY . /app

# 编译应用程序
RUN mvn clean
RUN mvn install

# 设置应用程序入口点
CMD ["java", "-jar", "target/springboot4-1.0-SNAPSHOT.jar"]