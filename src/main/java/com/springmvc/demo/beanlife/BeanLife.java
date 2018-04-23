package com.springmvc.demo.beanlife;

import com.springmvc.demo.model.BaseEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * TODO next steps
 * 1、第一步：最简单pojo  最小单元 属性 （最少干扰项）
 * 2、第二步：bean依赖注入的实现
 * 3、第三步：在之前的基础上货站分之，（不同的处理scope/ bean的生命周期（init，destroy等））
 *
 *  正确的方式，避免陷入循环：
 *  重点概念：
 *
 * <p></p>
 * Created by admin on 2017/9/19.
 */
public class BeanLife extends BaseEntity implements InitializingBean, DisposableBean {
    private static final Logger logger = LoggerFactory.getLogger(BeanLife.class);


    private static void showMyself(){
        logger.info("=====调用静态方法=====类初始化");
    }


    static {
        logger.info("=====调用静态代码块，执行一些事情， 盘古开天地之后，在花果山山顶有一灵石.......");
    }

    private String sex;
    private String profession;
    private String girlFriend;


    public BeanLife() {
        logger.info("======调用User的无参构造函数,天降石猴啦=====");
    }

    public void myInit() {
        logger.info(this.toString());
        this.girlFriend = "徐若瑄";
        this.setId(10001);
        logger.info("通过调用配置文件初始化石猴编号为：" + this.getId() + "的女朋友为：" + this.girlFriend);
    }

    public void myDestroy() {
        logger.info("-----调用myDestroy()，时候被压在五指山下-----");
    }


    /**
     * Invoked by a BeanFactory on destruction of a singleton.
     *
     * @throws Exception in case of shutdown errors.
     *                   Exceptions will get logged but not rethrown to allow
     *                   other beans to release their resources too.
     */
    @Override
    public void destroy() throws Exception {
        logger.info("---------调用DisposableBean.destory()，销毁bean。----");
    }

    /**
     * Invoked by a BeanFactory after it has set all bean properties supplied
     * (and satisfied BeanFactoryAware and ApplicationContextAware).
     * <p>This method allows the bean instance to perform initialization only
     * possible when all bean properties have been set and to throw an
     * exception in the event of misconfiguration.
     *
     * @throws Exception in the event of misconfiguration (such
     *                   as failure to set an essential property) or if initialization fails.
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        this.profession = "歌手";
        this.sex = "公猴";
        logger.info("调用InitializingBean.afterPropertiesSet(),属性配置完毕了再做些善后工作。");
    }


    public String getSex() {
        return sex;
    }

    public void setSex(final String sex) {
        this.sex = sex;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(final String profession) {
        this.profession = profession;
    }

    public String getGirlFriend() {
        return girlFriend;
    }

    public void setGirlFriend(final String girlFriend) {
        this.girlFriend = girlFriend;
    }

    @Override
    public String toString() {
        return "BeanLife{" +
               "id='" + this.getId() + '\'' +
               ", sex='" + sex + '\'' +
               ", profession='" + profession + '\'' +
               ", girlFriend='" + girlFriend + '\'' +
               '}';
    }
}
