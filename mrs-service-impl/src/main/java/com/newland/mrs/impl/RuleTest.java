package com.newland.mrs.impl;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.Message;
import org.kie.api.builder.Results;
import org.kie.api.builder.model.KieBaseModel;
import org.kie.api.builder.model.KieModuleModel;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.text.MessageFormat;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * RuleTest
 *
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-26 14:23
 **/
public class RuleTest {

    public static void main(String[] args) {

        String content = "package rules.scene_1234455;\n" +
                "import java.lang.String;\n" +
                "import java.util.List;\n" +
                "import com.newland.mrs.impl.MrsServiceApplication.User;\n" +
                "import com.newland.mrs.impl.entity.RuleCheckResult.Result;\n" +
                "import com.newland.mrs.impl.entity.RuleCheckResult;\n" +
                "rule \"hello,word\"\n" +
                "    salience 1\n" +
                "    when\n" +
                "        $u:User(name contains \"张三\")\n" +
                "        $result:RuleCheckResult()\n" +
                "    then\n" +
                "        Result result = new Result(true, \"命中\");\n" +
                "        $result.getResultMap().put(\"hello,word\", result);\n" +
                "        System.out.println(\"hello,word!\");\n" +
                "end";

        ConcurrentMap<String, KieContainer> kieContainerMap = new ConcurrentHashMap<>();

        long sceneId = 1234455;

        KieServices kieServices = KieServices.get();
        KieModuleModel kieModuleModel = kieServices.newKieModuleModel();
        KieBaseModel kieBaseModel = kieModuleModel.newKieBaseModel(buildKbaseName(sceneId));
        kieBaseModel.setDefault(true);
        kieBaseModel.addPackage(MessageFormat.format("rules.scene_{0}", String.valueOf(sceneId)));
        kieBaseModel.newKieSessionModel(buildKsessionName(sceneId));
        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
        String fullPath = MessageFormat.format("src/main/resources/rules/scene_{0}/rule_{1}.drl", String.valueOf(sceneId), String.valueOf(1));
        kieFileSystem.write(fullPath, content);
        kieFileSystem.writeKModuleXML(kieModuleModel.toXML());

        KieBuilder kieBuilder = kieServices.newKieBuilder(kieFileSystem).buildAll();
        Results results = kieBuilder.getResults();
        if (results.hasMessages(Message.Level.ERROR)) {
            System.out.println(results.getMessages());
            throw new IllegalStateException("rule error");
        }

        KieContainer kieContainer = kieServices.newKieContainer(kieServices.getRepository().getDefaultReleaseId());
        kieContainerMap.put(buildKcontainerName(sceneId), kieContainer);
        System.out.println(kieContainerMap.size());

        KieSession kieSession = kieContainer.getKieBase().newKieSession();
        User user = new User(9, "张三");
//        RuleCheckResult result = new RuleCheckResult();
//        kieSession.insert(user);
//        kieSession.insert(result);
//        int a = kieSession.fireAllRules();
//        System.out.println(a);
//        System.out.println(result.getResultMap().size());
    }

    public static class User {

        private int age;

        private String name;

        private String result;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }
    }

    /**
     * 构造kcontainerName
     *
     * @param sceneId 场景ID
     * @return kcontainerName
     */
    private static String buildKcontainerName(long sceneId) {
        return "kcontainer_" + sceneId;
    }

    /**
     * 构造kbaseName
     *
     * @param sceneId 场景ID
     * @return kbaseName
     */
    private static String buildKbaseName(long sceneId) {
        return "kbase_" + sceneId;
    }

    /**
     * 构造ksessionName
     *
     * @param sceneId 场景ID
     * @return ksessionName
     */
    private static String buildKsessionName(long sceneId) {
        return "ksession_" + sceneId;
    }
}
