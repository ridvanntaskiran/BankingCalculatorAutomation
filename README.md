# **Ziraat Bankası Hesaplama Araçları Test Otomasyonu**
Bu proje, Ziraat Bankası'nın https://www.ziraatbank.com.tr/tr/hesaplama-araclari sayfasında yer alan kredi hesaplama araçlarından herhangi birinin, mevduat getirisi hesaplama aracının ve IBAN hesaplama aracının test otomasyon senaryolarını içerir. Test otomasyon senaryoları Selenium ve Java kullanılarak yazılmıştır.

Gereksinimler
Bu projeyi çalıştırmak için aşağıdaki gereksinimlere ihtiyaç vardır:

Java Development Kit (JDK) 8 veya üstü
Maven 3.6.0 veya üstü
Google Chrome ve ChromeDriver
TestNG
Selenium WebDriver
WebDriverManager
Proje Yapısı
css
Copy code


## **Proje Yapısı**
├── src

    ├── main
    │   ├── java
    │   │   ├── org
    │   │   │   └── example
    │   │   │       ├── base
    │   │   │       │   └── WebDriverSetup.java
    │   │   │       ├── pages
    │   │   │       │   ├── DepositLoanCalculatorPage.java
    │   │   │       │   ├── IBANCalculatorPage.java
    │   │   │       │   └── LoanCalculatorPage.java
    │   │   │       └── utils
    │   │   │           ├── DepositLoanCalculatorLocators.java
    │   │   │           ├── IBANCalculatorLocators.java
    │   │   │           └── LoanCalculatorLocators.java
    │   └── resources
    └── test
        ├── java
        │   └── tests
        │       ├── DepositLoanCalculatorTest.java
        │       ├── IBANCalculatorTest.java
        │       └── LoanCalculatorTest.java
├── pom.xml

├── README.md


## __1. Kredi Hesaplama Aracı Testi__
Bu test senaryosu, kredi hesaplama aracının çalışmasını doğrular.

Test adımları:
https://www.ziraatbank.com.tr/tr/hesaplama-araclari sayfasına gidin.
- Kredi hesaplama aracını seçin.
- Gerekli alanları doldurun ve hesaplama yapın.
- Sonuçları doğrulayın.

## __2. Mevduat Getirisi Hesaplama Aracı Testi__
Bu test senaryosu, mevduat getirisi hesaplama aracının çalışmasını doğrular.

Test adımları:
- https://www.ziraatbank.com.tr/tr/hesaplama-araclari sayfasına gidin.
- Mevduat getirisi hesaplama aracını seçin.
- Gerekli alanları doldurun ve hesaplama yapın.
- Sonuçları doğrulayın.

## __3. IBAN Hesaplama Aracı Testi__
Bu test senaryosu, IBAN hesaplama aracının çalışmasını doğrular.

Test adımları:

- https://www.ziraatbank.com.tr/tr/hesaplama-araclari sayfasına gidin.
- IBAN hesaplama aracını seçin.
- Gerekli alanları doldurun ve hesaplama yapın.
- Sonuçları doğrulayın.

Yazar
Rıdvan Taşkıran
