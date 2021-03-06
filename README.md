Тестирование сайта https://www.facebook.com/ . 

Для запуска тестов необходимо установить:
- Apache Maven (https://maven.apache.org/download.cgi)
- ChromeDriver (https://sites.google.com/a/chromium.org/chromedriver/downloads)

Общие процедуры:
- I. Авторизация и аутентификация:
  1) Установить курсор в поле "Эл. адрес или телефон". 
  2) Ввести данные в поле "Эл. адрес или телефон". 
  3) Установить курсор в поле "Пароль". 
  4) Ввести данные в поле "Пароль". 
  5) Нажать на кнопку "Вход". 
  
- II.Завершение сессии (логаут):
  1) Вызвать выпадающее меню управления профилем. 
  2) Выбрать пункт "Выйти". 
  3) Нажать на кнопку "Выйти". 
  
Тестовые сценарии:

I.   ID fb.01

Название:            Проверка аутентификации.

Цель:                Проверка механизма аутентификации с верными параметрами пары логин/пароль.

Начальные условия:   Открыта стартовая страница https://www.facebook.com/. Аутентификация и авторизация не были произведены ни под какой парой логин/пароль.

Сценарий:            1. Установить курсор в поле "Эл. адрес или телефон". 
                          2. Ввести верные данные в поле "Эл. адрес или телефон".
                          3. Установить курсор в поле "Пароль". 
                          4. Ввести данные в поле "Пароль", соответствующие введенному логину.
                          5. Нажать на кнопку "Вход". 

Прохождение:         Аутентификация и авторизация произведены. Отображается профиль, соответствующий введенной паре логин/пароль.



II.  ID fb.02
 
 Название:            Проверка работы функции поиска.
 
 Цель:                Проверка функционирования поиска и соответствия выданных  результатов согласно поисковому запросу.
 
 Начальные условия:   Произведены успешные аутентификая и авторизация пользователя на сайте https://www.facebook.com/.
 
 Сценарий:            1. Установить курсор в поле "Ищите друзей". 
                          2. Ввести поисковое значение "Иван". 
                          3. Нажать на кнопку поиска (лупа). 
  
  Прохождение:         Произведен поиск, отображается форма с результатами поиска, результаты поиска соответствуют введенному поисковому значению.



III. ID fb.03
    
   Название:            Проверка перехода в профиль возможного друга.
  
  Цель:                Проверка механизма перехода в чужой профиль.
  
  Начальные условия:   Произведены успешные аутентификая и авторизация пользователя на сайте https://www.facebook.com/.
  
  Сценарий:            1. В таббе нажать на кнопку "Найти друзей". 
                          2. Перейти по ссылке превью одной из анкет. 
  
  Прохождение:         Произведен переход в профиль отличный от провиля авторизованного пользователя. Доступный для просмотра профиль соответствует заявленному в превью.



IV.  ID fb.04
    
  Название:            Проверка логаута.
  
  Цель:                Проверка возможности завершения текущей сессии пользователя.
  
  Начальные условия:   Произведены успешные аутентификая и авторизация пользователя на сайте https://www.facebook.com/.
  
  Сценарий:            1. Вызвать выпадающее меню управления профилем. 
                          2. Выбрать пункт "Выйти". 
                          3. Нажать на кнопку "Выйти". 
  
  Прохождение:         Осуществлено завершение текущей сессии, отображается стартовая форма аутентификации/регистрации.
   
