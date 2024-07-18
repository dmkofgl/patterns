# OOP
## Инкапсуляция
сокрытие внутренних данных компонента и деталей его реализации от других компонентов приложения и предоставление набора методов для взаимодействия с ним
1. Она способствует переиспользованию компонентов: поскольку в этом случае компоненты взаимодействуют друг с другом только посредством их API и безразличны к изменениям внутренней структуры, они могут использоваться в более широком контексте.

2. Инкапсуляция ускоряет процесс разработки: слабо связанные друг с другом компоненты (то есть компоненты, чей код как можно меньше обращается или использует код других компонентов) могут разрабатываться, тестироваться и дополняться независимо.

3. Правильно инкапсулированные компоненты более легки для понимания и процесса отладки, что упрощает поддержку приложения.

В языке Java инкапсуляция реализована с помощью системы классов, которые позволяют собрать информацию об объекте в одном месте; пакетов, которые группируют классы по какому-либо критерию, и модификаторов доступа, которыми можно пометить весь класс или его поле или метод.

1. public – полный доступ к сущности (полю или методу класса) из любого пакета;
2. protected – доступ к сущности только для классов своего пакета и наследников класса;
3. неявный модификатор по умолчанию (при отсутствии трёх явных) – доступ к сущности только для классов своего пакета;
4. private – доступ только внутри класса, в котором объявлена сущность.
# Наследование 
 Оно позволяет создавать иерархические структуры объектов. Используя наследование, можно создать общий класс, который будет определять характеристики и поведение, свойственные какому-то набору связанных объектов. В дальнейшем этот класс может быть унаследован другими, более частными классами, каждый из которых будет добавлять уникальные, свойственные только ему характеристики и дополнять или изменять поведение базового класса.
 Наследование реализует отношение «является» (“is-a”) между суперклассом и подклассом. 

## Полиморфизм
один из принципов ООП, позволяющий вызовом переопределённого метода через переменную класса-родителя получить поведение, которое будет соответствовать реальному классу-потомку, на который ссылается эта переменная.

## абстракция
фокусировка разработчика на конкретных свойствах объекта зависит от тех задач, которые призван решать объект. Следствием такого подхода является то, что, если в императивных языках разработчику необходимо думать в терминах компьютерной логики, в объектно-ориентированных языках разработчик думает в терминах проблемной области, в которой он разрабатывает приложения.

# Паттерны

## Порождающие 
паттерны беспокоятся о гибком создании объектов без внесения в программу лишних зависимостей.
Построение обьектов
## Структурные 
паттерны показывают различные способы построения связей между объектами.
Построение иерархий обьектов
## Поведенческие 
паттерны заботятся об эффективной коммуникации между объектами.
Построение взаимодействий обьектов ( имплементации методов)