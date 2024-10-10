package ru.spvrent.springHustonMVC;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.fusesource.jansi.AnsiConsole;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

//Thymeleaf — это современный серверный шаблонизатор для Java, который используется для создания динамических веб-страниц.
// Он позволяет встраивать данные с сервера в HTML-шаблоны, которые затем отображаются в браузере.
//
// Основные особенности Thymeleaf включают:
//Естественные шаблоны: HTML-шаблоны, написанные с использованием Thymeleaf, остаются валидными HTML-документами,
// которые можно просматривать в браузере даже без запуска сервера1.
//Интеграция с Spring: Thymeleaf тесно интегрируется с Spring Framework, что делает его популярным выбором для разработки веб-приложений на Java1.
//Поддержка различных форматов: Thymeleaf может работать с HTML, XML, JavaScript, CSS и даже простым текстом2.
//Расширяемость: Вы можете добавлять собственные процессоры и диалекты для расширения функциональности
@Slf4j
@SpringBootApplication
public class SpringHustonMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringHustonMvcApplication.class, args);
        log.info("=== " + new Date());


    }

}
