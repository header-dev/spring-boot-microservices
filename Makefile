up:
	cd ./department-service && docker-compose up -d
	cd ./employee-service && docker-compose up -d

down:
	cd ./department-service && docker-compose down
	cd ./employee-service && docker-compose down