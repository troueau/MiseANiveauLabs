import com.itextpdf.text.Document;
import org.junit.Assert;
import org.junit.Test;

public class FirstPdfTest {

    @Test
    public void test0() {
        Assert.assertTrue(true);
    }

    @Test
    public void test1(){
        Document doc = new Document();
        FirstPdf.addMetaData(doc);
    }
}