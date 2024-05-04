import java.util.Comparator;
public class StreamComparator implements Comparator<Potok>{
    public int compare(Potok potok, Potok potok2){
        int sizepotok = potok.getCount(); // Троит
        int sizepotok2 = potok2.getCount(); //троит


        return Integer.compare(sizepotok,sizepotok2);


    }
}
