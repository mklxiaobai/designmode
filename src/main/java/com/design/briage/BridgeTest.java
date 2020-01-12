package com.design.briage;

/**
 * @author 马锴梁
 * @version 1.0
 * @date 2020/1/11 12:52
 */
public class BridgeTest {
    public static void main(String[] args)
    {
        Implementor imple=new ConcreteImplementorA();
        Abstraction abs=new RefinedAbstraction(imple);
        abs.Operation();
    }
}
interface Implementor
{
    public void OperationImpl();
}
//具体实现化角色
class ConcreteImplementorA implements Implementor
{
    public void OperationImpl()
    {
        System.out.println("具体实现化(Concrete Implementor)角色被访问" );
    }
}
//抽象化角色
abstract class Abstraction
{
    protected Implementor imple;
    protected Abstraction(Implementor imple)
    {
        this.imple=imple;
    }
    public abstract void Operation();
}
//扩展抽象化角色
class RefinedAbstraction extends Abstraction
{
    protected RefinedAbstraction(Implementor imple)
    {
        super(imple);
    }
    public void Operation()
    {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问" );
        imple.OperationImpl();
    }
}
