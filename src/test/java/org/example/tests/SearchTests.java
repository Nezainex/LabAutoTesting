package org.example.tests;

import org.example.steps.SearchSteps;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.example.utils.RetryTestExtension;
import io.qameta.allure.Allure;

import static com.codeborne.selenide.Selenide.open;

@ExtendWith(RetryTestExtension.class)
public class SearchTests extends BaseTest {

    SearchSteps searchSteps = new SearchSteps();

    @BeforeEach
    public void setUp() {
        Allure.step("Открываем страницу поиска анализов", () -> open("https://www.invitro.ru/analizes/for-doctors/"));
    }

    @Test
    public void testEnterAnalysisCode() {
        Allure.step("Тестируем ввод кода анализа и проверку его отображения в результатах поиска", () -> {
            String code = "1515";
            Allure.step("Вводим код анализа: " + code, () -> searchSteps.enterAnalysisCode(code));
            Allure.step("Проверяем, что код анализа корректно обработан и отображается в результатах поиска",
                    () -> searchSteps.verifyAnalysisCodeProcessed(code));
        });
    }
}
