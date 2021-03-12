# TDD 실습 String Calculator

### 문자열 계산기
- __empty string it will return 0__  
   “” = 0  
- __Single number string it will return number itself__  
  “1” = 1 , “3” = 3
- __Comma “,” is delimiters, Act as +__
  “1,2” = 3, “2,3” = 5, “1,2,3” = 6  
- __New line “\n” is new delimiters__  
  “1\n2” = 3, “2\n3” = 5, “1\n2\n3” = 6  
- __Mixed delimiter (, and \n)__  
  “1\n2,3” = 6, “1,2\n3” = 6  
- __Support custom delimiters__  
  “//;\n1;2”  == 3   “;” will be new delimiter  
- __Negative number : “negatives not allowed” exception__  
  “-1”  -> exception “negatives not allowed”  
- __multiple negatives : show all after exception__  
  “-1,-2,3”  ->  exception “negatives not allowed : -1,-2  
- __Numbers bigger than 1000 should be ignored__  
  “2,1000” = 2  
- __Long custom delimiter support__  
  “//[***]\n2***3”  = 5  
- __Allow multiple delimiters__  
  “//[*][%]\n1*2%3”  == 6  
- __Longer multiple delimiter__  
  “//[**][%%]\n1**2%%3”  == 6.  




