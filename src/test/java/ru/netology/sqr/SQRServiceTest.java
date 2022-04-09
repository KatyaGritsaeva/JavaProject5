package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(value = {"minimum Limit Value, 99, 110, 1",
            "mean Limit Value, 200, 300, 3",
            "maximum Limit Value, 9800, 9802, 1"})
    void shouldReturnCountOfSquare(String nameTest, long min, long max, long expected) {
        SQRService service = new SQRService();

        //Вызываемый целевой метод
        long actual = service.countOfSquare(min, max);

        //Проверка ожидаемого и фактического результата
        assertEquals(expected, actual);

    }

}

