#### Learn JPA

##### Setup working database schema 
```bash
docker-compose up -d
```
database logs all queries to console
```bash
docker logs -f postgres
```

##### Docker tips
```bash
docker ps
docker ps -a
docker rm -f $(docker ps -aq)
```
