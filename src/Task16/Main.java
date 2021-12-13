package Task16;

public class Main
{
    public static void main(String[] args)
    {
        OrderManager k = new OrderManager();
        Dish[] d1 = new Dish[]
                {
                        new Dish(299, "Макароны по-флотски", "Описание"),
                        new Dish(249, "Каша гречневая", "Описание"),
                        new Dish(99, "Картофель отварной", "Описание"),
                        new Dish(149, "Глазунья", "Описание"),
                };

        RestaurantOrder od1 = new RestaurantOrder(d1);
        k.add(od1,1);
        k.add("1 Стол",od1);
        String[] result = k.getOrders(1).dishesNames();

        for (String it: result)
            if (it != null)
                System.out.println(it);

        System.out.println(k.ordersCostSummary());
        System.out.println("\n=======\nHashMap\n");
        String[] result2 = k.getOrders("1 Стол").dishesNames();

        for (String it: result2)
            if (it != null)
                System.out.println(it);

        System.out.println(k.ordersCostSummary());
        System.out.println("\n=======\nНапитки\n");

        Drink[] d2 = new Drink[]
                {
                        new Drink(89, "Кофе", "Описание"),
                        new Drink(49, "Чай", "Описание"),
                        new Drink(79, "Сок", "Описание"),
                        new Drink(49, "Молоко", "Описание"),
                };

        InternetOrder od2 = new InternetOrder(d2);
        String[] result3 = od2.dishesNames();

        for (String it: result3)
            if (it != null)
                System.out.println(it);

        System.out.println(od2.costTotal());
    }
}