sudo docker stop jse
sudo docker rm jse
sudo docker build -t rodrigo/jse .
sudo docker run -d --name jse --link web:host-core rodrigo/jse
