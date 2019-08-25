package com.javarush.task.task15.task1522;

public class Moon implements Planet{
    //#1. – Нужно добавить в класс приватное статическое поле, содержащее одиночный объект:
    private static Moon instance;

    //#2. – Сделать конструктор класса (конструктор по-умолчанию) приватным
    // (чтобы доступ к нему был закрыть за пределами класса, тогда он не сможет возвращать новые объекты)
    private Moon(){

    }

    //#3. – Объявить статический создающий метод, который будет использоваться для получения одиночки:
    public static Moon getInstance(){
        if(instance == null){		//если объект еще не создан
            instance = new Moon();	//создать новый объект
        }
        return instance;		// вернуть ранее созданный объект
    }
}
