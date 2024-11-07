package org.example.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.example.locators.SectionLocators;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SectionPage {

    public void openPage(String url) {
        open(url);
    }

    public void openPatientMenu() {
        // Клик по "Пациентам", чтобы открыть меню
        SelenideElement patientSection = $(SectionLocators.PATIENT_SECTION).shouldBe(Condition.visible);
        patientSection.click();

        // Ожидание видимости всплывающего меню "Пациентам"
        SelenideElement popupMenu = $(SectionLocators.POPUP_MENU).shouldBe(Condition.visible);
        popupMenu.shouldBe(Condition.visible);
    }

    // Метод для установки области поиска в пределах конкретной секции
    private SelenideElement getSectionContainer(String sectionName) {
        return switch (sectionName) {
            case "МРТ" -> $(SectionLocators.MRT_SECTION).parent();
            case "КТ" -> $(SectionLocators.KT_SECTION).parent();
            case "Рентген" -> $(SectionLocators.RENTGEN_SECTION).parent();
            default -> throw new IllegalArgumentException("Неверное имя секции: " + sectionName);
        };
    }

    public void waitForOverlayToDisappear() {
        // Проверяем, что перекрывающие элементы отсутствуют
        SelenideElement overlay = $("div.popmechanic-js-clickable-overlay");
        SelenideElement popupContent = $("div.mfp-content");
        if (overlay.exists()) {
            overlay.should(Condition.disappear);
        }
        if (popupContent.exists()) {
            popupContent.should(Condition.disappear);
        }
    }

    public void clickSection(String sectionName) {
        // Открываем меню "Пациентам", если требуемый раздел находится в этом меню
        if (sectionName.equals("Врачам") || sectionName.equals("Франчайзинг") ||
                sectionName.equals("Корпоративным клиентам") || sectionName.equals("Прессе")) {
            openPatientMenu();
            waitForOverlayToDisappear();
        }
        // Открываем боковое меню, если требуется один из разделов бокового меню
        else if (sectionName.equals("МРТ") || sectionName.equals("КТ") || sectionName.equals("Рентген") ||
                sectionName.equals("Эндоскопия") || sectionName.equals("УЗИ") || sectionName.equals("Инъекции")) {
            openSideBarMenu();
            clickOnSideBarSection(sectionName);
        }
        // Клик по нужному разделу в горизонтальном меню или других разделах
        else {
            SelenideElement section = $(SectionLocators.getSectionLocatorByName(sectionName)).shouldBe(Condition.visible);
            section.click();
        }
    }

    public boolean isSectionSelected(String sectionName) {
        return $(SectionLocators.getSectionLocatorByName(sectionName)).shouldBe(Condition.visible).exists();
    }

    public boolean clickSubSection(String subSectionName) {
        SelenideElement subSection = $(SectionLocators.getSubSectionLocatorByName(subSectionName));
        if (subSection.exists()) {
            subSection.click();
            return true;
        } else {
            System.out.println("Sub-section " + subSectionName + " not found.");
            return false;
        }
    }

    public void hoverOverMenu(String menuName) {
        SelenideElement menu = $(SectionLocators.getMenuLocatorByName(menuName)).shouldBe(Condition.visible);
        menu.hover();
    }

    public boolean clickMenuSubSection(String menuSubSectionName) {
        SelenideElement subSection = $(SectionLocators.getMenuLocatorByName(menuSubSectionName));
        if (subSection.exists()) {
            subSection.click();
            return true;
        } else {
            System.out.println("Menu sub-section " + menuSubSectionName + " not found.");
            return false;
        }
    }

    // Методы для работы с боковым меню
    public void openSideBarMenu() {
        SelenideElement sideBarMenu = $(SectionLocators.SIDE_BAR_MENU).shouldBe(Condition.visible);
        sideBarMenu.shouldBe(Condition.visible);
    }

    public void clickOnSideBarSection(String sideBarSectionName) {
        switch (sideBarSectionName) {
            case "МРТ":
                $(SectionLocators.MRT_SECTION).shouldBe(Condition.visible).click();
                break;
            case "КТ":
                $(SectionLocators.KT_SECTION).shouldBe(Condition.visible).click();
                break;
            case "Рентген":
                $(SectionLocators.RENTGEN_SECTION).shouldBe(Condition.visible).click();
                break;
            case "Эндоскопия":
                $(SectionLocators.ENDOSKOPIA_SECTION).shouldBe(Condition.visible).click();
                break;
            case "УЗИ":
                $(SectionLocators.UZI_SECTION).shouldBe(Condition.visible).click();
                break;
            case "Инъекции":
                $(SectionLocators.INJECTIONS_SECTION).shouldBe(Condition.visible).click();
                break;
            default:
                throw new IllegalArgumentException("Неверное имя бокового раздела: " + sideBarSectionName);
        }
    }

    // Методы для клика на подкатегории в боковом меню
    public void clickOnMrtSubCategory(String subCategory) {
        SelenideElement container = getSectionContainer("МРТ");
        switch (subCategory) {
            case "МРТ головы":
                container.find(SectionLocators.MRT_HEAD).shouldBe(Condition.visible).click();
                break;
            case "МРТ внутренних органов":
                container.find(SectionLocators.MRT_INTERNAL_ORGANS).shouldBe(Condition.visible).click();
                break;
            case "МРТ мягких тканей":
                container.find(SectionLocators.MRT_SOFT_TISSUES).shouldBe(Condition.visible).click();
                break;
            case "МРТ при беременности":
                container.find(SectionLocators.MRT_PREGNANCY).shouldBe(Condition.visible).click();
                break;
            case "МРТ периферической нервной системы":
                container.find(SectionLocators.MRT_PERIPHERAL_NERVOUS_SYSTEM).shouldBe(Condition.visible).click();
                break;
            case "МРТ молочных желез":
                container.find(SectionLocators.MRT_BREASTS).shouldBe(Condition.visible).click();
                break;
            case "МРТ позвоночника":
                container.find(SectionLocators.MRT_SPINE).shouldBe(Condition.visible).click();
                break;
            case "МРТ суставов":
                container.find(SectionLocators.MRT_JOINTS).shouldBe(Condition.visible).click();
                break;
            case "МРТ с контрастом":
                container.find(SectionLocators.MRT_CONTRAST).shouldBe(Condition.visible).click();
                break;
            case "Дополнительные услуги (МРТ)":
                container.find(SectionLocators.MRT_ADDITIONAL_SERVICES).shouldBe(Condition.visible).click();
                break;
            default:
                throw new IllegalArgumentException("Неверное имя подкатегории МРТ: " + subCategory);
        }
    }

    public void clickOnKtSubCategory(String subCategory) {
        SelenideElement container = getSectionContainer("КТ");
        switch (subCategory) {
            case "КТ головы":
                container.find(SectionLocators.KT_HEAD).shouldBe(Condition.visible).click();
                break;
            case "КТ с контрастом":
                container.find(SectionLocators.KT_CONTRAST).shouldBe(Condition.visible).click();
                break;
            case "КТ позвоночника":
                container.find(SectionLocators.KT_SPINE).shouldBe(Condition.visible).click();
                break;
            case "КТ суставов и костей":
                container.find(SectionLocators.KT_JOINTS_AND_BONES).shouldBe(Condition.visible).click();
                break;
            case "КТ внутренних органов":
                container.find(SectionLocators.KT_INTERNAL_ORGANS).shouldBe(Condition.visible).click();
                break;
            case "КТ мягких тканей":
                container.find(SectionLocators.KT_SOFT_TISSUES).shouldBe(Condition.visible).click();
                break;
            case "Дополнительные услуги (КТ)":
                container.find(SectionLocators.KT_ADDITIONAL_SERVICES).shouldBe(Condition.visible).click();
                break;
            default:
                throw new IllegalArgumentException("Неверное имя подкатегории КТ: " + subCategory);
        }
    }

    public void clickOnRentgenSubCategory(String subCategory) {
        SelenideElement container = getSectionContainer("Рентген");
        switch (subCategory) {
            case "Рентген головы":
                container.find(SectionLocators.RENTGEN_HEAD).shouldBe(Condition.visible).click();
                break;
            case "Рентген тела":
                container.find(SectionLocators.RENTGEN_BODY).shouldBe(Condition.visible).click();
                break;
            case "Рентген суставов и костей":
                container.find(SectionLocators.RENTGEN_JOINTS_AND_BONES).shouldBe(Condition.visible).click();
                break;
            case "Дополнительные услуги (Рентген)":
                container.find(SectionLocators.RENTGEN_ADDITIONAL_SERVICES).shouldBe(Condition.visible).click();
                break;
            default:
                throw new IllegalArgumentException("Неверное имя подкатегории Рентген: " + subCategory);
        }
    }

    public void clickOnEndoskopiyaSubCategory(String subCategory) {
        switch (subCategory) {
            case "Гастроскопия":
                $(SectionLocators.ENDOSKOPIA_GASTROSCOPY).shouldBe(Condition.visible).click();
                break;
            case   "Капсульная эндоскопия":
                $(SectionLocators.ENDOSKOPIA_CAPSULE).shouldBe(Condition.visible).click();
                break;
            case "Колоноскопия":
                $(SectionLocators.ENDOSKOPIA_COLONOSCOPY).shouldBe(Condition.visible).click();
                break;
            case "Ректосигмоскопия":
                $(SectionLocators.ENDOSKOPIA_RECTOSIGMOIDOSCOPY).shouldBe(Condition.visible).click();
                break;
            case  "Полипэктомия":
                $(SectionLocators.ENDOSKOPIA_POLYPECTOMY).shouldBe(Condition.visible).click();
                break;
            default:
                throw new IllegalArgumentException("Неверное имя подкатегории Эндоскопия: " + subCategory);
        }
    }

    public void clickOnUziSubCategory(String subCategory) {
        switch (subCategory) {
            case "УЗИ при беременности":
                $(SectionLocators.UZI_PREGNANCY).shouldBe(Condition.visible).click();
                break;
            case "УЗИ предстательной железы":
                $(SectionLocators.UZI_PROSTATE).shouldBe(Condition.visible).click();
                break;
            case "УЗИ в педиатрии":
                $(SectionLocators.UZI_PEDIATRICS).shouldBe(Condition.visible).click();
                break;
          case "УЗИ сосудов":
              $(SectionLocators.UZI_VESSELS).shouldBe(Condition.visible).click();
              break;
          case "УЗИ мочевыделительной системы":
                $(SectionLocators.UZI_URINARY_SYSTEM).shouldBe(Condition.visible).click();
              break;
          case "УЗИ щитовидной железы":
                $(SectionLocators.UZI_THYROID).shouldBe(Condition.visible).click();
              break;
          case "УЗИ органов брюшной полости":
                $(SectionLocators.UZI_ABDOMEN).shouldBe(Condition.visible).click();
              break;
          case "УЗИ органов малого таза":
                $(SectionLocators.UZI_PELVIS).shouldBe(Condition.visible).click();
              break;
          case "Маммологическое обследование":
                $(SectionLocators.UZI_BREAST_EXAM).shouldBe(Condition.visible).click();
              break;
          case "Прочие исследования":
                $(SectionLocators.UZI_OTHER).shouldBe(Condition.visible).click();
              break;
            default:
                throw new IllegalArgumentException("Неверное имя подкатегории УЗИ: " + subCategory);
        }
    }

    public void clickOnInjectionsSubCategory(String subCategory) {
        switch (subCategory) {
            case "Внутривенное капельное введение лекарственного средства":
                $(SectionLocators.INJECTIONS_IV).shouldBe(Condition.visible).click();
                break;
            case  "Внутривенное струйное введение лекарственного средства":
                $(SectionLocators.INJECTIONS_IV_JET).shouldBe(Condition.visible).click();
                break;
            case  "Внутримышечное введение лекарственного средства":
                $(SectionLocators.INJECTIONS_INTRAMUSCULAR).shouldBe(Condition.visible).click();
                break;
            case "Подкожное введение лекарственного средства":
                $(SectionLocators.INJECTIONS_SUBCUTANEOUS).shouldBe(Condition.visible).click();
                break;
            case "Капельницы здоровья и красоты":
                $(SectionLocators.INJECTIONS_HEALTH_BEAUTY_DRIPS).shouldBe(Condition.visible).click();
                break;
            default:
                throw new IllegalArgumentException("Неверное имя подкатегории Инъекции: " + subCategory);
        }
    }
}