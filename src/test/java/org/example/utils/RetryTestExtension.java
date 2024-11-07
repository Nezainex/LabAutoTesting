package org.example.utils;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;
import org.junit.jupiter.api.extension.TestWatcher;

public class RetryTestExtension implements TestWatcher, TestExecutionExceptionHandler {

    private int retryCount = 0;
    private static final int maxRetryCount = 3;

    @Override
    public void handleTestExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {
        // Пробрасываем исключение, если все попытки исчерпаны
        if (retryCount < maxRetryCount) {
            retryCount++;
            Allure.step("Попытка #" + retryCount, () -> System.out.println("Retrying " + context.getDisplayName() + " for the " + retryCount + " time."));
        } else {
            System.out.println("Max retry attempts reached for test: " + context.getDisplayName());
        }
        throw throwable; // Пробрасываем исключение, чтобы тест мог быть перезапущен
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        Allure.step("Тест " + context.getDisplayName() + " завершился неудачно на попытке " + retryCount);
        System.out.println("Test " + context.getDisplayName() + " failed on attempt " + retryCount);
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        retryCount = 0; // Сбрасываем счетчик после успешного выполнения теста
        Allure.step("Тест " + context.getDisplayName() + " завершился успешно");
    }
}
