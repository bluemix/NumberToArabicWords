# NumbersToArabicWords
converting Arabic numbers to words, e.g., 314 => ثلاثمائة و أربع عشرة.

```java
        ArabicTools arabicTools = new ArabicTools();

        arabicTools.isFeminine = true;
        System.out.println(arabicTools.numberToArabicWords("314")); 
        // ثلاثمائة و أربع عشرة 
        
        System.out.println(arabicTools.numberToArabicWords("696464416455312089898469"));
        /*
        ثلاثمائة و أربع عشرة 
        ستمائة و ستة و تسعون سكستيليوناً و أربعمائة و أربعة و ستون كوينتليوناً و أربعمائة و ستة عشر كوادريليوناً و               أربعمائة و خمسة و خمسون تريليوناً و ثلاثمائة و اثنا عشر ملياراً و تسعة و ثمانون مليوناً و ثمانمائة و ثمانية و            تسعون ألفاً     و أربعمائة و تسع و ستون 
        */

```

the original implementation was in Qt, ported from https://github.com/01walid/ArabicNumberToWord and converted to Java code.
