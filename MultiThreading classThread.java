public class multithreading1 extends Thread {
    public void run(){
        int count=0;
        for(int i=0;i<5;i++){
            System.out.println(i);
            System.out.println(Thread.currentThread().getName());

        }

    }
    
        public static void main(String[] args) {
            multithreading1 obj=new multithreading1();
           // obj.setName("h1");
            obj.run();
            obj.start();
         }
        }


