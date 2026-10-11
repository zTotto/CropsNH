package com.gtnewhorizon.cropsnh.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CropsNHSoilTypesTest {

    @Test
    void wetlandSoilExists() {
        assertEquals("wetland", CropsNHSoilTypes.wetland.getId());
    }
}
