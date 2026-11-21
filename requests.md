# Приклади запитів до MovieStore API

Запустіть застосунок (`./mvnw spring-boot:run` або клас `MoviestoreApplication` в IDE),
потім виконайте запити.

## Перелік фільмів (картки)

```bash
curl http://localhost:8080/api/movies
```

Очікувано: `200 OK`, масив карток `{ id, title, director, price, posterUrl }`.

## Один фільм з деталями

```bash
curl http://localhost:8080/api/movies/1
```

Очікувано: `200 OK`, об'єкт
`{ id, title, director, price, year, durationMinutes, posterUrl, description, genre }`.

## Неіснуючий фільм → 404

```bash
curl -i http://localhost:8080/api/movies/999
```

Очікувано: статус `404 Not Found`.
