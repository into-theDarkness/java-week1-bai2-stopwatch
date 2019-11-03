import java.util.Date;
public class StopWatch {
    private Date startTime;
    private Date endTime;
    public Date getStartTime(){
        return  this.startTime;
    }
    public Date getEndTime(){
        return this.endTime;
    }
    public StopWatch(){
        this.startTime = new Date();
    }
    public void start(){
        this.startTime = new Date();
    }
    public void stop(){
        this.endTime = new Date();
    }
    public long getElapsedTime(){
        Date endtime = this.getEndTime();
        Date starttime = this.getStartTime();
        return endtime.getTime() - starttime.getTime();
    }

    public static void main(String[] args) {
        int arr[] = new int [100000];
        for(int i =0; i < arr.length; i++){
            arr[i] = (int) (Math.random()*100000);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1;j<arr.length;j++){
                if (arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());

    }

}
