package ru.netology.sqr;

public class SQRService {
    public long countOfSquare(long min, long max) {

        long count = 0;
        //Логика программы
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min && i * i <= max) {
                count = count + 1;
            }
        }
        System.out.println("Количество цифр, квардраты которых входят в границы от " + min + " до " + max + " равно: " + count);
        return count;
    }
}
