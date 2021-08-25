package com.thots.basics;

class TruncateURL {
  StringBuffer url;

  public TruncateURL(String url) {
    this.url = new StringBuffer(url);
  }

  public String truncateIfPresent(String ch) {
    int indexOfCharacter = url.lastIndexOf(ch);
    if (indexOfCharacter != -1) {
      return url.substring(0, indexOfCharacter);
    }
    return url.toString();
  }

  public char[] truncate(String string) {
    return null;
  }
}

public class RepeatMe {
  public static void main(String[] args) {
    System.out.println("hey there");

    repeatMe(5);
  }

  public static void repeatMe(int times) {
    if (times > 0) {
      System.out.println("I'm repeating myself.. currently at " + times + " time");
      repeatMe(times - 1);
    }
  }
}