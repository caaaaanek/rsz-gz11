# rsz-gz11 — MovieStore

Навчальний інтернет-магазин фільмів (самостійна робота до заняття 1.1, лише backend).

**Стек:** Spring Boot 3.4.13, Java 21, Maven.

## Структура

Пакет `com.ua.moviestore`, багатошарова архітектура з інтерфейсами на межах шарів:

- `domain` — доменна модель `Movie`
- `repository` — `MovieRepository` + `InMemoryMovieRepository` (сховище в пам'яті)
- `service` — `MovieService` + `MovieServiceImpl`, маппер `MovieMapper`
- `web` — `MovieController`, DTO `MovieCardDto` / `MovieDetailDto`
- `exception` — `MovieNotFoundException` (404)
- `config` — `MovieSeeder` (початкові 5 фільмів)

## Запуск

```bash
./mvnw spring-boot:run
```

## Ендпоінти

| Метод | Шлях | Відповідь |
|---|---|---|
| GET | `/api/movies` | перелік карток фільмів |
| GET | `/api/movies/{id}` | один фільм з деталями; неіснуючий id → `404` |

Приклади `curl` — у [requests.md](requests.md).
