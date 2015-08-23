# NumberToArabicWords
converting Arabic numbers to words, e.g., 314 => ثلاثمائة و أربع عشرة.

```java
        ArabicTools arabicTools = new ArabicTools();

        arabicTools.isFeminine = true;
        System.out.println(arabicTools.numberToArabicWords("314")); 
        // ثلاثمائة و أربع عشرة 
        
        System.out.println(arabicTools.numberToArabicWords("9872677829654774585269"));
        /*
        تسعة سكستيليونات
        و ثمانمائة و اثنان و سبعون كوينتليوناً 
        و ستمائة و سبعة و سبعون كوادريليوناً 
        و ثمانمائة و تسعة و عشرون تريليوناً و ستمائة 
        و أربعة و خمسون ملياراً 
        و سبعمائة و أربعة و سبعون مليوناً و خمسمائة 
        و خمسة و ثمانون ألفاً و مئتان و تسع و ستون 
        */

```

the original implementation was in Qt, ported from https://github.com/01walid/ArabicNumberToWord and converted to Java code.
