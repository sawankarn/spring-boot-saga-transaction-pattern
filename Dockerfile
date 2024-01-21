# Use an official Ubuntu runtime as the base image
FROM ubuntu:latest

# Set the working directory to /app
WORKDIR /app

# Install necessary dependencies
RUN apt-get update && \
    apt-get install -y openjdk-8-jre wget

# Download and install ZooKeeper
RUN wget https://archive.apache.org/dist/zookeeper/zookeeper-3.6.3/apache-zookeeper-3.6.3-bin.tar.gz && \
    tar -xzf apache-zookeeper-3.6.3-bin.tar.gz && \
    mv apache-zookeeper-3.6.3-bin zookeeper

# Download and install Kafka
RUN wget https://downloads.apache.org/kafka/2.8.0/kafka_2.13-2.8.0.tgz && \
    tar -xzf kafka_2.13-2.8.0.tgz && \
    mv kafka_2.13-2.8.0 kafka

# Expose ZooKeeper and Kafka ports
EXPOSE 2181 9092

# Copy custom configurations if needed
# COPY zookeeper.properties /app/zookeeper/conf/
# COPY server.properties /app/kafka/config/

# Start ZooKeeper and Kafka
CMD ["bash", "-c", "/app/zookeeper/bin/zkServer.sh start && /app/kafka/bin/kafka-server-start.sh /app/kafka/config/server.properties"]

# Note: This is a basic Dockerfile, and you might need to adjust it based on your specific requirements and configurations.
