package sample.lambda;


public class LambdaGenericImpl {

    public GenericInterface<String> reverseString() {
        return (str) -> {
            String result ="";
            for(int i = str.length() -1 ;i >=0; i--) {
                result += str.charAt(i);
            }
          return result;
        };
    }

    public GenericInterface<Integer> factorialInteger(){
        return (n)-> {
            int result =1;
            for(int i =1;i<=n;i++){
                result *= i;
            }
            return result;
        };
    }

    public GenericInterface<Integer> len() {
        return (str) -> str.toString().length();
    }


}
