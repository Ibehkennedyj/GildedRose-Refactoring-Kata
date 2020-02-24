package com.gildedrose;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareTest {

    @Test
    void result_from_new_method_must_match_result_from_existing_method() throws IOException {

        int days = 20;

        String resultFromExistingMethod = new String(readAllBytes(get("src/main/java/com/gildedrose/result"))).replaceAll("\r", "");
        String resultFromNewMethod = TexttestFixture.newRun(days);

        assertEquals(resultFromExistingMethod, resultFromNewMethod);
        System.out.println(resultFromExistingMethod);
    }

}
