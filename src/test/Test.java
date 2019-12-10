
import com.alibaba.fastjson.JSONObject;
import com.bem.domain.AppCustomerInfo;
import com.bem.domain.AppUserInfo;
import com.bem.domain.VerificationDomain;
import com.bem.util.DateUtil;
import com.bem.util.PropertiesUtil;

import java.io.File;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) throws ParseException {
       /* List<VerificationDomain> list =new ArrayList<>();
        VerificationDomain verificationDomain1=new VerificationDomain();
        VerificationDomain verificationDomain2=new VerificationDomain();
        VerificationDomain verificationDomain3=new VerificationDomain();
        VerificationDomain verificationDomain4=new VerificationDomain();
        VerificationDomain verificationDomain5=new VerificationDomain();
        VerificationDomain verificationDomain6=new VerificationDomain();
        VerificationDomain verificationDomain7=new VerificationDomain();
        VerificationDomain verificationDomain8=new VerificationDomain();
        VerificationDomain verificationDomain9=new VerificationDomain();
        VerificationDomain verificationDomain10=new VerificationDomain();
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

        LocalDateTime time = LocalDateTime.now();
        System.out.println("当前时间=" + time);

    }


    public static  void mm(VerificationDomain s){
        System.out.println(s.getAppId());

    }


}
