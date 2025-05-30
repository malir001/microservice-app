# Use Tomcat base image
FROM tomcat:9.0

# Remove default webapps (optional)
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy WAR file into Tomcat
COPY target/*.war /usr/local/tomcat/webapps/myapp.war

# Expose Tomcat port
EXPOSE 8080
