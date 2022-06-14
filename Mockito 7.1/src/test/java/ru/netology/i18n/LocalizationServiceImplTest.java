package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

import static org.junit.jupiter.api.Assertions.*;

class LocalizationServiceImplTest {
    LocalizationService localizationService=new LocalizationServiceImpl();
    @Test
    void localeRus() {
        String result = "Добро пожаловать";
        Assertions.assertEquals(result, localizationService.locale(Country.RUSSIA));
        Assertions.assertNotEquals(result, localizationService.locale(Country.USA));
    }
}