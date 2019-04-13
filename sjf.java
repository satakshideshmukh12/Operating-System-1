import java.util.*;

public class SJF {
    public static void main(String[] args) {
        SJF_Instructions obj1= new SJF_Instructions();
        Scanner scan=new Scanner (System.in);
        for(int i=0;i<3;i++){
            obj1.process[i]=i+1;
            System.out.println("Enter the Arrival Time of process "+i+1+" :");
            obj1.arrTime[i]=scan.nextInt();
            System.out.println("Enter the Burst time of process "+i+1+" :");
            obj1.burTime[i]=scan.nextInt();

    }
        int temp;
        for(int i=0;i<3;i++){
            for(int j=0;j<3-(i+1);j++){
                if( obj1.arrTime[j]>obj1.arrTime[j+1]){
                 temp=obj1.arrTime[j];
                 obj1.arrTime[j]=obj1.arrTime[j+1];
                 obj1.arrTime[j+1]=temp;
                 temp=obj1.burTime[j];
                 obj1.burTime[j]=obj1.burTime[j+1];
                 obj1.burTime[j+1]=temp;
                 temp=obj1.process[j];
                 obj1.process[j]=obj1.process[j+1];
                 obj1.process[j+1]=temp;
                }
            }
        }/*if(obj1.process[0])
        for(int k=0;k<3;k++){
            if(obj1.process[k]==){
                obj1.cTime[k]=obj1.arrTime[k]+obj1.burTime[k];
            }
            else if(obj1.arrTime[k]<=obj1.cTime[k-1]){
                obj1.cTime[k]=obj1.cTime[k-1]+obj1.burTime[k];
            }
        }*/
        for(int j=0;j<3;j++){
            System.out.println("Completion time of process "+j+1+": "+obj1.cTime[j]);
        }
    }

    }

class SJF_Instructions{
    int process[]=new int[3];
    int arrTime[]=new int[3];
    int burTime[]=new int[3];
    int cTime[]=new int[3];
    int turnAT[]=new int[3];
    int wTime[]=new int[3];
    int flag[]=new int[3];
}