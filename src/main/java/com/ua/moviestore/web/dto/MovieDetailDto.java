package com.ua.moviestore.web.dto;

import java.math.BigDecimal;

public record MovieDetailDto(Long id, String title, String director, BigDecimal price,
                             Integer year, Integer durationMinutes, String posterUrl,
                             String description, String genre) {
}
