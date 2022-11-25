public class Hilos  extends Thread{
    int id;

    public Hilos(int id) {
        this.id = id;
    }
    @Override
    public void run(){
        Hilos h2= new Hilos(2);
        Hilos h3= new Hilos(3);

        boolean check= true;
            while(check){
                switch (id){

                    case 1:
                        System.out.println("Este es el hilo : "+id);
                        pares();
                        h2.start();
                        break;
                    case 2:
                        System.out.println("Este es el hilo : "+id);
                        impares();
                        h3.start();
                        break;
                    case 3:
                        System.out.println("Este es el hilo : "+id);
                        dosTres();
                        break;

                }
                check=false;

            }
    }
    public static void pares(){
        for(int i = 0 ; i<=100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    public static void impares(){
        for (int i = 0 ;i<=100;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }

    }
    public static void dosTres(){
        int i=0;
       while(i<92){
            if(i==0){
                i=i+2;
                System.out.println(i+" "+(i+1));
            }else{
                i=i+10;
                System.out.println(i+" "+(i+1));
            }
        }
    }
}
