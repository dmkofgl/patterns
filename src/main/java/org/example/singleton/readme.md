# Одиночка

это порождающий паттерн проектирования, который гарантирует, что у класса есть только один экземпляр, и предоставляет к нему глобальную
точку доступа.

## Применимость

- Когда в программе должен быть единственный экземпляр какого-то класса, доступный всем клиентам (например, общий доступ к базе данных из
  разных частей программы).
- Когда вам хочется иметь больше контроля над глобальными переменными.