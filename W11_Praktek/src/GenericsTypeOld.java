public class GenericsTypeOld { 
    private Object t; 
    
    public Object get() { 
        return t; 
    } 

    public void set(Object t) { 
        this.t = t; 
    } 
    
    public static void main(String args[]){ 
        GenericsTypeOld type = new GenericsTypeOld(); 
        type.set("Java"); 
        String str = (String) type.get();

        System.out.println(str);
        System.out.println(str.getClass().getSimpleName());
    //type casting, error prone and can cause ClassCastException 
    } 
} 