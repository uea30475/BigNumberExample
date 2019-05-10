package com.pmt.validates;

/**
 * @author ThiPM
 *
 */
public class StringNumberValidate {
  private static final String REGEX = "^[-]{0,1}[0-9]*$";

  /**
   * Method check number format;
   * 
   * @param s input string
   * @return true if strings is big number, otherwise false.
    */
  public static boolean checkNumberFormat(String s) {
    if (s == null || s.isEmpty()) {
      return false;
    }
    return s.matches(REGEX);
  }

  /**
   * Method check negative number;
   * 
   * @param s input string
   * @return true if strings is negative, otherwise false.
   */
  public static boolean checkNegative(String s) {

    if (checkNumberFormat(s) && s.charAt(0) == '-') {
      return true;
    }
    return false;
  }


}
