package String;

public class OnlyDigit {
    public static void main(String[] args) {
        String str = "12345";
        boolean isflag = true;
        for(int i=0;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i))){
                isflag = false;
                break;
            }
        }
        if(isflag){
            System.out.println("It is Digit");
        }else{
            System.out.println("it is not digit");
        }
    }
}

//Time: O(n) space : O(1)
