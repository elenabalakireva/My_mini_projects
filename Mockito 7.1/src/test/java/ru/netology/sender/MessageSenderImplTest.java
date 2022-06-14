package ru.netology.sender;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.i18n.LocalizationService;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;


class MessageSenderImplTest {

    @ParameterizedTest
    @MethodSource("source")
    void test_check_for_Russian(String ip, Location location, String text) {
        GeoService geoService = Mockito.mock(GeoService.class);
        Mockito.when(geoService.byIp(ip))
                .thenReturn(location);

        LocalizationService localizationService = Mockito.mock(LocalizationService.class);
        Mockito.when(localizationService.locale(location.getCountry()))
                .thenReturn(text);

        MessageSender messageSender = new MessageSenderImpl(geoService, localizationService);
        Map<String, String> preferences = new HashMap<String, String>();
        preferences.put(MessageSenderImpl.IP_ADDRESS_HEADER, ip);

        Map<String, String> expected = new HashMap<String, String>();
        expected.put("x-real-ip", ip);

        Assertions.assertEquals(messageSender.send(expected), messageSender.send(preferences));

    }

    private static Stream<Arguments> source() {
        return Stream.of(Arguments.of("172.", new Location("Moscow", Country.RUSSIA, null, 0), "Добро пожаловать"), Arguments.of("000", new Location("New York", Country.USA, null, 0), "Welcome"));
    }


}