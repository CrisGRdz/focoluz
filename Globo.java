
package globo;


public class Globo {
    private int radio = 0;
    boolean inflable = true;
   
    
    
    public Globo(){
    radio = 0;
    inflable = true;
    
    }
    public Globo(int r){
        radio = r;
        inflable = true;
    }
    public void inflar(int r){
        if(inflable) radio=r;
        
    }
    public void ponchar(){
        radio = 0;
        inflable = false;
        
    }
    public int tamaño(){
        return radio;
    }
    public int medir(){
        return radio;
    }
   
    public static void main(String[] args) {
        Globo a,rojo,azul;
        a = new Globo();
        rojo= new Globo();
        azul = new Globo(5);
        a.inflar(10);
        a.ponchar();
        System.out.println("radio del globo a: "+a.medir()+ "\nglobo rojo: "+rojo.medir()+"\nGlobo azul:"+azul.medir());
       
    }
    
}
