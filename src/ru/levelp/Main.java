package ru.levelp;

/**
 * Created by Student-15 on 24.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        //Переменные и методы именуются с маленькой буквы
        //каждое слово в имени - с большой
        // int numberOfStudents;
        //Классы с большой буквы, а далее аналогично переменным
        //

        int intVar; // объявление переменной
        intVar = 5; // инициализация (первое заполнение переменной)
        intVar = 64; // присваивание

        double dVar = 3.14; // по-умолчанию все дробные числа double
        // float - дробный, но короче( меньше знаков после запятой)
        float fVar = 3.14f;

        dVar = 4; // неявное приведения типов из int в double на выходе: 4.0


        //  Примитивные типы данных
        boolean bVar = true;     //
        //
        char cVar = 'A';         //
        //
        String strVar = "Hello"; //
        //
        byte byteVar = 23;       //
        //
        short shortVar = 11;     //
        //
        long lVar = 2411531;     //

        int amount = 57435;
        int thousand = amount / 1000;
        int rub = amount % 1000;
        System.out.println(thousand + " тысяч " + rub + " рублей"); //System.out.println(thousand + " тысяч "+ rub + " рублей") на выходе тип String
        // в переменных типо String должен быть минимум 1 значение типа String

        String result;
        result = "" + 5 + 3; // конкатинация
        result = 5 + 3 + ""; // арифметика
        //Это происходит из-за того, что  в Java выражения читаются слева направо
        System.out.println(result);
        // 5/3 = 1 - int
        // 5/3.0 = 1.(6) - double

        // int a = 4;
        // int b =3;
        // double x;
        // x = -b/ (double) a; //явное присвоение типа; (double) работает только для данного выражения и заносит результат в х
        // System.out.println("x = " + x);

        boolean bool1 = true;
        boolean bool2 = false;
        // ==, !=, !
        boolean boolResult = (bool1 == bool2);
        // boolean boolResult = (bool1 != bool2); и boolean boolResult = !(bool1 == bool2); одно и то же
        // логическое И / умножение / конъюнкция


        boolResult = bool1 && bool2;// true если справа и слева true

        // логическое ИЛИ / сложение / дизъюнкция
        //если слева от || true то все будет true

        boolResult = bool1 || bool2;// true если справа или слева true

        /* < > >= <= */

        //==, != - применяются как к числам, так и к boolean
        //< > <= >= - применяются только к типу boolean
        //!,&&,|| - только  к boolean

        /*
        if (логическое_выражение){
            //выполняется код, если условие == true
        }else{ //необязательный
            //выполнится, если не выполнится код в if
        }
        */

        /*Задача:
        * имеются 3 целочисленных переменных a,b,c
        * которые равны произвольным цислам
        * необходимо, чтобы программа вывела минимальное число
         *  */

        int a = 6;
        int b = 6;
        int c = 30;
        int min;
//        if (a <= b && a <= c) {
//            System.out.println("Минимальное число а = " + a);
//        } else if (b <= a && b <= c) {
//            System.out.println("Минимальное число b = " + b);
//        } else {
//            System.out.println("Минимальное число c = " + c);
//        }
        min = a;
        if(min > b){
            min=b;
        }
        if(min>c){
            min=c;
        }
        System.out.println("min = " + min);

       // оптимально, т.к. легко модернизировать для большего кол-ва переменных

        //сравнение дробных чисел
        double x = 3.14;
        double y = 2.72;

        if(x < y){ //так делать нельзя!
        }
         double hundred = 100.0/3 + 100.0/3 + 100.0/3 +100.0/3 + 100.0/3 + 100.0/3;
        System.out.println(hundred);
        // погрешность изза невозможности записать бесконечное число

        double eps=0.000001;//точность
        if (Math.abs(hundred - 200.0) < eps){//алгоритм вычисления с заданной точностью eps, Math.abs помогает избежать отрицательного зн-я

            System.out.println("Считаем, что равны");
        }
    }

    /*ДЗ
    1) программа решения квадратных уравнений
        ах^2 + bx + c = 0
        коэффициенты вводятся пользователем
        нобходимо найти корни уравнения
        *комплексные корни
    2) есть 3 целых числа
        заполняются с клавиатуры
        необходимо вывести эти числа по возрастанию

        Пример:
            7
            3
            5
        Результат:
            3
            5
            7
       Можно:
            переменные
            лог.оп
            if-else

       НЕЛЬЗЯ:
       пользоваться массивами (только переменные)
       библиотеки для сортировки
       Integer.MAX_VALUE /MIN_VALUE
     */
}
