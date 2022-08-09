# sql_api2
 基于之前的sql_qpi（mybatis），学习简单的mybatis-plus和lombok。
 只搞懂简单流程，不涉及一些高级功能。

## thinking
   1. 对于实体类entity中的User类，加上lombok的注解@Data，只需写好跟数据库对应的属性，免去重复的get和set等工作，可以编译后查看target/classes/com.../entity/User查看编译好的类，已经加上了get和set等函数了
   2. 同时对于实体类entity中的User类，使用@TableName指定对应的数据库表名，不然默认对应数据库表名为user.
   3. 对于User类中的属性，使用@TableId指定表的主键名，不然默认主键名为id.
   4. mybatis plus与mybatis的区别在于，mapper类写一个空接口，继承mybatis plus提供的内置BaseMapper就行。不需要写函数名和xml的sql实现，这个UserMapper接口就已经拥有了sql操作的内置函数了。

## reference
   1. [【尚硅谷】2022版MyBatisPlus教程（一套玩转mybatis-plus）](https://www.bilibili.com/video/BV12R4y157Be?p=9&vd_source=7f470a794558fd74d5bdeba354eb1f32)
   2. [MyBatis-Plus官网](https://www.mybatis-plus.com/guide/quick-start.html)
   3. [@TableName](https://blog.csdn.net/qq_43265564/article/details/117650867)
   4. [接口加参数](https://blog.csdn.net/weixin_43453386/article/details/83419060)
   5. [@TableId](https://blog.csdn.net/huarenguo/article/details/108226079?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522165734912216782395315767%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=165734912216782395315767&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~sobaiduend~default-1-108226079-null-null.142^v32^pc_rank_34,185^v2^control&utm_term=mybatis%20plus%20selectbyid%E4%BD%BF%E7%94%A8&spm=1018.2226.3001.4187)
   6. [uid 使用包装类](https://blog.csdn.net/lydms/article/details/118523445?ops_request_misc=&request_id=&biz_id=102&utm_term=This%20primary%20key%20of%20%22uid%22%20is%20p&utm_medium=distribute.pc_search_result.none-task-blog-2~all~sobaiduweb~default-0-118523445.142^v32^pc_rank_34,185^v2^control&spm=1018.2226.3001.4187)
   7. [@Autowired mapper报红](https://blog.csdn.net/hanhanhanxu/article/details/103530519)