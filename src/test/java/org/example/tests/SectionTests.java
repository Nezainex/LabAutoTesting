package org.example.tests;

import org.example.steps.SectionSteps;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import io.qameta.allure.Allure;

import static com.codeborne.selenide.Selenide.open;

public class SectionTests extends BaseTest {

    SectionSteps sectionSteps = new SectionSteps();

    @BeforeEach
    public void setUp() {
        Allure.step("Открываем страницу медицинских услуг", () -> open("https://www.invitro.ru/moscow/radiology/"));
    }

    @DisplayName("Тестируем раздел 'Пациентам'")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testPatientSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'Пациентам'", () -> {
            sectionSteps.clickOnSection("Пациентам");
            sectionSteps.verifySectionIsSelected("Пациентам");
        });
    }

    @DisplayName("Тестируем раздел 'Врачам'")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testDoctorsSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'Врачам'", () -> {
            sectionSteps.clickOnSection("Пациентам");
            sectionSteps.clickOnSection("Врачам");
            sectionSteps.verifySectionIsSelected("Врачам");
        });
    }

    @DisplayName("Тестируем раздел 'Франчайзинг'")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testFranchiseSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'Франчайзинг'", () -> {
            sectionSteps.clickOnSection("Пациентам");
            sectionSteps.clickOnSection("Франчайзинг");
            sectionSteps.verifySectionIsSelected("Франчайзинг");
        });
    }

    @DisplayName("Тестируем раздел 'Корпоративным клиентам'")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testCorporateClientsSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'Корпоративным клиентам'", () -> {
            sectionSteps.clickOnSection("Пациентам");
            sectionSteps.clickOnSection("Корпоративным клиентам");
            sectionSteps.verifySectionIsSelected("Корпоративным клиентам");
        });
    }

    @DisplayName("Тестируем раздел 'Прессе'")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testPressSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'Прессе'", () -> {
            sectionSteps.clickOnSection("Пациентам");
            sectionSteps.clickOnSection("Прессе");
            sectionSteps.verifySectionIsSelected("Прессе");
        });
    }

    @DisplayName("Тестируем раздел 'Анализы'")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testAnalysisSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'Анализы'", () -> {
            sectionSteps.clickOnSection("Анализы");
            sectionSteps.verifySectionIsSelected("Анализы");
        });
    }

    @DisplayName("Тестируем раздел 'Запись к врачу'")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testAppointmentSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'Запись к врачу'", () -> {
            sectionSteps.clickOnSection("Запись к врачу");
            sectionSteps.verifySectionIsSelected("Запись к врачу");
        });
    }

    @DisplayName("Тестируем раздел 'Врачи'")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testDoctorsLink(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'Врачи'", () -> {
            sectionSteps.clickOnSection("Врачи");
            sectionSteps.verifySectionIsSelected("Врачи");
        });
    }

    @DisplayName("Тестируем раздел 'Акции'")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testPromotionsSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'Акции'", () -> {
            sectionSteps.clickOnSection("Акции");
            sectionSteps.verifySectionIsSelected("Акции");
        });
    }

    @DisplayName("Тестируем раздел 'Адреса'")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testAddressesSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'Адреса'", () -> {
            sectionSteps.clickOnSection("Адреса");
            sectionSteps.verifySectionIsSelected("Адреса");
        });
    }

    @DisplayName("Тестируем раздел 'Медицинские услуги'")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testMedicalServicesSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'Медицинские услуги'", () -> {
            sectionSteps.clickOnSection("Медицинские услуги");
            sectionSteps.verifySectionIsSelected("Медицинские услуги");
        });
    }

    @DisplayName("Тестируем раздел 'Выезд на дом'")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testHomeVisitSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'Выезд на дом'", () -> {
            sectionSteps.clickOnSection("Выезд на дом");
            sectionSteps.verifySectionIsSelected("Выезд на дом");
        });
    }

    @DisplayName("Тестируем раздел 'COVID-19'")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testCovid19Section(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'COVID-19'", () -> {
            sectionSteps.hoverOverMenu("Еще");
            sectionSteps.clickMenuSubSection("COVID-19");
        });
    }

    @DisplayName("Тестируем раздел 'Программы здоровья'")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testHealthProgramsSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'Программы здоровья'", () -> {
            sectionSteps.hoverOverMenu("Еще");
            sectionSteps.clickMenuSubSection("Программы здоровья");
        });
    }

    @DisplayName("Тестируем раздел 'Комплексные обследования'")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testCheckupSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'Комплексные обследования'", () -> {
            sectionSteps.hoverOverMenu("Еще");
            sectionSteps.clickMenuSubSection("Комплексные обследования");
        });
    }

    @DisplayName("Тестируем раздел 'МРТ' и его подкатегории")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testMrtSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'МРТ'", () -> {
            sectionSteps.clickOnSection("МРТ");
            sectionSteps.clickOnSubCategory("МРТ головы", "МРТ");
            sectionSteps.clickOnSubCategory("МРТ внутренних органов", "МРТ");
            sectionSteps.clickOnSubCategory("МРТ мягких тканей", "МРТ");
            sectionSteps.clickOnSubCategory("МРТ при беременности", "МРТ");
            sectionSteps.clickOnSubCategory("МРТ периферической нервной системы", "МРТ");
            sectionSteps.clickOnSubCategory("МРТ молочных желез", "МРТ");
            sectionSteps.clickOnSubCategory("МРТ позвоночника", "МРТ");
            sectionSteps.clickOnSubCategory("МРТ суставов", "МРТ");
            sectionSteps.clickOnSubCategory("МРТ с контрастом", "МРТ");
            sectionSteps.clickOnSubCategory("Дополнительные услуги (МРТ)", "МРТ");
        });
    }

    @DisplayName("Тестируем раздел 'КТ' и его подкатегории")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testKtSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'КТ'", () -> {
            sectionSteps.clickOnSection("КТ");
            sectionSteps.clickOnSubCategory("КТ головы", "КТ");
            sectionSteps.clickOnSubCategory("КТ с контрастом", "КТ");
            sectionSteps.clickOnSubCategory("КТ позвоночника", "КТ");
            sectionSteps.clickOnSubCategory("КТ суставов и костей", "КТ");
            sectionSteps.clickOnSubCategory("КТ внутренних органов", "КТ");
            sectionSteps.clickOnSubCategory("КТ мягких тканей", "КТ");
            sectionSteps.clickOnSubCategory("Дополнительные услуги (КТ)", "КТ");
        });
    }


    @DisplayName("Тестируем раздел 'Рентген' и его подкатегории")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testRentgenSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'Рентген'", () -> {
            sectionSteps.clickOnSection("Рентген");
            sectionSteps.clickOnSubCategory("Рентген головы", "Рентген");
            sectionSteps.clickOnSubCategory("Рентген тела", "Рентген");
            sectionSteps.clickOnSubCategory("Рентген суставов и костей", "Рентген");
            sectionSteps.clickOnSubCategory("Дополнительные услуги (Рентген)", "Рентген");
        });
    }

    @DisplayName("Тестируем раздел 'Денситометрия'")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testDensitometriyaSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'Денситометрия'", () -> {
            sectionSteps.clickOnSection("Денситометрия");
            sectionSteps.verifySectionIsSelected("Денситометрия");
        });
    }

    @DisplayName("Тестируем раздел 'Маммография'")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testMammografiyaSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'Маммография'", () -> {
            sectionSteps.clickOnSection("Маммография");
            sectionSteps.verifySectionIsSelected("Маммография");
        });
    }

    @DisplayName("Тестируем раздел 'Биопсия'")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testBiopsiyaSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'Биопсия'", () -> {
            sectionSteps.clickOnSection("Биопсия");
            sectionSteps.verifySectionIsSelected("Биопсия");
        });
    }

    @DisplayName("Тестируем раздел 'Эстетическая гинекология'")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testEsteticheskayaGinekologiyaSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'Эстетическая гинекология'", () -> {
            sectionSteps.clickOnSection("Эстетическая гинекология");
            sectionSteps.verifySectionIsSelected("Эстетическая гинекология");
        });
    }

    @DisplayName("Тестируем раздел 'Оториноларингология'")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testOtorinolaringologiyaSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'Оториноларингология'", () -> {
            sectionSteps.clickOnSection("Оториноларингология");
            sectionSteps.verifySectionIsSelected("Оториноларингология");
        });
    }

    @DisplayName("Тестируем раздел 'ГСГ'")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testGSGSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'ГСГ'", () -> {
            sectionSteps.clickOnSection("ГСГ");
            sectionSteps.verifySectionIsSelected("ГСГ");
        });
    }

    @DisplayName("Тестируем раздел 'Эндоскопия' и его подкатегории")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testEndoskopiyaSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'Эндоскопия'", () -> {
            sectionSteps.clickOnSection("Эндоскопия");
            sectionSteps.clickOnSubCategory("Капсульная эндоскопия", "Эндоскопия");
            sectionSteps.clickOnSubCategory("Гастроскопия", "Эндоскопия");
            sectionSteps.clickOnSubCategory("Колоноскопия", "Эндоскопия");
            sectionSteps.clickOnSubCategory("Ректосигмоскопия", "Эндоскопия");
            sectionSteps.clickOnSubCategory("Полипэктомия", "Эндоскопия");
        });
    }

    @DisplayName("Тестируем раздел 'Функциональная диагностика'")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testFunktsionalnayaDiagnostikaSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'Функциональная диагностика'", () ->
            sectionSteps.clickOnSection("Функциональная диагностика"));
    }

    @DisplayName("Тестируем раздел 'Кольпоскопия'")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testKolposkopiyaSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'Кольпоскопия'", () -> {
            sectionSteps.clickOnSection("Кольпоскопия");
            sectionSteps.verifySectionIsSelected("Кольпоскопия");
        });
    }

    @DisplayName("Тестируем раздел 'УЗИ' и его подкатегории")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testUziSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'УЗИ'", () -> {
            sectionSteps.clickOnSection("УЗИ");
            sectionSteps.clickOnSubCategory("УЗИ при беременности", "УЗИ");
            sectionSteps.clickOnSubCategory("УЗИ предстательной железы", "УЗИ");
            sectionSteps.clickOnSubCategory("УЗИ в педиатрии", "УЗИ");
            sectionSteps.clickOnSubCategory("УЗИ сосудов", "УЗИ");
            sectionSteps.clickOnSubCategory("УЗИ мочевыделительной системы", "УЗИ");
            sectionSteps.clickOnSubCategory("УЗИ щитовидной железы", "УЗИ");
            sectionSteps.clickOnSubCategory("УЗИ органов брюшной полости", "УЗИ");
            sectionSteps.clickOnSubCategory("УЗИ органов малого таза", "УЗИ");
            sectionSteps.clickOnSubCategory("Маммологическое обследование", "УЗИ");
            sectionSteps.clickOnSubCategory("Прочие исследования", "УЗИ");
        });
    }

    @DisplayName("Тестируем раздел 'Эхокардиография'")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testEhokardiografiyaSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'Эхокардиография'", () -> {
            sectionSteps.clickOnSection("Эхокардиография");
            sectionSteps.verifySectionIsSelected("Эхокардиография");
        });
    }

    @DisplayName("Тестируем раздел 'Плазмотерапия'")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testPlazmoterapiyaSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'Плазмотерапия'", () -> {
            sectionSteps.clickOnSection("Плазмотерапия");
            sectionSteps.verifySectionIsSelected("Плазмотерапия");
        });
    }

    @DisplayName("Тестируем раздел 'Вакцинация'")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testVakcinaciyaSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'Вакцинация'", () -> {
            sectionSteps.clickOnSection("Вакцинация");
            sectionSteps.verifySectionIsSelected("Вакцинация");
        });
    }

    @DisplayName("Тестируем раздел 'Инъекции' и его подкатегории")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testInjectionsSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'Инъекции'", () -> {
            sectionSteps.clickOnSection("Инъекции");
            sectionSteps.clickOnSubCategory("Внутривенное капельное введение лекарственного средства", "Инъекции");
            sectionSteps.clickOnSubCategory("Внутривенное струйное введение лекарственного средства", "Инъекции");
            sectionSteps.clickOnSubCategory("Внутримышечное введение лекарственного средства", "Инъекции");
            sectionSteps.clickOnSubCategory("Подкожное введение лекарственного средства", "Инъекции");
            sectionSteps.clickOnSubCategory("Капельницы здоровья и красоты", "Инъекции");
        });
    }

    @DisplayName("Тестируем раздел 'Флебология'")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testFlebologiyaSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'Флебология'", () -> {
            sectionSteps.clickOnSection("Флебология");
            sectionSteps.verifySectionIsSelected("Флебология");
        });
    }

    @DisplayName("Тестируем раздел 'Прочие услуги'")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testProchieUslugiSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'Прочие услуги'", () -> {
            sectionSteps.clickOnSection("Прочие услуги");
            sectionSteps.verifySectionIsSelected("Прочие услуги");
        });
    }

    @DisplayName("Тестируем раздел 'Подготовка к анализам'")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testPodgotovkaKAnalizamSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'Подготовка к анализам'", () -> {
            sectionSteps.clickOnSection("Подготовка к анализам");
            sectionSteps.verifySectionIsSelected("Подготовка к анализам");
        });
    }

    @DisplayName("Тестируем раздел 'Ограничения по приему биоматериала'")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testOgranicheniyaPoPriemuBiomaterialaSection(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " перехода в раздел 'Ограничения по приему биоматериала'", () -> {
            sectionSteps.clickOnSection("Ограничения по приему биоматериала");
            sectionSteps.verifySectionIsSelected("Ограничения по приему биоматериала");
        });
    }
}
