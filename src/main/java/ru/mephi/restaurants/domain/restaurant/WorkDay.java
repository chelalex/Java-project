package ru.mephi.restaurants.domain.restaurant;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalTime;

public class WorkDay {
    private LocalTime begin;
    private LocalTime end;
}
