package problems.strings;

public class CountDaysTogether {

	public static void main(String[] args) {
		String arriveAlice = "08-15"; String leaveAlice = "11-18"; String arriveBob = "08-16"; String leaveBob = "11-19";
		System.out.println(countDaysTogether(arriveAlice,leaveAlice,arriveBob,leaveBob));
	}

	public static int countDaysTogether(String aliceArive, String aliveLeave, String bobArrive, String bobLeave) {
        String from = "";
        // choose the one who comes later
        if(aliceArive.compareTo(bobArrive) <= 0) {
            from = bobArrive;
        }else{
            from = aliceArive;
        }
       String to = "";
       // choose the one who leaves first
       if(aliveLeave.compareTo(bobLeave) <= 0) {
            to = aliveLeave;
        }else{
            to = bobLeave;
        }
       
       int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
       int arriveMonth = Integer.parseInt(from.substring(0,2));   // aM = arriveMonth
       int arriveDate = Integer.parseInt(from.substring(3));    // aD = arriveDate
       int leaveMonth = Integer.parseInt(to.substring(0,2));    //lM = leaveMonth
       int leaveDate = Integer.parseInt(to.substring(3));      //lD = leaveDate
       
       
       if(leaveMonth < arriveMonth) 
    	   return 0;                                  
       else if(arriveMonth == leaveMonth && arriveDate>leaveDate) 
    	   return 0;        
       else if(arriveMonth == leaveMonth && arriveDate<=leaveDate) {
           return leaveDate-arriveDate+1;
       } else {
          int k = leaveMonth-arriveMonth-1;
           int cntDays = 0;
           int temp = arriveMonth;
           while(k-->0) {
               cntDays+=days[temp++];
           }
           int arriveMonthDays = days[arriveMonth-1]-arriveDate;
           int leaveMonthDays = leaveDate+1;
           return cntDays+arriveMonthDays+leaveMonthDays;
       }
   }

}
