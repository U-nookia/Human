/**
 * Created by lenovo on 2016/10/12.
 */
public class Test {
    public static void main(String[] args) {
        Human LingXiao = InstantiateAndObjectList.instantiate("凌霄","男");
        Human ZengMingYang = InstantiateAndObjectList.instantiate("曾名扬","男");
        Human WuSui = InstantiateAndObjectList.instantiate("吴随","男");
        Human XuShuZhan = InstantiateAndObjectList.instantiate("徐书展","男");
        Human ZhengYuXuan = InstantiateAndObjectList.instantiate("郑昱旋","男");
        Human CaoYue = InstantiateAndObjectList.instantiate("曹越","男");
        System.out.println(InstantiateAndObjectList.showList());
    }
}
