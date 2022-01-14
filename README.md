## Проект по разработке автотестов для интернет-магазина [Ситилинк](https://www.citilink.ru/ "Ситилинк").
### Технологический стек
________
<img src="image/logo/Java.svg" width="50" height="50"/> <img src="image/logo/Intelij_IDEA.svg" width="50" height="50"/> <img src="image/logo/Gradle.svg" width="50" height="50"/> <img src="image/logo/JUnit5.svg" width="50" height="50"/> <img src="image/logo/Selenide.svg" width="50" height="50"/> <img src="image/logo/GitHub.svg" width="50" height="50"/> <img src="image/logo/Jenkins.svg" width="50" height="50"/> <img src="image/logo/Selenoid.svg" width="50" height="50"/> <img src="image/logo/Allure_Report.svg" width="50" height="50"/> <img src="image/logo/Allure_TestOps.svg" width="50" height="50"/> <img src="image/logo/Jira.svg" width="50" height="50"/> <img src="image/logo/Telegram.svg" width="50" height="50"/>

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

### <img src="image/logo/Jenkins.svg" width="40" height="40"/> Конфигурация Job в Jenkins 
🔴 Открыть сборку [Jenkins](https://jenkins.autotests.cloud/job/009_qaguru_j_unicorn_hw13v2/build?delay=0sec).  
🔴 Нажать **"Собрать с параметрами"**.  
🔴 Указать необходимые параметры.  
🔴 Нажать на кнопку **"Собрать"**.  

<img src="image/screenshots/Jenkins parameters.jpg" width="1000" height="700"/>  

🔴 Для формирования отчета о прохождении тестов в Allure Report необходимо нажать на ссылку/иконку **"Allure Report"**.  

<img src="image/screenshots/allure report1.jpg" width="1000" height="600"/>  

### <img src="image/logo/Selenoid.svg" width="40" height="40"/> Видео прохождения тестов в Selenoid  


<https://user-images.githubusercontent.com/93325839/148690769-79fc4059-f033-4f35-a7be-39214e0dc110.mp4>


### <img src="image/logo/Allure_Report.svg" width="30" height="30"/> Отчет о результатах тестирования в Allure Report

<details>
  <summary>Подробнее</summary>  

  
**1.** Страница «Overview».

<img src="image/screenshots/allure report2.jpg" width="800" height="400"/>  
  

    
  
**2.** Страница «Categories».  

Данная страница предоставляет информацию о распределении дефектов по их видам.

<img src="image/screenshots/allure report3.jpg" width="800" height="400"/>  

    
  
**3.** Страница «Suites».  

На данной странице представляется распределение выполнявшихся тестов по тестовым наборам или классам, в которых находятся тестовые методы.

<img src="image/screenshots/allure report4.jpg" width="800" height="400"/>  

    
  
**4.** Страница «Graphs».

На этой странице можно получить информацию о тестовом прогоне в графическом виде: статус прогона, распределение тестов по их критичности, длительности прохождения, перезапусках, категориях дефектах.  

<img src="image/screenshots/allure report5.jpg" width="800" height="400"/>  

    
  
**5.** Страница «Timeline».  

Данная страница визуализирует временные рамки прохождения каждого теста.  

<img src="image/screenshots/allure report6.jpg" width="800" height="400"/>  

</details>  

### <img src="image/logo/Allure_TestOps.svg" width="30" height="30"/> Интеграция тестов c тест-менеджмент системой [Allure TestOps](https://allure.autotests.cloud/project/862/dashboards)

<details>
  <summary>Подробнее</summary> 

  
📎 **Dashboards.**  

<img src="image/screenshots/testops_dashboards.jpg" width="800" height="400"/>  
  
  

📎 **Test cases.**  

<img src="image/screenshots/testops_testcases.jpg" width="800" height="400"/>  
  
  

📎 **Launches. Запуски тестов.**  

<img src="image/screenshots/launches.jpg" width="800" height="400"/>  
  
  

</details>  

### <img src="image/logo/Jira.svg" width="30" height="30"/> Интеграция тестов c таск-трекер системой [Jira](https://jira.autotests.cloud/browse/HOMEWORK-287)  

<img src="image/screenshots/jiratask.jpg" width="1000" height="500"/>  
 

### <img src="image/logo/Telegram.svg" width="30" height="30"/> Уведомления о прохождении тестов в Telegram  

<img src="image/screenshots/telegram_bot.jpg" width="500" height="500"/>  








