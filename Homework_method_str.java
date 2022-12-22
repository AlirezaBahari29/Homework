public class Homework_method_str {
    public static void main(String[] args) {
        System.out.println("******************************************");
        String email="alirezabahari@gmail.com";
        String number="823648258973";
        int trueEmail = email.indexOf(" ") , trueNumber_Length =number.length();
        boolean trueEmail2=trueEmail<0,trueNumber_Length2=trueNumber_Length==11;
        String namePerson=email.substring(0,email.indexOf("@"));
        String userName=(namePerson.concat(number)).toUpperCase();
        String password = email.replace("@gmail.com","@bahari.persian");
        String account = email.substring(email.indexOf("@"),email.indexOf("."));
        String sentence = String.format("Hello %s .Welcome to my app.Your email is %b and you are using %s and your number is %b.Your username is %s and your password is %s . ",namePerson,trueEmail2,account,trueNumber_Length2,userName,password);
        System.out.println(sentence);
        System.out.println("if your email or number id false please fix it.Wish my app will be useful for you :)");

    }
}
