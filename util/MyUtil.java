@Component //把普通pojo实例化到spring容器中 0
public class MyUtil {
    // 这里是需要注入的Service ①
    @Autowired
    private MyService myService;
    private static MyUtil myUtil;

    //初始化 ②
    @PostConstruct
    public void init() {
        myUtil = this;
        myUtil.myService = this.myService;
    }

    //调用 ③
    public static void insertParam(int id) {
        // 调用方法 ④
        myUtil.myService.testInsert("xxx");
    }
}