package com.pmt.utils;

import com.pmt.exceptions.NotSupportNegativeException;
import com.pmt.validates.StringNumberValidate;

/**
 * @author ThiPM
 *
 */
public class MyBigNumber {

  /**
   * Method add 2 big number
   * 
   * @param s1 string number one
   * @param s2 string number two
   * @return string result of digit(s1+s2)
   */
  public String sum(String s1, String s2)
      throws NumberFormatException, NotSupportNegativeException {
    String finalResult = "";

    s1=!"".equals(s1)? s1: "0";
    s2=!"".equals(s2)? s2: "0";
    // validate
    if (!StringNumberValidate.checkNumberFormat(s1)
        || !StringNumberValidate.checkNumberFormat(s2)) {
      throw new NumberFormatException("Only support number!!");
    }
    if (StringNumberValidate.checkNegative(s1) || StringNumberValidate.checkNegative(s2)) {
      throw new NotSupportNegativeException("Negative is not supported!!");
    }
    int len1 = s1.length();
    int len2 = s2.length();
    int maxLength = (len1 > len2) ? len1 : len2;
    int index1;
    int index2;
    char c;
    char d;
    int mem = 0;
    int t;

    for (int i = 0; i < maxLength; i++) {
      index1 = len1 - i - 1;
      index2 = len2 - i - 1;
      c = (index1 >= 0) ? s1.charAt(index1) : '0';
      d = (index2 >= 0) ? s2.charAt(index2) : '0';
      t = (c - '0') + (d - '0') + mem;
      finalResult = (t % 10) + finalResult;
      mem = t / 10;

    }
    if (mem > 0) {
      finalResult = mem + finalResult;
    }

    return finalResult;

  }

}
