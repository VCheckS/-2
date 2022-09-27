public class main {
//Один из сотовых операторов решил сделать своим клиентам приятный бонус: если клиент пополняет счёт более чем на 1000 рублей,
// то сотовый оператор дарит ему по 1 рублю за каждые полные 100 рублей пополнения.
// Примеры. Начальные данные: у клиента на счёте 100 рублей.
// Клиент пополнил счёт на 100 рублей - бонусов нет, итоговая сумма на счету клиента - 200 рублей
// Клиент пополнил счёт на 1100 рублей - бонус равен 11 рублям, итоговая сумма на счету клиента - 1211 рублей
// Ваша задача
// Создать приложение, выводящее итоговый счёт и количество бонусных рублей. Количество денег на текущем счёте клиента
// и сумму пополнения вы выбираете сами (сами создайте переменные, в которых эти данные будут храниться).
// Приложение должно быть написано так,
// чтобы при замене значений переменных (начальной суммы счёта и суммы пополнения), итоговый счёт и бонусные рубли расчитывались правильно.
// Пример схемы кода вашего приложения:
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        int balance = 10;
        int add = 2200;
        int bonus;


        if (add >= 1000) {
             bonus = add / 100;
        }
        else  {
            bonus = 0;
        }
        int total = balance + add + bonus;

        System.out.println("Вам зачислено бонусов: " + bonus);
        System.out.println("Итого ваш баланс: " + total);
    }
}

