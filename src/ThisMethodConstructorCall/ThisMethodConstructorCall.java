
package ThisMethodConstructorCall;

public class ThisMethodConstructorCall {
   
    int id;
    String name;
    String city;
    
    ThisMethodConstructorCall(int id, String name){
    
        this.id = id;
        this.name = name;
    }
    
    ThisMethodConstructorCall(int id, String name, String city){
    
        this(id,name);//now no need to initialize id and name
        this.city = city;
    }
    void display(){
        System.out.println(id + " " + name + " " + city);
    }
    public static void main(String[] args) {
        ThisMethodConstructorCall s1 = new ThisMethodConstructorCall(1, "Wan Sornolota IT");
        ThisMethodConstructorCall s2 = new ThisMethodConstructorCall(2, "Wan FYP is", "Final Year Project");
        
        s1.display();
        s2.display();
    }
}
