sudo docker stop web
sudo docker rm web
mvn clean install
sudo docker build -t rodrigo/web .
sudo docker run -p 8081:8080 -p 3700:3700 -d --name web rodrigo/web
