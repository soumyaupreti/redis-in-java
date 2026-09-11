package Components;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired; 
@Component
public class TcpServer {
    @Autowired
    private RespSerializer respSerializer;
    public void startServer(){
        respSerializer.printWorking();
    }


    }
