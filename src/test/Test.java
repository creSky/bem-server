
import com.alibaba.excel.metadata.BaseRowModel;
import com.bem.bemEnum.BemEnum;
import com.bem.entity.BulkRefundEntity;
import com.bem.entity.VerificationEntity;
import com.bem.util.ExcelUtil;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) throws ParseException {
       /* List<VerificationEntity> list =new ArrayList<>();
        VerificationEntity verificationDomain1=new VerificationEntity();
        VerificationEntity verificationDomain2=new VerificationEntity();
        VerificationEntity verificationDomain3=new VerificationEntity();
        VerificationEntity verificationDomain4=new VerificationEntity();
        VerificationEntity verificationDomain5=new VerificationEntity();
        VerificationEntity verificationDomain6=new VerificationEntity();
        VerificationEntity verificationDomain7=new VerificationEntity();
        VerificationEntity verificationDomain8=new VerificationEntity();
        VerificationEntity verificationDomain9=new VerificationEntity();
        VerificationEntity verificationDomain10=new VerificationEntity();
        verificationDomain1.setAppId("1");
        verificationDomain2.setAppId("2");
        verificationDomain3.setAppId("3");
        verificationDomain4.setAppId("4");
        verificationDomain5.setAppId("5");
        verificationDomain6.setAppId("6");
        verificationDomain7.setAppId("7");
        verificationDomain8.setAppId("8");
        verificationDomain9.setAppId("9");
        verificationDomain10.setAppId("10");


        list.add(verificationDomain1);
        list.add(verificationDomain2);
        list.add(verificationDomain3);
        list.add(verificationDomain4);
        list.add(verificationDomain5);
        list.add(verificationDomain6);
        list.add(verificationDomain7);
        list.add(verificationDomain8);
        list.add(verificationDomain9);
        list.add(verificationDomain10);


        list.parallelStream().forEach(Test::mm);

        System.out.println(PropertiesUtil.ToPinyin("你好"));
        System.out.println(DateUtil.stampToTime("1563003055"));
        System.out.println(new Date(1563003055));*/


        //本地的日期时间
      /*
        Map<String, List<PriceDataTransformDomain>> collect =
                priceDataTransformDomains.stream().collect(Collectors.groupingBy(o -> o.getPriceTypeId() + "_" + o.getTimeSeg()));
        priceDataShowDomain.setElecType(v.stream().filter(p -> (p.getPriceTypeId() == priceTypeId || p.getPriceTypeId().equals(priceTypeId)))
                .map(PriceDataTransformDomain::getElecType).max(String::compareTo).get());*/

       /* LocalDateTime time = LocalDateTime.now();
        System.out.println("当前时间=" + time);*/

      /* Map<Integer,List<String>> map=new HashMap<>();*/
       /*List<String> a=new ArrayList<>();
       a.add("123");
       map.put("1",a);
        (unused)->new ArrayList<>() 等价于 lamda引用
        ArrayList<String>::new  方法引用
        */
 /*      map.computeIfAbsent(1,(unused)->new ArrayList<>()).add("123");
        System.out.println(map);*/

       /*List<String> list=new ArrayList<>();
       list.add("a");
       list.add("b");
       list.add("c");
       Map<String,String> maps=
       list.stream().map(t->t+"a").collect(Collectors.toMap(String::trim,String::trim));
        System.out.println(maps);*/
        /*List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
       IntStream.rangeClosed(0,list.size()).mapToObj(end->list.subList(0,end)).forEach(
               t-> System.out.println(t)
       );*/

        /*List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        of(list).forEach(t-> System.out.println(t));*/
        /*IntStream.range(0,3).forEach(t-> System.out.println(t+"a"));


        PayrollDay.Mon.pay(14,4);*/

        /*Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        String string = simpleDateFormat.format(date);
        System.out.println(string);*/
       /* Map<String, List<? extends BaseRowModel>> maps=
                ExcelUtil.readExcelByModel("C:\\Users\\ZJD-PC\\Desktop\\55服务器.xlsx",BulkRefundEntity.class);

        System.out.println(maps);*/

       List<BulkRefundEntity> bulkRefundEntities=new ArrayList<>();
        BulkRefundEntity bulkRefundEntity=new BulkRefundEntity();
        bulkRefundEntity.setRefundMoney(BigDecimal.valueOf(2));
        bulkRefundEntity.setSettlementNo("123");
        bulkRefundEntities.add(bulkRefundEntity);
       ExcelUtil.writeExcelByModel("F:\\solfware\\1.xlsx",
               "sheet1",bulkRefundEntities ,BulkRefundEntity.class);
    }


    public static  void mm(VerificationEntity s){
        System.out.println(s.getAppId());

    }


    public static <E>Stream<List<E>> of(List<E> list){
        return prefixes(list).flatMap(Test::suffixes);
    }
    public static <E>Stream<List<E>> prefixes(List<E> list){
        return IntStream.rangeClosed(1,list.size()).mapToObj(end->list.subList(0,end));
    }
    public static <E>Stream<List<E>> suffixes(List<E> list){

        return IntStream.range(0,list.size()).mapToObj(strat->list.subList(strat,list.size()));
    }
}
