package Hw14;

public class Email {
/*Create a method createEmail(). Based on values of users firstName, lastName and email type, your method should
 return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
 */

    String createEmail(String firstName, String lastNAme, String emailType) {
      String completeEmail=firstName+lastNAme+emailType;

      return completeEmail;
    }
    public static void main(String[] args) {
        Email obj=new Email();
        String firstName="john";
        String lastName="snow";
        String emailType="@gmail.com";
        String result= (String) obj.createEmail(firstName,lastName,emailType);
        System.out.println(result);
    }




}




