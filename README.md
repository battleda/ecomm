# ecomm
Wanna-be SFA

# Запуск сервиса
Выполнить команду в командной строке, выполнение скачает проект и запишет его в отдельную папку [ecomm]

git clone https://github.com/battleda/ecomm.git

Перейти в папку [ecomm] и выполнить команду для сборки проекта

gradle build

Запустить сервис командой 

gradle bootRun

После запуска проекта перейти по адресу

http://localhost:8081/api/test/item

http://localhost:8081/api/test/order

Доступ к БД из браузера:

http://localhost:8081/h2-console/

В открывшейся странице внести в поле JDBC URL: jdbc:h2:mem:testdb


