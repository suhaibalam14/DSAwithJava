package Queue;

public class QueueEmptyException extends  Exception{
    public QueueEmptyException(String msg){
        super((msg));
    }
}
