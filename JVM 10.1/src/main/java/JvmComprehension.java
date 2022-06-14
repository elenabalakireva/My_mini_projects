public class JvmComprehension { // в Metaspace загружается класс JvmComprehension.class

    public static void main(String[] args) {  // метод main() загрузился в Stack Memory
        int i = 1;                      // переменная int i = 1 загрузилась в Stack Memory
        Object o = new Object();        // В куче создался объект типа Object, а в стеке создалась ссылка о на этот объект
        Integer ii = 2;                 // В куче создался объект типа Integer со значением 2, а в стеке создалась ссылка ii на этот объект
        printAll(o, i, ii);             // В Stack Memory вызвался метод printAll с ссылками на объекты о, ii и переменной i
        System.out.println("finished"); // В Stack Memory создается новый фрейм, куда передалась ссылся на объект String со значением finished.
                                               //в куче создался объект типа String со значением finished
    }

    private static void printAll(Object o, int i, Integer ii) { // В Stack Memory создается новый фрейм printAll
        Integer uselessVar = 700;                   // В куче создался объект типа Integer, а в стеке создалась ссылка uselessVar на этот объект
        System.out.println(o.toString() + i + ii);  // В Stack Memory создался новый фрейм, куда передалась ссылся на объект,
        // внутри этого фрейма создался еще один фрейм toString(), куда передали ссылку на o. А так же во внешний фрейм передаем ссылки на i и ii
    }
}
// По завершении работы программы, Stack очищается.
// Сборщик мусора может начать работать в любой момент. Вся программа приостонавливается и начинается сборка мусора.
// Удаляются все недостижимые объекты в хипе, не имеющие связи с другими объектами. В данном случае удалился бы объект uselessVar