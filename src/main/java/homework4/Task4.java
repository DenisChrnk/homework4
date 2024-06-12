package homework4;

public class Task4 {
    public static void main(String[] args) {

        String password = "qwerqwe0";

//        Вариант1

        if (password.length() >= 8) {
            if (password.contains("0") || password.contains("1") || password.contains("2") || password.contains("3") || password.contains("4") || password.contains("5") || password.contains("6") || password.contains("7") || password.contains("8") || password.contains("9")) {
                if (password.contains("!") || password.contains("@") || password.contains("#") || password.contains("$") || password.contains("%") || password.contains("^") || password.contains("&") || password.contains("*") || password.contains("№")) {
                    System.out.println("Пароль принят");
                } else {
                    System.out.println("Пароль должен содержать минимум 1 спецсимвол");
                }
            } else {
                System.out.println("Пароль должен содержать минимум 1 цифру");
            }
        } else {
            System.out.println("Пароль не менее 8 символов");
        }

//        Вариант2

//        boolean isError = false;
//
//        if (password.length() < 8) {
//            isError = true;
//            System.out.println("Пароль не менее 8 символов");
//        }
//        if (!password.contains("1") && !password.contains("2") && !password.contains("3") && !password.contains("4") && !password.contains("5") && !password.contains("6") && !password.contains("7") && !password.contains("8") && !password.contains("9")) {
//            isError = true;
//            System.out.println("Пароль должен содержать минимум 1 цифру");
//        }
//        if (!password.contains("!") && !password.contains("@") && !password.contains("#") && !password.contains("$") && !password.contains("%") && !password.contains("^") && !password.contains("&") && !password.contains("*") && !password.contains("№")) {
//            isError = true;
//            System.out.println("Пароль должен содержать минимум 1 спецсимвол");
//        }
//        if (isError == false) {
//            System.out.println("Пароль принят");
//        }
    }
}