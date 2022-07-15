package ru.mephi.restaurants.service;

import lombok.Data;

@Data

public class Filter {
        private String field;
        private String operator;
        private String value;
}
