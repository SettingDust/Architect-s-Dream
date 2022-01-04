package sleepwalker.architectsdream.exseption;

public class InitException extends RuntimeException {

    public InitException(String msg){
        super(msg);
    }

    public InitException(String main, Object... args){
        super(String.format(main, args));
    }
}
