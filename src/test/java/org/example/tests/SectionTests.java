package org.example.tests;

import org.example.steps.SectionSteps;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.example.utils.RetryTestExtension;
import io.qameta.allure.Allure;

import static com.codeborne.selenide.Selenide.open;

@ExtendWith(RetryTestExtension.class)
public class SectionTests extends BaseTest {

    SectionSteps sectionSteps = new SectionSteps();

    @BeforeEach
    public void setUp() {
        Allure.step("Открываем страницу медицинских услуг", () -> open("https://www.invitro.ru/moscow/radiology/"));
    }

    @Test
    public void testPatientSection() {
        Allure.step("Тестируем раздел 'Пациентам'", () -> {
            Allure.step("Переходим в раздел 'Пациентам'", () -> sectionSteps.clickOnSection("Пациентам"));
            Allure.step("Проверяем, что выбран раздел 'Пациентам'", () -> sectionSteps.verifySectionIsSelected("Пациентам"));
        });
    }

    @Test
    public void testDoctorsSection() {
        Allure.step("Тестируем раздел 'Врачам'", () -> {
            Allure.step("Переходим в раздел 'Пациентам'", () -> sectionSteps.clickOnSection("Пациентам"));
            Allure.step("Переходим в подраздел 'Врачам'", () -> sectionSteps.clickOnSection("Врачам"));
            Allure.step("Проверяем, что выбран раздел 'Врачам'", () -> sectionSteps.verifySectionIsSelected("Врачам"));
        });
    }

    @Test
    public void testFranchiseSection() {
        Allure.step("Тестируем раздел 'Франчайзинг'", () -> {
            Allure.step("Переходим в раздел 'Пациентам'", () -> sectionSteps.clickOnSection("Пациентам"));
            Allure.step("Переходим в подраздел 'Франчайзинг'", () -> sectionSteps.clickOnSection("Франчайзинг"));
            Allure.step("Проверяем, что выбран раздел 'Франчайзинг'", () -> sectionSteps.verifySectionIsSelected("Франчайзинг"));
        });
    }

    @Test
    public void testCorporateClientsSection() {
        Allure.step("Тестируем раздел 'Корпоративным клиентам'", () -> {
            Allure.step("Переходим в раздел 'Пациентам'", () -> sectionSteps.clickOnSection("Пациентам"));
            Allure.step("Переходим в подраздел 'Корпоративным клиентам'", () -> sectionSteps.clickOnSection("Корпоративным клиентам"));
            Allure.step("Проверяем, что выбран раздел 'Корпоративным клиентам'", () -> sectionSteps.verifySectionIsSelected("Корпоративным клиентам"));
        });
    }

    @Test
    public void testPressSection() {
        Allure.step("Тестируем раздел 'Прессе'", () -> {
            Allure.step("Переходим в раздел 'Пациентам'", () -> sectionSteps.clickOnSection("Пациентам"));
            Allure.step("Переходим в подраздел 'Прессе'", () -> sectionSteps.clickOnSection("Прессе"));
            Allure.step("Проверяем, что выбран раздел 'Прессе'", () -> sectionSteps.verifySectionIsSelected("Прессе"));
        });
    }

    @Test
    public void testAnalysisSection() {
        Allure.step("Тестируем раздел 'Анализы'", () -> {
            Allure.step("Переходим в раздел 'Анализы'", () -> sectionSteps.clickOnSection("Анализы"));
            Allure.step("Проверяем, что выбран раздел 'Анализы'", () -> sectionSteps.verifySectionIsSelected("Анализы"));
        });
    }

    @Test
    public void testAppointmentSection() {
        Allure.step("Тестируем раздел 'Запись к врачу'", () -> {
            Allure.step("Переходим в раздел 'Запись к врачу'", () -> sectionSteps.clickOnSection("Запись к врачу"));
            Allure.step("Проверяем, что выбран раздел 'Запись к врачу'", () -> sectionSteps.verifySectionIsSelected("Запись к врачу"));
        });
    }

    @Test
    public void testDoctorsLink() {
        Allure.step("Тестируем ссылку на 'Врачей'", () -> {
            Allure.step("Переходим в раздел 'Врачи'", () -> sectionSteps.clickOnSection("Врачи"));
            Allure.step("Проверяем, что выбран раздел 'Врачи'", () -> sectionSteps.verifySectionIsSelected("Врачи"));
        });
    }

    @Test
    public void testPromotionsSection() {
        Allure.step("Тестируем раздел 'Акции'", () -> {
            Allure.step("Переходим в раздел 'Акции'", () -> sectionSteps.clickOnSection("Акции"));
            Allure.step("Проверяем, что выбран раздел 'Акции'", () -> sectionSteps.verifySectionIsSelected("Акции"));
        });
    }

    @Test
    public void testAddressesSection() {
        Allure.step("Тестируем раздел 'Адреса'", () -> {
            Allure.step("Переходим в раздел 'Адреса'", () -> sectionSteps.clickOnSection("Адреса"));
            Allure.step("Проверяем, что выбран раздел 'Адреса'", () -> sectionSteps.verifySectionIsSelected("Адреса"));
        });
    }

    @Test
    public void testMedicalServicesSection() {
        Allure.step("Тестируем раздел 'Медицинские услуги'", () -> {
            Allure.step("Переходим в раздел 'Медицинские услуги'", () -> sectionSteps.clickOnSection("Медицинские услуги"));
            Allure.step("Проверяем, что выбран раздел 'Медицинские услуги'", () -> sectionSteps.verifySectionIsSelected("Медицинские услуги"));
        });
    }

    @Test
    public void testHomeVisitSection() {
        Allure.step("Тестируем раздел 'Выезд на дом'", () -> {
            Allure.step("Переходим в раздел 'Выезд на дом'", () -> sectionSteps.clickOnSection("Выезд на дом"));
            Allure.step("Проверяем, что выбран раздел 'Выезд на дом'", () -> sectionSteps.verifySectionIsSelected("Выезд на дом"));
        });
    }

    @Test
    public void testCovid19Section() {
        Allure.step("Тестируем раздел 'COVID-19'", () -> {
            Allure.step("Наводим курсор на меню 'Еще'", () -> sectionSteps.hoverOverMenu("Еще"));
            Allure.step("Переходим в подраздел 'COVID-19'", () -> sectionSteps.clickMenuSubSection("COVID-19"));
        });
    }

    @Test
    public void testHealthProgramsSection() {
        Allure.step("Тестируем раздел 'Программы здоровья'", () -> {
            Allure.step("Наводим курсор на меню 'Еще'", () -> sectionSteps.hoverOverMenu("Еще"));
            Allure.step("Переходим в подраздел 'Программы здоровья'", () -> sectionSteps.clickMenuSubSection("Программы здоровья"));
        });
    }

    @Test
    public void testCheckupSection() {
        Allure.step("Тестируем раздел 'Комплексные обследования'", () -> {
            Allure.step("Наводим курсор на меню 'Еще'", () -> sectionSteps.hoverOverMenu("Еще"));
            Allure.step("Переходим в подраздел 'Комплексные обследования'", () -> sectionSteps.clickMenuSubSection("Комплексные обследования"));
        });
    }

    @Test
    public void testMrtSection() {
        Allure.step("Тестируем раздел 'МРТ' и его подкатегории", () -> {
            Allure.step("Переходим в раздел 'МРТ'", () -> sectionSteps.clickOnSection("МРТ"));
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

    @Test
    public void testKtSection() {
        Allure.step("Тестируем раздел 'КТ' и его подкатегории", () -> {
            Allure.step("Переходим в раздел 'КТ'", () -> sectionSteps.clickOnSection("КТ"));
            sectionSteps.clickOnSubCategory("КТ головы", "КТ");
            sectionSteps.clickOnSubCategory("КТ с контрастом", "КТ");
            sectionSteps.clickOnSubCategory("КТ позвоночника", "КТ");
            sectionSteps.clickOnSubCategory("КТ суставов и костей", "КТ");
            sectionSteps.clickOnSubCategory("КТ внутренних органов", "КТ");
            sectionSteps.clickOnSubCategory("КТ мягких тканей", "КТ");
            sectionSteps.clickOnSubCategory("Дополнительные услуги (КТ)", "КТ");
        });
    }

    @Test
    public void testRentgenSection() {
        Allure.step("Тестируем раздел 'Рентген' и его подкатегории", () -> {
            Allure.step("Переходим в раздел 'Рентген'", () -> sectionSteps.clickOnSection("Рентген"));
            sectionSteps.clickOnSubCategory("Рентген головы", "Рентген");
            sectionSteps.clickOnSubCategory("Рентген тела", "Рентген");
            sectionSteps.clickOnSubCategory("Рентген суставов и костей", "Рентген");
            sectionSteps.clickOnSubCategory("Дополнительные услуги (Рентген)", "Рентген");
        });
    }

    @Test
    public void testDensitometriyaSection() {
        Allure.step("Тестируем раздел 'Денситометрия'", () -> sectionSteps.clickOnSection("Денситометрия"));
    }

    @Test
    public void testMammografiyaSection() {
        Allure.step("Тестируем раздел 'Маммография'", () -> sectionSteps.clickOnSection("Маммография"));
    }

    @Test
    public void testBiopsiyaSection() {
        Allure.step("Тестируем раздел 'Биопсия'", () -> sectionSteps.clickOnSection("Биопсия"));
    }

    @Test
    public void testEsteticheskayaGinekologiyaSection() {
        Allure.step("Тестируем раздел 'Эстетическая гинекология'", () -> sectionSteps.clickOnSection("Эстетическая гинекология"));
    }

    @Test
    public void testOtorinolaringologiyaSection() {
        Allure.step("Тестируем раздел 'Оториноларингология'", () -> sectionSteps.clickOnSection("Оториноларингология"));
    }

    @Test
    public void testGSGSection() {
        Allure.step("Тестируем раздел 'ГСГ'", () -> sectionSteps.clickOnSection("ГСГ"));
    }

    @Test
    public void testEndoskopiyaSection() {
        Allure.step("Тестируем раздел 'Эндоскопия' и его подкатегории", () -> {
            sectionSteps.clickOnSection("Эндоскопия");
            sectionSteps.clickOnSubCategory("Капсульная эндоскопия", "Эндоскопия");
            sectionSteps.clickOnSubCategory("Гастроскопия", "Эндоскопия");
            sectionSteps.clickOnSubCategory("Колоноскопия", "Эндоскопия");
            sectionSteps.clickOnSubCategory("Ректосигмоскопия", "Эндоскопия");
            sectionSteps.clickOnSubCategory("Полипэктомия", "Эндоскопия");
        });
    }

    @Test
    public void testFunktsionalnayaDiagnostikaSection() {
        Allure.step("Тестируем раздел 'Функциональная диагностика'", () -> sectionSteps.clickOnSection("Функциональная диагностика"));
    }

    @Test
    public void testKolposkopiyaSection() {
        Allure.step("Тестируем раздел 'Кольпоскопия'", () -> sectionSteps.clickOnSection("Кольпоскопия"));
    }

    @Test
    public void testUziSection() {
        Allure.step("Тестируем раздел 'УЗИ' и его подкатегории", () -> {
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

    @Test
    public void testEhokardiografiyaSection() {
        Allure.step("Тестируем раздел 'Эхокардиография'", () -> sectionSteps.clickOnSection("Эхокардиография"));
    }

    @Test
    public void testPlazmoterapiyaSection() {
        Allure.step("Тестируем раздел 'Плазмотерапия'", () -> sectionSteps.clickOnSection("Плазмотерапия"));
    }

    @Test
    public void testVakcinaciyaSection() {
        Allure.step("Тестируем раздел 'Вакцинация'", () -> sectionSteps.clickOnSection("Вакцинация"));
    }

    @Test
    public void testInjectionsSection() {
        Allure.step("Тестируем раздел 'Инъекции' и его подкатегории", () -> {
            sectionSteps.clickOnSection("Инъекции");
            sectionSteps.clickOnSubCategory("Внутривенное капельное введение лекарственного средства", "Инъекции");
            sectionSteps.clickOnSubCategory("Внутривенное струйное введение лекарственного средства", "Инъекции");
            sectionSteps.clickOnSubCategory("Внутримышечное введение лекарственного средства", "Инъекции");
            sectionSteps.clickOnSubCategory("Подкожное введение лекарственного средства", "Инъекции");
            sectionSteps.clickOnSubCategory("Капельницы здоровья и красоты", "Инъекции");
        });
    }

    @Test
    public void testFlebologiyaSection() {
        Allure.step("Тестируем раздел 'Флебология'", () -> sectionSteps.clickOnSection("Флебология"));
    }

    @Test
    public void testProchieUslugiSection() {
        Allure.step("Тестируем раздел 'Прочие услуги'", () -> sectionSteps.clickOnSection("Прочие услуги"));
    }

    @Test
    public void testPodgotovkaKAnalizamSection() {
        Allure.step("Тестируем раздел 'Подготовка к анализам'", () -> sectionSteps.clickOnSection("Подготовка к анализам"));
    }

    @Test
    public void testOgranicheniyaPoPriemuBiomaterialaSection() {
        Allure.step("Тестируем раздел 'Ограничения по приему биоматериала'", () -> sectionSteps.clickOnSection("Ограничения по приему биоматериала"));
    }
}
