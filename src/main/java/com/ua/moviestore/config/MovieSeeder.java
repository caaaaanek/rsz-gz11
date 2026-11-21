package com.ua.moviestore.config;

import com.ua.moviestore.domain.Movie;
import com.ua.moviestore.repository.MovieRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class MovieSeeder implements ApplicationRunner {

    private final MovieRepository repository;

    public MovieSeeder(MovieRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(ApplicationArguments args) {
        repository.save(new Movie(null, "Тіні забутих предків", "Сергій Параджанов",
                new BigDecimal("149.00"), 1965, 97, "/posters/tini-zabutykh-predkiv.jpg",
                "Історія кохання Івана та Марічки в гуцульських Карпатах.", "Драма"));
        repository.save(new Movie(null, "Інтерстеллар", "Крістофер Нолан",
                new BigDecimal("199.00"), 2014, 169, "/posters/interstellar.jpg",
                "Група дослідників вирушає крізь червоточину в пошуках нового дому для людства.",
                "Наукова фантастика"));
        repository.save(new Movie(null, "Мої думки тихі", "Антоніо Лукіч",
                new BigDecimal("129.00"), 2019, 104, "/posters/moi-dumky-tykhi.jpg",
                "Звукорежисер вирушає в експедицію Закарпаттям разом зі своєю мамою.", "Комедія"));
        repository.save(new Movie(null, "Матриця", "Лана та Ліллі Вачовські",
                new BigDecimal("179.00"), 1999, 136, "/posters/matrix.jpg",
                "Хакер Нео дізнається, що світ навколо — симуляція.", "Бойовик"));
        repository.save(new Movie(null, "Памфір", "Дмитро Сухолиткий-Собчук",
                new BigDecimal("159.00"), 2022, 102, "/posters/pamfir.jpg",
                "Чоловік повертається додому на Буковину напередодні Маланки й змушений рятувати родину.",
                "Трилер"));
    }
}
