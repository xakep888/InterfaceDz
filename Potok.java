import java.util.*;
public class Potok implements Iterable<StudentGroup>{
    private int count;
    private List<StudentGroup> numbergroup;

    public int setCount(int count) {
        this.count = count;
        return count;
    }

    public int getCount() {
        return count;
    }

    public Potok(){
       numbergroup = new ArrayList<>();
   }

   public void AddGroup(StudentGroup group){
       numbergroup.add(group);

   }

   @Override
    public Iterator<StudentGroup> iterator(){
       return numbergroup.iterator();
   }



}
