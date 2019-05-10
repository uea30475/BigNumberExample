package com.pmt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.pmt.validates.StringNumberValidate;

public class StringNumberValidateTest {

  @Test
  void testCheckNumberFormatN001() {
    assertEquals(StringNumberValidate.checkNumberFormat("123"), true, "Successfully");
  }

  @Test
  void testCheckNumberFormatN002() {
    assertEquals(StringNumberValidate.checkNumberFormat("-123"), true, "Successfully");
  }

  @Test
  void testCheckNumberFormatN003() {
    assertEquals(StringNumberValidate.checkNumberFormat("ghfg123"), false, "Successfully");
  }

  @Test
  void testCheckNumberFormatN004() {
    assertEquals(StringNumberValidate.checkNumberFormat("123.254"), false, "Successfully");
  }

  @Test
  void testCheckNumberFormatN005() {
    assertEquals(StringNumberValidate.checkNumberFormat(""), false, "Successfully");
  }

  @Test
  void testCheckNumberFormatN006() {
    assertEquals(StringNumberValidate.checkNumberFormat(null), false, "Successfully");
  }

  @Test
  void testCheckNumberFormatN007() {
    assertEquals(StringNumberValidate.checkNumberFormat("/.,';'][][=-0987"), false, "Successfully");
  }

  @Test
  void testCheckNegativeN001() {
    assertEquals(StringNumberValidate.checkNegative(null), false, "Successfully");
  }

  @Test
  void testCheckNegativeN002() {
    assertEquals(StringNumberValidate.checkNumberFormat(""), false, "Successfully");
  }

  @Test
  void testCheckNegativeN003() {
    assertEquals(StringNumberValidate.checkNumberFormat("-123"), true, "Successfully");
  }
  
  @Test
  void testCheckNegativeN004() {
    assertEquals(StringNumberValidate.checkNumberFormat("123-"), false, "Successfully");
  }
  
  @Test
  void testCheckNegativeN005() {
    assertEquals(StringNumberValidate.checkNumberFormat("123fg"), false, "Successfully");
  }
  
  @Test
  void testCheckNegativeN006() {
    assertEquals(StringNumberValidate.checkNumberFormat("-123.12"), false, "Successfully");
  }





}
