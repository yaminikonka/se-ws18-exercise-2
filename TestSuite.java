import TinyTestJ.Test;
import TinyTestJ.RunTests;

public class TestSuite {

  @Test public static void ImageTest1() {
    Image i = new Image(100,100);
    i.set(0,0,0x123456);
    assert (i.data[0] == (byte)0x12);
    assert (i.data[1] == (byte)0x34);
    assert (i.data[2] == (byte)0x56);
    assert (i.data[3] == (byte)0x00);
  }

  @Test public static void ImageTest2() {
    Image i = new Image(100,100);

  }

}
