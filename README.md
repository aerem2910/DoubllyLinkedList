# DoubllyLinkedList

Программа реализует двусвязный список (Doubly Linked List) с использованием дженериков в Java. Двусвязный список - это структура данных, в которой каждый элемент содержит данные и две ссылки (указателя): на предыдущий и следующий элемент.

Основные методы программы:

GbDoublyLinkedList (реализация интерфейса GbList):

add: Добавляет элемент в конец списка.
get: Получает элемент по индексу.
remove: Удаляет элемент по индексу.
update: Обновляет элемент по индексу.
size: Возвращает размер списка.
isEmpty: Проверяет, пуст ли список.
toString: Переопределенный метод для визуализации списка в виде строки.
GbDoublyMain (класс для тестирования):

Создаются экземпляры GbDoublyLinkedList с различными типами данных (String, Integer).
Выполняются различные операции (добавление, удаление, обновление, получение размера) и выводятся результаты на экран.


В первом тесте проверяется метод isEmpty после создания пустого списка.
Во втором тесте демонстрируется добавление элементов в список и их вывод.
В третьем тесте удаляется элемент, обновляется элемент, выводится размер списка, проверяется пустой ли он.
В четвертом тесте создается новый список с элементами и удаляется первый элемент.
Таким образом, программа предоставляет базовую реализацию двусвязного списка с методами для управления и тестирования.
