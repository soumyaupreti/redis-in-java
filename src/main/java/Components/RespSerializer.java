package Components;
import org.springframework.stereotype.Component;
@Component
public class RespSerializer{
    public void RespSerializer(){
        System.out.println("----------------------------------------------------------");

    }
    public String returnsString(){
        return "hi";        
    }
    public List<String[]> deserialize(byte[] command){
        String data = new String(command, StandardCharsets.UTF_8);
        char[] dataArr = data.toCharArray();
        List<String[]> res = new ArrayList<>();
        return res;

    }  
    }
}