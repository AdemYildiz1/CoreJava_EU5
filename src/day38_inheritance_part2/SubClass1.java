package day38_inheritance_part2;

public class SubClass1 extends SuperClass1{
	
	public SubClass1() {
		
		System.out.println("This is the subclass constructor");
	}
	
}

    //RULE-1 if there are constructors in your parent and child classes,
	//Always, constructors in parent class are first executed/invoked before constructor in child class.

	//RULE-2,If you explicitly want to call any constructor that belongs to parent class by yourself,
	//you need to use "super();" key word in child class.
    //!!!**BUT if there is cons with argument you HAVE TO call it with super(); keyword. otherwise gives error

    //RULE-3,If you do NOT explicitly call(means if you DO NOT use super keyword) in child class for no arg cons in parent 
    //java will automatically integrate one "super();" key word to call the NO ARGUMENT/DEFAULT CONSTRUCTOR from parent class.
    //Basically if no cons in parent java calls default by itself in child class

/*ACIKCASI,
 Eger parent class ta NO ARGUMENT cons varsa java direct onu child class ta cagiriyor. 
 child class ta default cons yapip kendi cagiriyor.
 Yani cagirirken biz gormesekte arka planda kendi herzaman child class'a default cons ve icinede "super();" key word u koyuyor.
 bu durumda biz kendimizde keywordu koysak problem olmaz.
 
 -bazende parent classta hem no argument hem argumentli varsa, sadece no argumen cagirmamiz/yada kendi default yapmasi yetiyor 
 argumentliyi cagirmak zorunlu degil.
 -Ama argumentli constructor u cagirmak istersek cagirirken MUHAKKAK "super();" key word koymaliyiz.
 
 -parent clasta sadece argumentli cons varsa muhakkak onu child class da cagirmaliyiz
 
 BU DURUMDA CONSTRUCTOR INHERIT OLMUYOR, KEY WORD KULLANARAK CAGIRIYORUZ.
 
 */


	

