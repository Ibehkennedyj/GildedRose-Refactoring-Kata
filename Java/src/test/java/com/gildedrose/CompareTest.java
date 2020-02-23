package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareTest {

    @Test
    void result_from_new_method_must_match_result_from_existing_method() {

        int days = 20;

        String resultFromExistingMethod = TexttestFixture.existingRun(days);
        String resultFromNewMethod = TexttestFixture.newRun(days);

        assertEquals(resultFromExistingMethod, resultFromNewMethod);

    }

}
