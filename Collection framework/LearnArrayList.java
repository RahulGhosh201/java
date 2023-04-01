import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;


public class LearnArrayList{

    /**
     * @param args
     */
    public static void main(String[] args){
        // String[]  studentsName=new String[30];
        // studentsName[0]="Rahul";
        // studentsName[29]="Samrat";
        // studentsName[30]="Shaspa";//it's the 31st element so it will show index out of bound exceptiion



        ArrayList<String> studentsName = new ArrayList<>();//as we can see there is no size declared so we can add as manty element as we want
        studentsName.add("Rahul");
        System.out.println(studentsName);

        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        // System.out.println(list);
        list.add(4);
        // System.out.println(list);
        list.add(1,50);
        // System.out.println(list);
        List<Integer> newList= new ArrayList<>();
        newList.add(150);
        newList.add(200);
        
        list.addAll(newList);//it adds the element of newList at the end of list
        // System.out.println(list);
        // System.out.println(list.get(2));
        list.remove(3);
        // System.out.println(list);
        list.remove(Integer.valueOf(50));
        // System.out.println(list);
        list.set(4,56);
        // System.out.println(list);
        // System.out.println(list.contains(1));
        // list.clear();
        // System.out.println(list);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+" ");
        }

        for(Integer element: list){
            System.out.println(element);
        }

        // Iterator<Integer> it=list.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }


    } 
}