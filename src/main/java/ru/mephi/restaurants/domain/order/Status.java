package ru.mephi.restaurants.domain.order;

enum Status {
    ACCEPTED, //принят
    PROCESSING, //в обработке
    CONFIRMED, //подтвержден
    DECLINED, //отклонен (рестораном)
    CANCELED, //отменен (клиентом)
    ARCHIVE //в архиве (история заказов)
}
