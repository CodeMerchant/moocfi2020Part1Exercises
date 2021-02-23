/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author musa
 */
import java.util.ArrayList;

public class Stack {
   private ArrayList<String> list;
   
   public Stack(){
       this.list = new ArrayList<>();
   }
   
   public boolean isEmpty(){
     return this.list.isEmpty();
   }
   
   public void add(String value){
       this.list.add(value);
   }
   
   public String take(){
      String removeLast = this.list.get(list.size()-1);
      this.list.remove(removeLast);
      return removeLast;
   }
   
   public ArrayList<String> values(){
       return this.list;
   }
}
