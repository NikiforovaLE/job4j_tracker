# Контрольные вопросы - ООП

1. [Что такое ООП?](#Что-такое-ООП?)
[2 Базовые концепции ООП?](#2-Базовые-концепции-ООП?)
[3 Укажите из каких элементов состоит класс.](#3-Укажите-из-каких-элементов-состоит-класс.)
[4 Что такое конструктор?](#4-Что-такое-конструктор?)
[5 Можно ли наследовать конструктор?](#5-Можно-ли-наследовать-конструктор?)
[6 Что такое перегрузка конструктора?](#6-Что-такое-перегрузка-конструктора?)
[7 Что такое статический метод?](#7-Что-такое-статический-метод?)
[8 Что такое не статический метод?](#8-Что-такое-не-статический-метод?)
[9 Для чего используется ключевое слово this?](#9-Для-чего-используется-ключевое-слово-this?)
[10 Какой класс является базовым родительным классом для всех классов?](#10-Какой-класс-является-базовым-родительным-классом-для-всех-классов?)
[11 Что такое наследование? Приведите примеры из реальной жизни.](#11-Что-такое-наследование?-Приведите-примеры-из-реальной-жизни.)
[12 Опишите процесс создания нового объекта.](#12-Опишите-процесс-создания-нового-объекта.)
[13 Как вызвать метод из родительского класса?](#13-Как-вызвать-метод-из-родительского-класса?)
[14 Что такое переопределение метода?](#14-Что-такое-переопределение-метода?)
[15 Можно ли переопределить статический метод?](#15-Можно-ли-переопределить-статический-метод?)
[16 Что такое виртуальная функция и используются ли они в Java?](#16-Что-такое-виртуальная-функция-и-используются-ли-они-в-Java?)
[17 Что такое перегрузка метода?](#17-Что-такое-перегрузка-метода?)
[18 Можно ли изменить тип возвращаемых данных при перегрузке метода?](#18-Можно-ли-изменить-тип-возвращаемых-данных-при-перегрузке-метода?)
[19 Что такое множественное наследование? Как его можно реализовать в Java.](#19-Что-такое-множественное-наследование?-Как-его-можно-реализовать-в-Java.)
[20 Что такое полиморфизм? Приведите примеры из реальной жизни.](#20-Что-такое-полиморфизм?-Приведите-примеры-из-реальной-жизни.)
[21 Что такое инкапсуляция?](#21-Что-такое-инкапсуляция?)
[22 Как реализована инкапсуляция в Java?](#22-Как-реализована-инкапсуляция-в-Java?)
[23 Можно ли применить модификаторы доступа к конструкторам?](#23-Можно-ли-применить-модификаторы-доступа-к-конструкторам?)
[24 Что такое интерфейс?](#24-Что-такое-интерфейс?)
[25 Какие типы исключительных ситуаций бывают?](#25-Какие-типы-исключительных-ситуаций-бывают?)
[26 Назовите основные методы класса Object?](#26-Назовите-основные-методы-класса-Object?)
[27 Что такое шаблоны проектирования?](#27-Что-такое-шаблоны-проектирования?)
[28 Объясните шаблон декоратор.](#28-Объясните-шаблон-декоратор.)

2. [Объясните шаблон стратегия](#Объясните-шаблон-стратегия)

## Что такое ООП?

ООП объектно-ориентированное программирование - это методика программирования, которая помогает организовывать сложные программы, применяя принципы наследования, инкапсуляции и полиморфизма.
Такой подход предполагает разработку приложений с помощью классов и объектов. 
Таким образом, программа представляется в виде совокупности объектов, каждый из которых является экземпляром определенного класса. В свою очередь объект внутри использует структурное программирование.

## 2 Базовые концепции ООП?

+ **`Абстракция`** - выделение значимой информации и исключение из рассмотрения незначимой.
С точки зрения программирования, это правильное разделение программы на объекты.

+ **`Инкапсуляция`** - механизм, связывающий код и данные, которыми он манипулирует, защищая оба компонента от внешнего вмешательства и злоупотреблений.
Проще говоря, инкапсуляция в Java - это "сокрытие реализации". Основу инкапсуляции в Java составляет класс, назначение которого состоит в инкапсуляции сложной структуры программы, поэтому существуют механизмы сокрытия сложной структуры реализации в самом классе.
Каждый метод или переменная в классе могут быть помечены как открытые или закрытые.
*Открытый* интерфейс класса представляет всё, что должны или могут знать внешние пользователи класса.
*Закрытые* методы и данные могут быть доступны только для кода, который является членом данного класса, а значит, любой другой код, не являющийся членом данного класса, не может получать доступ к закрытому методу или переменной.
Закрытые члены класса доступны другим частям программы только через открытые методы класса, и благодаря этому исключается возможность выполнения неправомерных действий.

+ **`Наследование`** - процесс, в результате которого один объект получает свойства другого. 
Наследование обеспечивает принцип иерархической классификации.
Наследуемый (родительский) класс - ***суперкласс***.
Наследующий (дочерний) класс - ***подкласс***.
Подкласс - это специализированная версия суперкласса. Он наследует все члены, определённые в суперклассе, добавляя к ним собственные, особые элементы.

Для каждого создаваемого подкласса можно указать **только 1 суперкласс**. В Java не поддерживается наследование нескольких суперклассов в одном подклассе. Можно создать иерархию наследования, где один подкласс становится суперклассом другого подкласса.

Чтобы наследовать класс, достаточно ввести определение одного класса в другом, используя ключевое слово ***extends***.

+ **`Полиморфизм`** - это принцип ООП, которые позволяет использовать один и тот же интерфейс для общего класса действий. 

Способы реализации полиморфизма:
- перегрузка методов;
- переопределение методов

## 3 Укажите из каких элементов состоит класс.

Класс состоит из *полей* и *методов*.

Данные, или переменные, определённые в классе, называются *переменными экземпляра*.
Вместе с переменными экземпляра методы, определённые в классе, называются *членами класса*.

## 4 Что такое конструктор?

**Конструктор** - это специальный метод, который вызывается при создании нового объекта. Таким образом, операция `new` вызывает конструктор класса.

Конструктор автоматически инициализирует внутреннее состояние объекта непосредственно во время его создания. Конструктор вызывается при создании объекта перед окончанием выполнения операции *new*.  
Имя конструктора совпадает с именем класса (с соблюдением регистра), при этом синтаксически конструктор похож на метод без возвращаемого значения.
Конструктор нужен для того, чтобы код, создающий экземпляр, с самого начала содержал полностью инициализированный, пригодный к употреблению объект.

Если конструктор не определён явно, то в Java для класса создаётся *конструктор по умолчанию* (неявный), который инициализирует все переменные экземпляра устанавливаемыми по умолчанию значениями.
Как только в классе будет определён конструктор, конструктор по умолчанию *больше не используется*.
Конструктор с параметрами (явный) - **параметризованный конструктор**.

## 5 Можно ли наследовать конструктор?

Нет. 
В Java подкласс наследует все члены (поля, методы, вложенные классы) из суперкласса, но конструкторы не являются членами, поэтому они не наследуются, однако конструктор суперкласса может быть вызван из подкласса.

## 6 Что такое перегрузка конструктора?

Перегрузка конструкторов означает определение в одном и том же классе нескольких конструкторов, которые отличаются типом и/или количеством параметров. 
Если два конструктора принимают по одному значению типа int, то класс не скомпилируется. Имеет значение типы параметров и порядок их следования. То есть могут быть два конструктора с параметрами идентичных типов, но эти параметры должны размещаться 

## 7 Что такое статический метод?

Статический метод привязан к классу, а не к объекту. Такие методы вызываются независимо от любого объекта этого класса.

Ограничения статических методов:
+ они могут непосредственно вызывать только другие статические методы
+ им непосредственно доступны только статические переменные
+ они не могут делать ссылки типа *this* или *super*

## 8 Что такое не статический метод?

Не статический метод - это метод, для работы которого необходим объект. Не статический метод принадлежит объекту класса и может быть вызван с помощью ссылки на данный объект.
Вызов такого метода осуществляется через операцию-точку.

## 9 Для чего используется ключевое слово this?

Ключевое слово this служит ссылкой на объект, для которого был вызван метод. 
Когда имя локальной переменной совпадает с именем переменной экземпляра, локальная переменная *скрывает* переменную экземпляра. Ключевое слово this позволяет ссылаться непосредственно на объект.

## 10 Какой класс является базовым родительным классом для всех классов?

Класс Objeсt служит суперклассом для всех остальных классов. Ссылочная переменная из класса Objeсt может ссылаться на объект любого другого класса.

## 11 Что такое наследование? Приведите примеры из реальной жизни.

**Наследование**` - процесс, в результате которого один объект получает свойства другого, а именно: когда один объект перенимает все публичные поля и методы другого объекта.
Наследование обеспечивает принцип иерархической классификации.

Животные -> Млекопитающие -> Собачьи -> Домашние -> Охотничьи -> Ретривер
Автомобили -> Легковые -> Внедорожники -> Ford

## 12 Опишите процесс создания нового объекта.

Создание объекта происходит в два этапа:
1. Сначала следует объявить переменную типа класса. Она не определяет объект, а является переменной, которая может *ссылаться* на объект. 
2. Затем нужно получить конкретную физическую копию объекта и присвоить её этой переменной. Это делается с помощью операции new. Эта операция динамически, то есть во время выполнения, резервирует память для объекта и возвращает ссылку на него. Эта ссылка представляет собой адрес объекта в памяти, зарезервированной операцией new. Затем эта ссылка сохраняется в переменной.

В общем виде создание объекта выглядит следующим образом:
тип_класса переменная_класса = new имя_класса();

## 13 Как вызвать метод из родительского класса?

Если метод суперкласса переопределён в подклассе и требуется получить доступ к варианту переопределенного метода из суперкласса, необходимо использовать ключевое слово *super*.
Когда переопределенный метод вызывается из своего подкласса, он всегда ссылается на свой вариант, определенный в подклассе, а вариант метода, определенный в суперклассе, будет скрыт. 

## 14 Что такое переопределение метода?

Переопределение метода - это создание иного варианта метода суперкласса в подклассе.
Переопределение методов выполняется только в том случае, если имена и сигнатуры типов обоих методов одинаковы. Тогда говорят, что метод из подкласса переопределяет метод из суперкласса.

## 15 Можно ли переопределить статический метод?

Статический метод **нельзя** переопределить: он принадлежит классу и не наследуется, но в то же время его можно перегрузить.
Метод, обозначенный ключевым словом static, принадлежит не объекту класса, а именно классу, и он загружается при загрузке самого класса.

## 16 Что такое виртуальная функция и используются ли они в Java?

Виртуальные функции используются в языках С++ или С#. Переопределенные методы в Java подобны виртуальным функциям в этих языках.

## 17 Что такое перегрузка метода?

Перегрузка методов - это процесс определения в одном и том же классе двух или более методов под одним именем, но с разным объявлением их параметров. В этом случае методы называют *перегружаемыми*.
Перегружаемые методы должны отличаться по типу и/или количеству их параметров. Возвращаемые типы перегружаемых методов могут отличаться, но самого возвращаемого типа явно недостаточно, чтобы отличить два разных варианта метода.
Когда в исполняющей среде Java встречается вызов перегружаемого метода, в ней просто выполняется тот его вариант, параметры которого соответствуют аргументам, указанным в вызове.

## 18 Можно ли изменить тип возвращаемых данных при перегрузке метода?

Да, можно, но самого возвращаемого типа явно недостаточно, иначе JVM не поймет, какой метод ей нужно вызвать. Поэтому необходимо, чтобы отличались тип и/или количество параметров метода.

## 19 Что такое множественное наследование? Как его можно реализовать в Java.

Множественное наследование - это наследование класса от нескольких суперклассов одновременно. В Java не поддерживается множественное наследование.
Можно создать иерархию наследования, где один подкласс становится суперклассом другого подкласса.
Кроме того, в Java множественное наследование можно в какой-то, хотя и ограниченной, степени реализовать с помощью интерфейсов.

## 20 Что такое полиморфизм? Приведите примеры из реальной жизни.

+ **Полиморфизм** - это принцип ООП, которые позволяет использовать один и тот же интерфейс для общего класса действий.
Полиморфизм также описывают выражением: "Один интерфейс - множество реализаций"

Способы реализации полиморфизма:
- перегрузка методов;
- переопределение методов

Примеры: собачье обоняние. Когда собака почувствует запах кошки, она залает и погонится за ней, когда собака почувствует запах еды, она побежит к миске. В обоих случаях действует одно и то же чувство обоняния. Отличие лишь в том, что именно издает запах, т.е. в типе данных, воздействующих на нос собаки!

## 21 Что такое инкапсуляция?

**`Инкапсуляция`** - механизм, связывающий код и данные, которыми он манипулирует, защищая оба компонента от внешнего вмешательства и злоупотреблений.
Проще говоря, инкапсуляция в Java - это "сокрытие реализации". 

## 22 Как реализована инкапсуляция в Java?

Для реализации инкапсуляции в Java используются:
+ модификаторы доступа - специальные слова, которые определяют доступ к данным
+ специальные методы - геттеры и сеттеры

Например, переменные класса объявляются как private, а для изменения и просмотра значений переменных к методам установки и получения (сеттеру и геттеру) предоставляется модификатор доступа public.

## 23 Можно ли применить модификаторы доступа к конструкторам?

Да, можно.

## 24 Что такое интерфейс?

Интерфейс - это конструкция языка Java, в рамках которой принято описывать абстрактные публичные (abstract public) методы и статические константы (final static). С помощью интерфейса можно указать, что именно должен выполнять класс его реализующий, но не как это делать. Способ реализации выбирает сам класс. Интерфейсы не способны сохранять данные состояния.
Интерфейсы задают описание, как должен работать объект. Интерфейсы не содержат реализации, но в версии JDK 8 появилась возможность определять реализацию по умолчанию метода, объявленного в интерфейсе. Если конкретная реализация такого метода отсутствует, то используется его реализация по умолчанию в интерфейсе.

+ поля - константы `public static final`;
+ абстрактные методы - задают то, как должен работать наш объект, но не определяют как конкретно;
+ статические методы - можем добавлять с Java 8 как обычные `static` методы.

У интерфейсов нет конструкторов.

## 25 Какие типы исключительных ситуаций бывают?

Throwable - базовый класс для всех нестандартных ситуаций при работе вашего приложения.

Error - ошибки связанные с работой виртуальной машины. Такие как: выход за границы памяти, использование одинаковых библиотек с разными версиями.

Exception - ошибки, которые связаны с работой самой программы. Их можно разделить на два типа: проверяемые (checked) и непроверяемые (unchecked) исключения (RuntimeException). Про них мы говорили в предыдущих заданиях.

## 26 Назовите основные методы класса Object?

*Object clone()* - создаёт новый объект, не отличающийся от клонируемого
*boolean equals(Object object)* - определяет, равен ли один объект другому
*Class<?> getClass()* - получает класс объекта во время выполнения
*int hashCode()* - возвращает хеш-код, связанный с вызывающим объектом
*void notify()* - возобновляет исполнение потока, ожидающего вызывающего объекта
*void notifyAll()* - возобновляет исполнение всех потоков, ожидающих вызывающий объект
*String toString()* - возвращает символьную строку, описывающую объект
*void wait()* - ожидает другого потока исполнения

## 27 Что такое шаблоны проектирования?

Шаблон проектирование означает схему решения часто возникающей задачи проектирования.

## 28 Объясните шаблон декоратор.

Паттерн Декоратор динамически наделяет объект новыми возможностями и является альтернативой субклассированию в области расширения функциональности.

## Объясните шаблон стратегия

Этот шаблон относится к поведенческим шаблонам. Паттерн «Стратегия» определяет семейство алгоритмов, инкапсулирует каждый из них и обеспечивает их взаимозаменяемость. Он позволяет модифицировать алгоритмы независимо от их использования на стороне клиента 