package com.pmt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.pmt.exceptions.NotSupportNegativeException;
import com.pmt.utils.MyBigNumber;

class MyBigNumberTest {

  @Test
  void testN001() throws NumberFormatException, NotSupportNegativeException {
    MyBigNumber m = new MyBigNumber();
    assertEquals(m.sum("123", "123"), "246", "Successfully");
  }

  @Test
  void testN002() throws NumberFormatException, NotSupportNegativeException {
    MyBigNumber m = new MyBigNumber();
    assertEquals(m.sum("123456", "976544"), "1100000", "Successfully");
  }

  @Test
  void testN003() throws NumberFormatException, NotSupportNegativeException {
    MyBigNumber m = new MyBigNumber();
    assertEquals(m.sum("01", "999999999999999999999999999999999999999999999999999"),
        "1000000000000000000000000000000000000000000000000000", "Successfully");
  }
  
  @Test
  void testN004() throws NumberFormatException, NotSupportNegativeException {
    MyBigNumber m = new MyBigNumber();
    assertEquals(m.sum("", "5"),
        "5", "Successfully");
  }
  
  @Test
  void testN005() throws NumberFormatException, NotSupportNegativeException {
    MyBigNumber m = new MyBigNumber();
    assertEquals(m.sum("5", ""),
        "5", "Successfully");
  }

  @Test
  void testE001() throws NumberFormatException, NotSupportNegativeException {
    MyBigNumber m = new MyBigNumber();
    assertThrows(NotSupportNegativeException.class,()-> m.sum("-01", "999"));
  }


  @Test
  void testE002() throws NumberFormatException, NotSupportNegativeException {
    MyBigNumber m = new MyBigNumber();
    assertThrows(NotSupportNegativeException.class,()-> m.sum("01", "-999"));
  }

  @Test
  void testE003() throws NumberFormatException, NotSupportNegativeException {
    MyBigNumber m = new MyBigNumber();
    assertThrows(NotSupportNegativeException.class,()-> m.sum("-01", "-02"));
  }
  
  @Test
  void testE004() throws NumberFormatException, NotSupportNegativeException {
    MyBigNumber m = new MyBigNumber();
    assertThrows(NumberFormatException.class,()-> m.sum("01as", "-999"));
  }

  @Test
  void testE005() throws NumberFormatException, NotSupportNegativeException {
    MyBigNumber m = new MyBigNumber();
    assertThrows(NumberFormatException.class,()-> m.sum("-01", "-02sfgf"));
  }
  
  @Test
  void testE006() throws NumberFormatException, NotSupportNegativeException {
    MyBigNumber m = new MyBigNumber();
    assertThrows(NumberFormatException.class,()-> m.sum("01-", "-02sfgf"));
  }

  @Test
  void testE007() throws NumberFormatException, NotSupportNegativeException {
    MyBigNumber m = new MyBigNumber();
    assertThrows(NumberFormatException.class,()-> m.sum("01", "-02-"));
  }
  
  @Test
  void testE008() throws NumberFormatException, NotSupportNegativeException {
    MyBigNumber m = new MyBigNumber();
    assertThrows(NumberFormatException.class,()-> m.sum(null, null));
  }




}
