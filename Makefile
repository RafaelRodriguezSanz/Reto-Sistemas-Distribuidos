clean:
	docker-compose down --remove-orphans --volumes & docker network prune -f & docker container prune -f & docker builder prune -a -f & for /f "tokens=*" %%i in ('docker images -aq') do docker rmi -f %%i & for /f "tokens=*" %%i in ('docker ps -aq') do docker rm -f %%i & for /f "tokens=*" %%i in ('docker volume ls -q') do docker volume rm -f %%i & docker image prune -a -f
build:
	cd ./springboot & mvnw.cmd clean  & mvnw.cmd install package
initialize:
	"C:/Archivos de Programa/Docker/Docker/Docker Desktop.exe"
start:
	net stop com.docker.service && net start com.docker.service
deploy:	
	docker-compose up
stop:
	docker-compose down
kill:
	net stop com.docker.service
all:
	make start & make clean & make build & make deploy