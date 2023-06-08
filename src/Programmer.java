//Задача 6
//Напишите класс Programmer.
//
//Переменные:
//
//name (имя, строка);
//company (имя компании, строка);
//position (позиция, строка);
//конструктор, принимающий name и company;
//метод getPosition(), возвращающий строку — позицию программиста.
//метод work(), поднимающий позицию программиста на уровень вверх (с самого начала (при инициализации)
//программист — intern (стажер), потом junior (джуниор), далее middle, senior, lead).
public class Programmer {
    String name;
    String names;
    String company;
    String position;
    public Programmer (String name, String company) {
        this.name = name;
        this.company = company;
        this.position = "intern";
    }


    public String getPosition () {
        return position;
    }
    public String work () {
        if (position == "intern") {
            position = "junior";
        }else if (position == "junior") {
            position = "middle";
        }else if (position == "middle") {
            position = "senior";
        }else if (position == "senior") {
            position = "lead";
        }
        return position;
    }
}
