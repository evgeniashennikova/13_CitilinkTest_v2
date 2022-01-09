## Проект по разработке автотестов для интернет-магазина [Ситилинк](https://www.citilink.ru/ "Ситилинк").
### Технологический стек
________
<img src="src/test/resources/logo/Java.svg" width="50" height="50"/> <img src="src/test/resources/logo/Intelij_IDEA.svg" width="50" height="50"/> <img src="src/test/resources/logo/Gradle.svg" width="50" height="50"/> <img src="src/test/resources/logo/JUnit5.svg" width="50" height="50"/> <img src="src/test/resources/logo/Selenide.svg" width="50" height="50"/> <img src="src/test/resources/logo/GitHub.svg" width="50" height="50"/> <img src="src/test/resources/logo/Jenkins.svg" width="50" height="50"/> <img src="src/test/resources/logo/Selenoid.svg" width="50" height="50"/> <img src="src/test/resources/logo/Allure_Report.svg" width="50" height="50"/> <img src="src/test/resources/logo/Allure_TestOps.svg" width="50" height="50"/> <img src="src/test/resources/logo/Jira.svg" width="50" height="50"/> <img src="src/test/resources/logo/Telegram.svg" width="50" height="50"/>

-----
* Автотесты написаны на ``Java`` с использованием фреймворка ``Selenide``.
* ``JUnit 5`` фреймворк для модульного тестирования.
* ``Gradle`` используется для автоматизированной сборки проекта.
* С помощью ``Jenkins`` выполняется запуск тестов.
* ``Selenoid`` выполняет запуск браузеров в контейнерах ``Docker``.
* ``Allure Report`` формирует отчет о запуске тестов.
* Автотесты интегрируются с тест-менеджмент системой ``Allure TestOps`` и таск-трекер системой ``Jira``
* В ``Telegram`` бот отправляет уведомления о результатах прохождения тестов.

### ✅  Реализованы следующие тест-кейсы
1. Проверка текста заголовка на главной странице.
2. Проверка наличия логотипа на главной странице.
3. Проверка функции поиска товара на сайте.
4. Проверка перехода в раздел "Смартфоны и гаджеты".
5. Проверка наличия адреса магазина.
6. Проверка, что при клике на логотип происходит переход на главную страницу сайта.
7. Проверка открытия формы обратной связи.

### 🚀 Запуск тестов из терминала
* Локально ``gradle clean test -DtypeEnv=locale``
* Удалённо ``gradle clean test -DtypeEnv=remote``

### <img src="src/test/resources/logo/Jenkins.svg" width="40" height="40"/> Конфигурация Job в Jenkins 
🔴 Открыть сборку [Jenkins](https://jenkins.autotests.cloud/job/009_qaguru_j_unicorn_hw13v2/build?delay=0sec).  
🔴 Нажать **"Собрать с параметрами"**.  
🔴 Указать необходимые параметры.  
🔴 Нажать на кнопку **"Собрать"**.  

<img src="src/test/resources/screenshots/Jenkins parameters.jpg" width="1000" height="400"/>  

🔴 Для формирования отчета о прохождении тестов в Allure Report необходимо нажать на ссылку/иконку **"Allure Report"**.  

<img src="src/test/resources/screenshots/allure report1.jpg" width="1000" height="300"/>  

### <img src="src/test/resources/logo/Selenoid.svg" width="40" height="40"/> Видео прохождения тестов в Selenoid  


<https://user-images.githubusercontent.com/93325839/148690769-79fc4059-f033-4f35-a7be-39214e0dc110.mp4>


### <img src="src/test/resources/logo/Allure_Report.svg" width="30" height="30"/> Отчет о результатах тестирования в Allure Report

<details>
  <summary>Подробнее</summary>  

**1.** Страница «Overview».

<img src="src/test/resources/screenshots/allure report2.jpg" width="1000" height="200"/>  

**2.** Страница «Categories».  

Данная страница предоставляет информацио о распределении дефектов по их видам.

<img src="src/test/resources/screenshots/allure report3.jpg" width="1000" height="200"/>  

**3.** Страница «Suites».  

На данной странице представляется распределение выполнявшихся тестов по тестовым наборам или классам, в которых находятся тестовые методы.

<img src="src/test/resources/screenshots/allure report4.jpg" width="1000" height="200"/>  

**4.** Страница «Graphs».

На этой странице можно получить информацию о тестовом прогоне в графическом виде: статус прогона, распределение тестов по их критичности, длительности прохождения, перезапусках, категориях дефектах.  

<img src="src/test/resources/screenshots/allure report5.jpg" width="1000" height="200"/>  

**5.** Страница «Timeline».  

Данная страница визуализирует временные рамки прохождения каждого теста.  

<img src="src/test/resources/screenshots/allure report6.jpg" width="1000" height="200"/>  

</details>  

### <img src="src/test/resources/logo/Allure_TestOps.svg" width="30" height="30"/> Интеграция тестов c тест-менеджмент системой [Allure TestOps](https://allure.autotests.cloud/project/862/dashboards)

<details>
  <summary>Подробнее</summary> 

📎 Dashboards  

<img src="src/test/resources/screenshots/testops_dashboards.jpg" width="1000" height="200"/>  

📎 Test cases  

<img src="src/test/resources/screenshots/testops_testcases.jpg" width="1000" height="200"/>  

📎 Launches. Запуски тестов.  

<img src="src/test/resources/screenshots/launches.jpg" width="1000" height="200"/>  

</details>  

### <img src="src/test/resources/logo/Jira.svg" width="30" height="30"/> Интеграция тестов c таск-трекер системой [Jira](https://jira.autotests.cloud/browse/HOMEWORK-287)  

<img src="src/test/resources/screenshots/jiratask.jpg" width="1000" height="200"/>  
 

### <img src="src/test/resources/logo/Telegram.svg" width="30" height="30"/> Уведомления о прохождении тестов в Telegram  

<img src="src/test/resources/screenshots/telegram_bot.jpg" width="500" height="400"/>  








