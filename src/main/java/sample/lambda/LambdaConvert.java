package sample.lambda;

public class LambdaConvert {

    public ConvertorInterface<String,Integer> convertMethod() {
        return (from) ->Integer.valueOf(from);
    }
}
