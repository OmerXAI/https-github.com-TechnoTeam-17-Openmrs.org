import Utility.BaseDriver;
import Utility.MyFunc;
import Utility.mrs_elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class us_08_hastaListeleme extends BaseDriver {


    @Test
    void US8() {
        mrs_elements elemans= new mrs_elements();

        elemans.findPatientRecord.click();

        System.out.println(elemans.showingEntries.getText());
        String[] n = elemans.showingEntries.getText().trim().split(" ");
        System.out.println(n.length);
        int kayitOlanlar = Integer.parseInt(n[5]);
        System.out.println("kayitOlanlar = " + kayitOlanlar);

        int rows = 0;
        int pageNumberss = elemans.pageNumbers.size();
        for (int i = pageNumberss - 1; i >= 0; i--) {
            elemans.pageNumbers.get(i).click();
            for (WebElement pageRows : elemans.Pagerows) {
                rows++;
            }
        }
        MyFunc.Bekle(4);
        driver.quit();
    }



}
