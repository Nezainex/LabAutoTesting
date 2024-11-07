package org.example.locators;

import org.openqa.selenium.By;

public class SectionLocators {

    // Основные разделы
    public static final By PATIENT_SECTION = By.xpath(".//div[@id='buttonOpenPopupTargetSTATICSTRINGFORID']//span[contains(text(),'Пациентам')]");
    public static final By DOCTORS_SECTION = By.xpath(".//div[@id='popupTargetSTATICSTRINGFORID']//a[.//span[text()='Врачам']]");
    public static final By FRANCHISE_SECTION = By.xpath(".//div[@id='popupTargetSTATICSTRINGFORID']//a[.//span[text()='Франчайзинг']]");
    public static final By CORPORATE_CLIENTS_SECTION = By.xpath(".//div[@id='popupTargetSTATICSTRINGFORID']//a[.//span[text()='Корпоративным клиентам']]");
    public static final By PRESS_SECTION = By.xpath(".//div[@id='popupTargetSTATICSTRINGFORID']//a[.//span[text()='Прессе']]");

    // Всплывающее меню "Пациентам"
    public static final By POPUP_MENU = By.id("popupTargetSTATICSTRINGFORID");

    // Меню «Ещё» и его подразделы
    public static final By MORE_MENU = By.xpath(".//span[contains(text(),'Еще')]");
    public static final By COVID_LINK = By.xpath(".//div[@id='moreMenuItems']//a[contains(text(),'COVID-19')]");
    public static final By HEALTH_PROGRAMS_LINK = By.xpath(".//div[@id='moreMenuItems']//a[contains(text(),'Программы здоровья')]");
    public static final By CHECKUP_LINK = By.xpath(".//div[@id='moreMenuItems']//a[contains(text(),'Комплексные обследования')]");

    // Разделы горизонтального меню
    public static final By ANALYSIS_SECTION = By.xpath(".//li[@class='invitro_header-menu_main-item']//a[contains(text(),'Анализы')]");
    public static final By APPOINTMENT_SECTION = By.xpath(".//a[@href='/moscow/booking/']");
    public static final By DOCTORS_LINK = By.xpath(".//a[@href='/moscow/vrachi/']");
    public static final By PROMOTIONS_LINK = By.xpath(".//a[@href='/moscow/ak/']");
    public static final By ADDRESSES_LINK = By.xpath(".//li[@class='invitro_header-menu_main-item']//a[contains(text(),'Адреса')]");
    public static final By MEDICAL_SERVICES_LINK = By.xpath(".//a[@href='/moscow/radiology/']");
    public static final By HOME_VISIT_LINK = By.xpath(".//a[@href='/moscow/vnd/']");

    // Разделы бокового меню
    public static final By SIDE_BAR_MENU = By.xpath(".//div[contains(@class, 'side-bar') and contains(@class, 'side-bar--inner')]");
    public static final By MRT_SECTION = By.xpath(".//a[contains(text(),'МРТ')]");
    public static final By KT_SECTION = By.xpath(".//a[contains(text(),'КТ')]");
    public static final By RENTGEN_SECTION = By.xpath(".//a[contains(text(),'Рентген')]");
    public static final By ENDOSKOPIA_SECTION = By.xpath(".//a[contains(text(),'Эндоскопия')]");
    public static final By UZI_SECTION = By.xpath(".//a[contains(text(),'УЗИ')]");
    public static final By INJECTIONS_SECTION = By.xpath(".//a[contains(text(),'Инъекции')]");
    public static final By KOLPOSKOPIYA_SECTION = By.xpath(".//a[contains(text(),'Кольпоскопия')]");
    public static final By PLASMA_THERAPY_SECTION = By.xpath(".//a[contains(text(),'Плазмотерапия')]");
    public static final By VACCINATION_SECTION = By.xpath(".//a[contains(text(),'Вакцинация')]");
    public static final By PHLEBOLOGY_SECTION = By.xpath(".//a[contains(text(),'Флебология')]");
    public static final By FUNCTIONAL_DIAGNOSTICS_SECTION = By.xpath(".//a[contains(text(),'Функциональная диагностика')]");
    public static final By AESTHETIC_GYNECOLOGY_SECTION = By.xpath(".//a[contains(text(),'Эстетическая гинекология')]");
    public static final By BIOPSY_SECTION = By.xpath(".//a[contains(text(),'Биопсия')]");
    public static final By MAMMOGRAPHY_SECTION = By.xpath(".//a[contains(text(),'Маммография')]");
    public static final By DENSITOMETRY_SECTION = By.xpath(".//a[contains(text(),'Денситометрия')]");
    public static final By HSG_SECTION = By.xpath(".//a[contains(text(),'ГСГ')]");
    public static final By OTORHINOLARYNGOLOGY_SECTION = By.xpath(".//a[contains(text(),'Оториноларингология')]");
    public static final By ECHOCARDIOGRAPHY_SECTION = By.xpath(".//a[contains(text(),'Эхокардиография')]");
    public static final By OTHER_SERVICES_SECTION = By.xpath(".//a[contains(text(),'Прочие услуги')]");
    public static final By PREPARATION_FOR_ANALYSIS_SECTION = By.xpath(".//a[contains(text(),'Подготовка к анализам')]");
    public static final By RESTRICTIONS_SECTION = By.xpath(".//a[contains(text(),'Ограничения по приему биоматериала')]");

    // Подкатегории в боковом меню для МРТ
    public static final By MRT_HEAD = By.xpath(".//a[contains(text(),'МРТ головы')]");
    public static final By MRT_INTERNAL_ORGANS = By.xpath(".//a[contains(text(),'МРТ внутренних органов')]");
    public static final By MRT_SOFT_TISSUES = By.xpath(".//a[contains(text(),'МРТ мягких тканей')]");
    public static final By MRT_PREGNANCY = By.xpath(".//a[contains(text(),'МРТ при беременности')]");
    public static final By MRT_PERIPHERAL_NERVOUS_SYSTEM = By.xpath(".//a[contains(text(),'МРТ периферической нервной системы')]");
    public static final By MRT_BREASTS = By.xpath(".//a[contains(text(),'МРТ молочных желез')]");
    public static final By MRT_SPINE = By.xpath(".//a[contains(text(),'МРТ позвоночника')]");
    public static final By MRT_JOINTS = By.xpath(".//a[contains(text(),'МРТ суставов')]");
    public static final By MRT_CONTRAST = By.xpath(".//a[contains(text(),'МРТ с контрастом')]");
    public static final By MRT_ADDITIONAL_SERVICES = By.xpath(".//a[contains(text(),'Дополнительные услуги')]");

    // Подкатегории для КТ
    public static final By KT_HEAD = By.xpath(".//a[contains(text(),'КТ головы')]");
    public static final By KT_CONTRAST = By.xpath(".//a[contains(text(),'КТ с контрастом')]");
    public static final By KT_SPINE = By.xpath(".//a[contains(text(),'КТ позвоночника')]");
    public static final By KT_JOINTS_AND_BONES = By.xpath(".//a[contains(text(),'КТ суставов и костей')]");
    public static final By KT_INTERNAL_ORGANS = By.xpath(".//a[contains(text(),'КТ внутренних органов')]");
    public static final By KT_SOFT_TISSUES = By.xpath(".//a[contains(text(),'КТ мягких тканей')]");
    public static final By KT_ADDITIONAL_SERVICES = By.xpath(".//a[contains(text(),'Дополнительные услуги')]");

    // Подкатегории для Рентгена
    public static final By RENTGEN_HEAD = By.xpath(".//a[contains(text(),'Рентген головы')]");
    public static final By RENTGEN_BODY = By.xpath(".//a[contains(text(),'Рентген тела')]");
    public static final By RENTGEN_JOINTS_AND_BONES = By.xpath(".//a[contains(text(),'Рентген суставов и костей')]");
    public static final By RENTGEN_ADDITIONAL_SERVICES = By.xpath(".//a[contains(text(),'Дополнительные услуги')]");

    // Подкатегории для Эндоскопии
    public static final By ENDOSKOPIA_CAPSULE = By.xpath(".//a[contains(text(),'Капсульная эндоскопия')]");
    public static final By ENDOSKOPIA_GASTROSCOPY = By.xpath(".//a[contains(text(),'Гастроскопия')]");
    public static final By ENDOSKOPIA_COLONOSCOPY = By.xpath(".//a[contains(text(),'Колоноскопия')]");
    public static final By ENDOSKOPIA_RECTOSIGMOIDOSCOPY = By.xpath(".//a[contains(text(),'Ректосигмоскопия')]");
    public static final By ENDOSKOPIA_POLYPECTOMY = By.xpath(".//a[contains(text(),'Полипэктомия')]");

    // Подкатегории для УЗИ
    public static final By UZI_PREGNANCY = By.xpath(".//a[contains(text(),'УЗИ при беременности')]");
    public static final By UZI_PROSTATE = By.xpath(".//a[contains(text(),'УЗИ предстательной железы')]");
    public static final By UZI_PEDIATRICS = By.xpath(".//a[contains(text(),'УЗИ в педиатрии')]");
    public static final By UZI_VESSELS = By.xpath(".//a[contains(text(),'УЗИ сосудов')]");
    public static final By UZI_URINARY_SYSTEM = By.xpath(".//a[contains(text(),'УЗИ мочевыделительной системы')]");
    public static final By UZI_THYROID = By.xpath(".//a[contains(text(),'УЗИ щитовидной железы')]");
    public static final By UZI_ABDOMEN = By.xpath(".//a[contains(text(),'УЗИ органов брюшной полости')]");
    public static final By UZI_PELVIS = By.xpath(".//a[contains(text(),'УЗИ органов малого таза')]");
    public static final By UZI_BREAST_EXAM = By.xpath(".//a[contains(text(),'Маммологическое обследование')]");
    public static final By UZI_OTHER = By.xpath(".//a[contains(text(),'Прочие исследования')]");

    // Подкатегории для Инъекций
    public static final By INJECTIONS_IV = By.xpath(".//a[contains(text(),'Внутривенное капельное введение лекарственного средства')]");
    public static final By INJECTIONS_IV_JET = By.xpath(".//a[contains(text(),'Внутривенное струйное введение лекарственного средства')]");
    public static final By INJECTIONS_INTRAMUSCULAR = By.xpath(".//a[contains(text(),'Внутримышечное введение лекарственного средства')]");
    public static final By INJECTIONS_SUBCUTANEOUS = By.xpath(".//a[contains(text(),'Подкожное введение лекарственного средства')]");
    public static final By INJECTIONS_HEALTH_BEAUTY_DRIPS = By.xpath(".//a[contains(text(),'Капельницы здоровья и красоты')]");

    // Метод для получения локатора раздела по имени
    public static By getSectionLocatorByName(String sectionName) {
        return switch (sectionName) {
            case "Пациентам" -> PATIENT_SECTION;
            case "Врачам" -> DOCTORS_SECTION;
            case "Франчайзинг" -> FRANCHISE_SECTION;
            case "Корпоративным клиентам" -> CORPORATE_CLIENTS_SECTION;
            case "Прессе" -> PRESS_SECTION;
            case "Анализы" -> ANALYSIS_SECTION;
            case "Запись к врачу" -> APPOINTMENT_SECTION;
            case "Врачи" -> DOCTORS_LINK;
            case "Акции" -> PROMOTIONS_LINK;
            case "Адреса" -> ADDRESSES_LINK;
            case "Медицинские услуги" -> MEDICAL_SERVICES_LINK;
            case "Выезд на дом" -> HOME_VISIT_LINK;
            case "Кольпоскопия" -> KOLPOSKOPIYA_SECTION;
            case "Плазмотерапия" -> PLASMA_THERAPY_SECTION;
            case "Флебология" -> PHLEBOLOGY_SECTION;
            case "Вакцинация" -> VACCINATION_SECTION;
            case "Функциональная диагностика" -> FUNCTIONAL_DIAGNOSTICS_SECTION;
            case "Эстетическая гинекология" -> AESTHETIC_GYNECOLOGY_SECTION;
            case "Биопсия" -> BIOPSY_SECTION;
            case "Маммография" -> MAMMOGRAPHY_SECTION;
            case "Денситометрия" -> DENSITOMETRY_SECTION;
            case "ГСГ" -> HSG_SECTION;
            case "Оториноларингология" -> OTORHINOLARYNGOLOGY_SECTION;
            case "Эхокардиография" -> ECHOCARDIOGRAPHY_SECTION;
            case "Прочие услуги" -> OTHER_SERVICES_SECTION;
            case "Подготовка к анализам" -> PREPARATION_FOR_ANALYSIS_SECTION;
            case "Ограничения по приему биоматериала" -> RESTRICTIONS_SECTION;
            case "МРТ" -> MRT_SECTION;
            case "КТ" -> KT_SECTION;
            case "Рентген" -> RENTGEN_SECTION;
            case "Эндоскопия" -> ENDOSKOPIA_SECTION;
            case "УЗИ" -> UZI_SECTION;
            case "Инъекции" -> INJECTIONS_SECTION;
            default -> throw new IllegalArgumentException("Неверное имя раздела: " + sectionName);
        };
    }

    // Метод для получения локатора подкатегории по имени
    public static By getSubSectionLocatorByName(String subSectionName) {
        return switch (subSectionName) {
            case "МРТ головы" -> MRT_HEAD;
            case "МРТ внутренних органов" -> MRT_INTERNAL_ORGANS;
            case "МРТ мягких тканей" -> MRT_SOFT_TISSUES;
            case "МРТ при беременности" -> MRT_PREGNANCY;
            case "МРТ периферической нервной системы" -> MRT_PERIPHERAL_NERVOUS_SYSTEM;
            case "МРТ молочных желез" -> MRT_BREASTS;
            case "МРТ позвоночника" -> MRT_SPINE;
            case "МРТ суставов" -> MRT_JOINTS;
            case "МРТ с контрастом" -> MRT_CONTRAST;
            case "Дополнительные услуги (МРТ)" -> MRT_ADDITIONAL_SERVICES; // Обозначаем как "Дополнительные услуги (МРТ)"

            case "КТ головы" -> KT_HEAD;
            case "КТ с контрастом" -> KT_CONTRAST;
            case "КТ позвоночника" -> KT_SPINE;
            case "КТ суставов и костей" -> KT_JOINTS_AND_BONES;
            case "КТ внутренних органов" -> KT_INTERNAL_ORGANS;
            case "КТ мягких тканей" -> KT_SOFT_TISSUES;
            case "Дополнительные услуги (КТ)" -> KT_ADDITIONAL_SERVICES; // Обозначаем как "Дополнительные услуги (КТ)"

            case "Рентген головы" -> RENTGEN_HEAD;
            case "Рентген тела" -> RENTGEN_BODY;
            case "Рентген суставов и костей" -> RENTGEN_JOINTS_AND_BONES;
            case "Дополнительные услуги (Рентген)" -> RENTGEN_ADDITIONAL_SERVICES; // Обозначаем как "Дополнительные услуги (Рентген)"

            case "Капсульная эндоскопия" -> ENDOSKOPIA_CAPSULE;
            case "Гастроскопия" -> ENDOSKOPIA_GASTROSCOPY;
            case "Колоноскопия" -> ENDOSKOPIA_COLONOSCOPY;
            case "Ректосигмоскопия" -> ENDOSKOPIA_RECTOSIGMOIDOSCOPY;
            case "Полипэктомия" -> ENDOSKOPIA_POLYPECTOMY;

            case "УЗИ при беременности" -> UZI_PREGNANCY;
            case "УЗИ предстательной железы" -> UZI_PROSTATE;
            case "УЗИ в педиатрии" -> UZI_PEDIATRICS;
            case "УЗИ сосудов" -> UZI_VESSELS;
            case "УЗИ мочевыделительной системы" -> UZI_URINARY_SYSTEM;
            case "УЗИ щитовидной железы" -> UZI_THYROID;
            case "УЗИ органов брюшной полости" -> UZI_ABDOMEN;
            case "УЗИ органов малого таза" -> UZI_PELVIS;
            case "Маммологическое обследование" -> UZI_BREAST_EXAM;
            case "Прочие исследования" -> UZI_OTHER;

            case "Внутривенное капельное введение лекарственного средства" -> INJECTIONS_IV;
            case "Внутривенное струйное введение лекарственного средства" -> INJECTIONS_IV_JET;
            case "Внутримышечное введение лекарственного средства" -> INJECTIONS_INTRAMUSCULAR;
            case "Подкожное введение лекарственного средства" -> INJECTIONS_SUBCUTANEOUS;
            case "Капельницы здоровья и красоты" -> INJECTIONS_HEALTH_BEAUTY_DRIPS;
            default -> throw new IllegalArgumentException("Неверное имя подкатегории: " + subSectionName);
        };
    }
    public static By getMenuLocatorByName(String menuName) {
        return switch (menuName) {
            case "Еще" -> MORE_MENU;
            case "COVID-19" -> COVID_LINK;
            case "Программы здоровья" -> HEALTH_PROGRAMS_LINK;
            case "Комплексные обследования" -> CHECKUP_LINK;
            default -> throw new IllegalArgumentException("Неверное имя меню: " + menuName);
        };
    }
}
