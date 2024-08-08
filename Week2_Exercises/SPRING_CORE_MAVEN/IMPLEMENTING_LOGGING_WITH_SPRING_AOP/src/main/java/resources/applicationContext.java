<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
                           http://www.springframework.org/schema/beans/spring-beans.xsd
                           http://www.springframework.org/schema/context
                           http://www.springframework.org/schema/context/spring-context.xsd">

    <context:component-scan base-package="com.library"/>
    <aop:aspectj-autoproxy/>

    <!-- Define the BookRepository bean -->
    <bean id="bookRepository" class="com.library.BookRepository"/>

    <!-- Define the BookService bean and inject the BookRepository bean -->
    <bean id="bookService" class="com.library.BookService">
        <property name="bookRepository" ref="bookRepository"/>
    </bean>

</beans>
