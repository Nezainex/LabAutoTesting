package org.example.tests;

import org.example.steps.SearchSteps;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import io.qameta.allure.Allure;

import static com.codeborne.selenide.Selenide.open;

public class SearchTests extends BaseTest {

    SearchSteps searchSteps = new SearchSteps();

    @BeforeEach
    public void setUp() {
        Allure.step("Открываем страницу поиска анализов", () -> open("https://www.invitro.ru/analizes/for-doctors/"));
    }

    @DisplayName("Тест ввода кода анализа и проверка его отображения в результатах поиска")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testEnterAnalysisCode(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " тестирования ввода кода анализа", () -> {
            String code = "1515";
            Allure.step("Вводим код анализа: " + code, () -> searchSteps.enterAnalysisCode(code));
            Allure.step("Проверяем, что код анализа корректно обработан и отображается в результатах поиска",
                    () -> searchSteps.verifyAnalysisCodeProcessed(code));
        });
    }
}
