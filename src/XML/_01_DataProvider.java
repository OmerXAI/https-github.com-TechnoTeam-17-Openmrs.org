package XML;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_DataProvider {

        @Test(dataProvider = "datalarim")
        public void searchTest (String aranacakText) {
            System.out.println("aranacakText = " + aranacakText);
        }

        @DataProvider
        Object[] datalarim(){
            Object[] aranacaklar={"mac","samsung","laptop"};

            return aranacaklar;
        }

        /***************************************************/

        @Test(dataProvider = "datalar")  // dataProvidera verilen isimle de çağırabilirsiniz.
        public void test2(int veri){
            System.out.println("veri = " + veri);
        }

        @DataProvider(name="datalar") // kendin istersne bir isim verebilirsin.
        Object[] getData(){
            Object[] data={1,2,3,4,5,6};
            return data;
        }


}
