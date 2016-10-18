import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2016/10/18.
 */
public class InstantiateAndObjectList {
    private static List<Human> humanList = new ArrayList<>();
    public static Human instantiate(String name,String sex){
        Human human = new Human(sex);
        human.setName(name);
        human.setAge(18);
        humanList.add(human);
        return human;
    }
    public static String showList(){
        StringBuilder builder = new StringBuilder();
        for (Human human:humanList){
            builder.append(human.introduce()+'\n');
        }
        String result = builder.toString();
        return result;
    }
}
