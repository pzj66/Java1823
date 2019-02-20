------------------------------------------
AOP术语

连接点Joinpoint
    类中的所有方法

切入点Pointcut
    类中的具体的方法

目标对象Target

代理对象Proxy

增强 Advice
    在原功能基础上，增加的代码

织入
    把增强应用到目标对象，产生代理对象的过程

切面
    切入点&增强的结合

------------------------------------------
定义带有切点的切面
<bean id="bdao" class="com.j1823.spring.demo02.BDao"/>
<bean id="badvice" class="com.j1823.spring.demo02.BAdvice"/>
<!-- 定义带切点的切面 -->
<bean id="badvisor" class="org.springframework.aop.support.RegexpMethodPointcutAdvisor">
    <property name="advice" ref="badvice"/>
    <property name="pattern" value="com\.j1823\.spring\.demo02\.BDao\.add*"/>
</bean>
<bean id="proxyBDao" class="org.springframework.aop.framework.ProxyFactoryBean">
    <property name="target" ref="bdao"/>
    <property name="proxyTargetClass" value="true"/>
    <property name="interceptorNames" value="badvisor"/>
</bean>
------------------------------------------
自动代理 BeanNameAutoProxyCreator

<bean id="bdao" class="com.j1823.spring.demo02.BDao"/>
<bean id="badvice" class="com.j1823.spring.demo02.BAdvice"/>
<bean class="org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator">
    <property name="beanNames" value="bdao"/>
    <property name="interceptorNames" value="badvice"/>
</bean>


自动代理 DefaultAdvisorAutoProxyCreator

<bean id="bdao" class="com.j1823.spring.demo02.BDao"/>
<bean id="badvice" class="com.j1823.spring.demo02.BAdvice"/>
<bean id="badvisor" class="org.springframework.aop.support.RegexpMethodPointcutAdvisor">
    <property name="advice" ref="badvice"/>
    <property name="pattern" value="com\.j1823\.spring\.demo02\.BDao\.add*"/>
</bean>
<bean class="org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator"/>

------------------------------------------
ProxyFactoryBean & AutoProxy 区别？
ProxyFactoryBean 先有被代理对象，将被代理对象传入到代理类中生成代理
AutoProxy 基于后处理Bean.在Bean的生成过程中，就产生了代理对象，把代理对象返回.生成Bean已经是代理对象


------------------------------------------
AspectJ

    1、导入jar包（spring-aspects-3.2.0.RELEASE & com.springsource.org.aspectj.tools-1.6.6.RELEASE）
    2、编写实体类（操作实体）
    3、编写切面类，在类的头部添加 @Aspect 表示这个类是一个切面类
        对内部方法 增加 增强 注解
            @Before 前置增强
            @AfterReturning 后置增强
            @Around 环绕增强
    4、需要在xml配置文件中
        <aop:aspectj-autoproxy/> 配置自动代理


------------------------------------------
@Before  =  MethodBeforeAdvice


C:\Users\ASUS\Desktop\Spring_Day05_1823









