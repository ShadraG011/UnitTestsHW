1) Почему использование тестовых заглушек может быть полезным при написании модульных тестов?

   **Ответ:** Использование тестовых заглушек может быть полезно тем, что при написании модульных тестов, мы можем
   изолировать зависимости, повысить производительность тестов, упростить эти тесты, также мы можем тестировать
   различные сценарии, улучшая согласованность и уменьшая зависимость от сторонних ресурсов.


2) Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными
   аргументами?

   **Ответ:** Для проверки того, что нужный нам метод был вызван с нужными аргументами мы можем использовать mock
   заглушки из фреймворка Mockito, используя методов verify: 
   * *verify(yourMock).yourMethod(argument1, argument2);*


3) Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение
   в ответ на вызов метода?

   **Ответ:** Для проверки того, что нужный нам метод был вызван с нужными аргументами и вернет нам нужно значение или
   исключение мы можем использовать mock заглушки из фреймворка Mockito, используя метод when:
    * *when(yourMock.yourMethod(argument1, argument2)).thenReturn(returnedArgument);*
    * *when(yourMock.yourMethod(argument1, argument2)).thenThrow(returnedException);*


4) Какой тип тестовой заглушки вы бы использовали для имитации взаимодействия с внешним API или базой данных?

   **Ответ:** Для имитации взаимодействия с внешним API или Базой данных мы можем использовать mock заглушку, создав
   Mock Объект нужного нам сервиса или класса:
   *YourService yourService = mock(YourService.class);*
   
