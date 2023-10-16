package ddd.demo;

/**
 * @program: YushuFlinkRuleEngine
 * @description: YushuDemo
 * @author: Zmm
 * @create: 2023-10-15 21:33
 **/
/* **********************
 * 一、
 * User 传统的pojo对象（数据传输的载体）
 * 1、对象的属性 name、age
 * 2、属性的 get set 方法
 *
 * ddd 领域驱动设计模型（model）
 * 1、pojo 对象的属性
 * 2、get set 方法
 * 3、pojo对象的具体的业务逻辑
 *
 * ddd 领域驱动设计模型（model） 同样也是数据传输的载体，也是处理具体的业务逻辑
 *
 * 二、
 * pojo对象
 * 统称：
 * 1、VO对象 视图数据对象
 * 2、DTO对象 数据传输对象 服务之间数据传输的一个载体
 * 3、PO对象 数据持久化对象 这个就是跟数据库打交道的
 *
 * 三、
 * 微服务概念  ：
 * 传统是多个服务公用一个数据库
 * 微服务每个服务有自己的数据库
 * 微服务质检是通过暴露出来的api（rpc）进行数据交换
 *
 *
 * 事件驱动架构（使用事件实现多个服务间的业务逻辑）
 * 某个服务会发布事件，其他的服务就会去订阅这个时间
 * 当某一个微服务接收到某个时间，（更新）就可以更新 业务逻辑，同时发布一个时间，触发下一步更新操作
 *
 * 四、
 * 领域驱动模型 （Model）种类划分：
 * 1、entity 实体：内部值是变化的，具有状态对象的 （开始支付   付款中  支付完成  ） 订单  下单  过程  完成 订单开始，结束 连续变化的状态
 * 2、value project 值对象：内部值是不变的，没有状态对象的。1000  持久化对象？就是和数据库打交道的
 * 3、Service 对象：entity 和 value project 对象模棱两可的时候，就可以放在Service里面
 *
 *  flink 里面所有数据模型 都会按照领域驱动模型的设计思想 去构建
 *  springboot的三层架构去设计
 *
 * *********************/

public class User {

    private LoginAction loginAction;

    private SaleAction saleAction;

    private String  name ;
    private int age ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
