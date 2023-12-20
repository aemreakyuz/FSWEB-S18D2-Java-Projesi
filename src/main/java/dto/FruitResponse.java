package dto;

import entity.Fruit;

public record FruitResponse(String message, Fruit fruit) {
}
