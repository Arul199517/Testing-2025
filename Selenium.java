====================================================================================================
x path
tagname[@attributename="attribute value"]
tagname[text()="text name"]
tagname[contains(@attributename or text(),'part of the attribute vale or part of the text')]

webelement ref= driver.findelement(By.id("username"));
webelement ref1=driver.findelement(By.name("arul"));
webelement ref2=driver.findelement(By.class("name"));
webelement ref3=driver.findelement(By.linktext("pass"));

webelement ref3=driver.findelement(By.xpath("//a[contains(text(), 'For')]");
webelement ref3=driver.findelement(By.xpath("//input[@value="name"]")/webelement ref3=driver.findelement(By.xpath("//a[text()="textname"]");

=======================================================

deiver. al= driver.switch to().alert().dismiss() or accept();
======

get the xpath from the screen or particulat webelement

Takescreenshot screenshot= (takescreenshot) driver();
takescreenshot source= screenshot. getscreenshotas(outputtype.file);
file distination= new file ("file path")
fileutils.copyfile(source, distination);

======
get the xpath for the headline of the drop down
select select= new select(hading of the dropdown);
list<webelement> ref = select.getoptions();
for(int i=0; i< select.size(); i++){
	select.get(i);
	}
select.selectbyvisubletext or select by value(7);
ref1. gettext();

======

after finding the xpath from the locator consider the ref name is "Java"

Javascriptexecutor executor= (Javascriptexecutor) driver();
executor.executorscript("arguments[0].setattribute('value','ram')",java);
executor.executorscript("return arguments[0].getattribute('value')",java);
scrollby(0.500);--this method is for slowly scroll up and down.

======

find the webelement of the iframe

driver(). switchto().frame(that refname)

then find the particular needed web element.
then .sendkeys() or click()

=======

set<string> windows= driver.switchto().windowhandles
list<string> list = new Arraylist<sting>(windows);
driver.switch to().window.(list.get(3));
or
for loop

=======

Find the table element
find the header (th)
find the allrows (tr) using the header ref name
find the (td) by using the allrows ref name

=======
waits

implicitly waits

it will handle the synchronynsation find elements and findelement

driver.manage().timeout().implicitlywait(time, timeunit.SECONDS)

explictly waits
it will synchronising the all methods including find elements and find element.

wait.untill (expected condition.visibilityof(element);

public static void foo(int num) { 
		System.out.println(num); 
	} 
long var = 105; 
		foo(var); 

 
public class Test {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
 
public static void foo(long num) { 
		System.out.println(num); 
	} 
int var = 105; 
		foo(var); 
 
tomorrow is my interview============================================
	===============================================================
	=================================================


	Selenium new branch check









