package Base;

public class order {
    private final String code;

    public order(String code){
        this.code = code;
    }

    @Override
    public String toString(){
        return "order={"+
                "code='" + code + "'" + "}"
            ;
    }

}
