

class EMP{
    int id;
    String name;
    EMP(int id, String name){
        this.id = id;
        this.name = name;
    }
    public String toString(){
        System.out.println(id);
        System.out.println(name);
        return "";
    }
}
    
    class Scientist extends EMP{
        int no_publication,experience;
        Scientist(int id, String name, int no_publication, int experience){
            super(id,name);
            this.no_publication = no_publication;
            this.experience = experience;
        }
        public String toString(){
            super.toString();
            System.out.println(no_publication);
            System.out.println(experience);
            return "In Sscientist class";
        }
    }

    class DScintist extends Scientist{
        int award;
        DScintist(int id, String name, int no_publication, int experience, int award){
            super(id,name,no_publication,experience);
            this.award = award;
        }
        public String toString(){
            
            System.out.println(award);
            return "In DScientist class";
        }
    }
public class qs4{
 public static void main(String[] args) {
    int id =12,no_of_publication=10,experience=5,award=2;
    String name = "Rahul";
    EMP e = new EMP(id,name);
    Scientist s = e.new Scientist(id,name,no_of_publication,experience);
    DScintist d = s.new DScintist(id,name,no_of_publication,experience,award);
    e.toString()
    s.toString();
    d.toString();
 }
}