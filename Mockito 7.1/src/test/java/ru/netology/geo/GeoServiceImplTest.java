package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import static org.junit.jupiter.api.Assertions.*;

class GeoServiceImplTest {
    GeoServiceImpl geoService= new GeoServiceImpl();

    @Test
    void byIp() {
        Location location = new Location("Moscow", Country.RUSSIA, null, 0);
        String s = "172.";
        Assertions.assertEquals(location.getCity(), geoService.byIp(s).getCity());
    }

    @Test
    void byCoordinates() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            geoService.byCoordinates(123,456);
        });
    }
}