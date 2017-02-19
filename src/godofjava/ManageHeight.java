package godofjava;

public class ManageHeight {

//int [][] gradeHeights = new int[5][] ;
int [][] gradeHeights ;
 
public static void main(String [] args) {

    ManageHeight manageHeight = new ManageHeight() ;
    manageHeight.setData() ;

    int twoDimLength = manageHeight.gradeHeights.length ;
    
    for(int len=0;len < twoDimLength;len++) {
        System.out.println("Class No.: "+(len+1));
        manageHeight.printHeight(len);
    }
    
    int loop3 = 0 ;

    while (loop3<twoDimLength) {
        System.out.println("Class No.: "+(loop3+1));
        manageHeight.printAverage(loop3) ;
        loop3++ ;
    }

//    int twoDimLength=gradeHeights.length ;
    
//    System.out.println(manageHeight.gradeHeights[0][0]);

}

public void setData() {

gradeHeights = new int[5][] ;

gradeHeights[0] = new int[5] ;
gradeHeights[1] = new int[4] ;
gradeHeights[2] = new int[4] ;
gradeHeights[3] = new int[3] ;
gradeHeights[4] = new int[5] ;

    gradeHeights[0][0] = 170 ;
    gradeHeights[0][1] = 180 ;
    gradeHeights[1][0] = 160 ;
    gradeHeights[1][1] = 165 ;    

}

public void printHeight(int classNo) {
    for(int length:gradeHeights[classNo]) {
        System.out.println(length) ;
    }
}

public void printAverage(int classNo) {
    double tot = 0;
    double avg = 0;
    for(int length:gradeHeights[classNo]) {
        tot += length ;
    }
    avg = tot / gradeHeights[classNo].length ;
    System.out.println(avg) ;
}

}

