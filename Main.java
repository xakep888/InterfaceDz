public class Main {
    public static void main(String[] args){

        Potok potok = new Potok();
        potok.AddGroup(new StudentGroup("Группа1"));
        potok.AddGroup(new StudentGroup("Группа2"));
        potok.AddGroup(new StudentGroup("Группа3"));
        potok.AddGroup(new StudentGroup("Группа4"));


        int count = 0;
        for(StudentGroup group:potok) {
            count++;
            System.out.println(group.name());

        }
        System.out.println("Количество групп в Поток1: " + count);
        potok.setCount(count);
        System.out.println();

        Potok potok2 = new Potok();
        potok2.AddGroup(new StudentGroup("Группа5"));
        potok2.AddGroup(new StudentGroup("Группа6"));
        potok2.AddGroup(new StudentGroup("Группа7"));
        int count2 = 0;


        for(StudentGroup group:potok2){
            count2++;
            System.out.println(group.name());
        }
        potok2.setCount(count2);
        System.out.println("Количество групп в Поток2: " + count2);

        StreamComparator comparator = new StreamComparator();
        int result = comparator.compare(potok, potok2);

        if(result < 0){
            System.out.println("Поток 1 содержит меньше групп чем Поток2");
        }else if(result>0){
            System.out.println("Поток 1 содержит больше групп чем Поток2");
        }else{
            System.out.println("Потоки содержат одинаковое количество групп");
        }



    }
}
