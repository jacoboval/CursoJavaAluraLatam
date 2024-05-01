//public class Divisa{
//    String baseCode;
//    double conversion_rates;
//
//}
import java.util.HashMap;
import java.util.Map;
public record Divisa(String base_code,
                     String target_code,
                     double conversion_rate,
                     double conversion_result){

}

//public record Divisa(String base_code,
//                     Map<String,Double>conversion_rates,
//                     String target_code,
//                     double conversion_rate,
//                     double conversion_result){
//
//}