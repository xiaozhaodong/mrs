package com.newland.mrs.impl.handler; 

import com.alibaba.fastjson.JSONObject;
import com.newland.mrs.api.entity.ApplyRouteRequest;
import com.newland.mrs.api.entity.MrsRequestInfo;
import com.newland.mrs.api.entity.MrsResponseInfo;
import com.newland.mrs.api.enums.MrsApiEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.UUID;

/** 
* MrsApiService Tester. 
* 
* @author <Authors name> 
* @since <pre>1月 31, 2021</pre> 
* @version 1.0 
*/
//@RunWith(SpringRunner.class)
//@SpringBootTest
public class MrsApiServiceTest { 

    @Autowired
    private MrsApiService mrsApiService;

    @Before
    public void before() throws Exception { 
    } 

    @After
    public void after() throws Exception { 
    } 

    /** 
    * 
    * Method: invoke(MrsRequestInfo mrsRequestInfo) 
    * 
    */ 
    @Test
    public void testInvoke() throws Exception { 
        //TODO: Test goes here...
        MrsRequestInfo mrsRequestInfo = new MrsRequestInfo();
        mrsRequestInfo.setApiInvokerCode("trs");
        mrsRequestInfo.setApiName(MrsApiEnum.applyRoute.getCode());
        mrsRequestInfo.setSignType("MD5");
        mrsRequestInfo.setSignature("fdsafasfadf");
        mrsRequestInfo.setRuleNo("1355000010353283072");
        ApplyRouteRequest applyRouteRequest = new ApplyRouteRequest();
        applyRouteRequest.setRouteNo(UUID.randomUUID().toString().replaceAll("-", ""));
        applyRouteRequest.setApplyNo(UUID.randomUUID().toString().replaceAll("-", ""));
        applyRouteRequest.setCustomName("以绝望挥剑");
        applyRouteRequest.setCustomPhone("15021080755");
        applyRouteRequest.setCustomIdNo("110101199003074776");
        applyRouteRequest.setCustomBalance("1000000");
        applyRouteRequest.setBankCardNo("6225881231227896");
        applyRouteRequest.setCustomLimit("2");
        applyRouteRequest.setApplyAmount("100000");
        applyRouteRequest.setApplyRate("0.087");
        applyRouteRequest.setApplyAge("25");
        applyRouteRequest.setLimitStartDate("2020-12-25");
        applyRouteRequest.setLimitEndDate("2021-12-25");
        applyRouteRequest.setApplyProductTerm("12");
        applyRouteRequest.setApplyRepayType("DEBX");
        applyRouteRequest.setMicroCreditSign("Y");
        applyRouteRequest.setLineSign("OFFLINE");
        applyRouteRequest.setDivisionCode("sdadadsadsad");
        applyRouteRequest.setDivisionName("上海事业部");
        applyRouteRequest.setTeamCode("sdadadsadsad122222");
        applyRouteRequest.setTeamName("etl团队");
        applyRouteRequest.setPersonalOrEnterprise("PERSONAL");
        applyRouteRequest.setApplyCrowd("A");
        applyRouteRequest.setIdCardAddress("上海是大法师的多福多寿");
        applyRouteRequest.setHomeAddress("上海是大法师的多福多寿");
        applyRouteRequest.setBusinessAddress("上海是大法师的多福多寿");
        applyRouteRequest.setManageAddress("上海是大法师的多福多寿");
        applyRouteRequest.setCompanyAddress("上海是大法师的多福多寿");
        applyRouteRequest.setMicroOrConsume("MICRO");
        applyRouteRequest.setHaveFileType("ABC");
        mrsRequestInfo.setRequestData(applyRouteRequest);
        System.out.println(JSONObject.toJSONString(mrsRequestInfo));
        MrsResponseInfo mrsResponseInfo = mrsApiService.invoke(mrsRequestInfo);
        Assert.assertEquals("0000", mrsResponseInfo.getResponseCode());
    }

    public static void main(String[] args) {
        MrsRequestInfo mrsRequestInfo = new MrsRequestInfo();
        mrsRequestInfo.setApiInvokerCode("trs");
        mrsRequestInfo.setApiName(MrsApiEnum.applyRoute.getCode());
        mrsRequestInfo.setSignType("MD5");
        mrsRequestInfo.setSignature("fdsafasfadf");
        mrsRequestInfo.setRuleNo("1355000010353283072");
        ApplyRouteRequest applyRouteRequest = new ApplyRouteRequest();
        applyRouteRequest.setRouteNo(UUID.randomUUID().toString().replaceAll("-", ""));
        applyRouteRequest.setApplyNo(UUID.randomUUID().toString().replaceAll("-", ""));
        applyRouteRequest.setCustomName("以绝望挥剑");
        applyRouteRequest.setCustomPhone("15021080755");
        applyRouteRequest.setCustomIdNo("110101199003074776");
        applyRouteRequest.setBankCardNo("6225881231227896");
        applyRouteRequest.setCustomBalance("1000000");
        applyRouteRequest.setCustomLimit("2");
        applyRouteRequest.setCreditAmount("21000000");
        applyRouteRequest.setApplyAmount("100000");
        applyRouteRequest.setApplyRate("0.087");
        applyRouteRequest.setApplyAge("25");
        applyRouteRequest.setLimitStartDate("2020-12-25");
        applyRouteRequest.setLimitEndDate("2021-12-25");
        applyRouteRequest.setApplyProductType("12312312");
        applyRouteRequest.setApplyProductTerm("12");
        applyRouteRequest.setApplyRepayType("DEBX");
        applyRouteRequest.setMicroCreditSign("Y");
        applyRouteRequest.setLineSign("OFFLINE");
        applyRouteRequest.setDivisionCode("sdadadsadsad");
        applyRouteRequest.setDivisionName("上海事业部");
        applyRouteRequest.setTeamCode("0000");
        applyRouteRequest.setTeamName("etl团队");
        applyRouteRequest.setPersonalOrEnterprise("PERSONAL");
        applyRouteRequest.setApplyCrowd("A");
        applyRouteRequest.setIdCardAddress("上海是大法师的多福多寿");
        applyRouteRequest.setHomeAddress("上海是大法师的多福多寿");
        applyRouteRequest.setBusinessAddress("上海是大法师的多福多寿");
        applyRouteRequest.setManageAddress("上海是大法师的多福多寿");
        applyRouteRequest.setCompanyName("上海是大法师的多福多寿");
        applyRouteRequest.setCompanyAddress("上海是大法师的多福多寿");
        applyRouteRequest.setMicroOrConsume("MICRO");
        applyRouteRequest.setHaveFileType("ABC");
        mrsRequestInfo.setRequestData(applyRouteRequest);
        System.out.println(JSONObject.toJSONString(mrsRequestInfo));
    }
} 
