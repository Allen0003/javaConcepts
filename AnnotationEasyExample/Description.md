Annotation can tell JVM some information in advance 

1. 
Annotation 對程式運行沒有影響，
它的目的在對編譯器或分析工具說明程式的某些資訊，

such as @Override

2. 
標示的方法是一個不建議被使用的方法，如果有開發人員不小心使用了被 
@Deprecated 標示的方法，編譯器要提出警訊提醒開發人員。

such as 

一些被劃掉的code and still can work very well 

3. 
自訂 Annotation 型態

當您使用 @interface 自行定義 Annotation 型態時，
實際上是**自動繼承**了 java.lang.annotation.Annotation 介面，

i.public @interface BackstageLogAction {

ii.
public @interface UnitTest {
	String value();
}

實際上您定義了 value() 方法，編譯器在編譯時會自動幫您產生一個 
value 的資料成員，接著在使用 UnitTest Annotation 時要指定值，例如：

public class MathTool {
    @UnitTest("GCD")
    public static int gcdOf(int num1, int num2) {
		// ....
    }
}
@UnitTest("GCD") 實際上是 @UnitTest(value="GCD) 

記得使用 import 告訴編譯器型態的套件位置，例如：

import onlyfun.caterpillar.Debug;

再來要取得value 跟之前的筆記和在一起就好