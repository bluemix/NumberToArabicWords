package util.arabic;

import java.util.ArrayList;
import java.util.List;

public class Words {

    static final List<String> arabicOnes = new ArrayList<>();
    static final List<String> arabicFeminineOnes = new ArrayList<>();
    static final List<String> arabicTens = new ArrayList<>();
    static final List<String> arabicHundreds = new ArrayList<>();
    static final List<String> arabicTwos = new ArrayList<>();
    static final List<String> arabicAppendedTwos = new ArrayList<>();
    static final List<String> arabicGroup = new ArrayList<>();
    static final List<String> arabicAppendedGroup = new ArrayList<>();
    static final List<String> arabicPluralGroups = new ArrayList<>();

    static {
        /* Ones */
        arabicOnes.add("");
        arabicOnes.add("واحد");
        arabicOnes.add("اثنان");
        arabicOnes.add("ثلاثة");
        arabicOnes.add("أربعة");
        arabicOnes.add("خمسة");
        arabicOnes.add("ستة");
        arabicOnes.add("سبعة");
        arabicOnes.add("ثمانية");
        arabicOnes.add("تسعة");
        arabicOnes.add("عشرة");
        arabicOnes.add("أحد عشر");
        arabicOnes.add("اثنا عشر");
        arabicOnes.add("ثلاثة عشر");
        arabicOnes.add("أربعة عشر");
        arabicOnes.add("خمسة عشر");
        arabicOnes.add("ستة عشر");
        arabicOnes.add("سبعة عشر");
        arabicOnes.add("ثمانية عشر");
        arabicOnes.add("تسعة عشر");

        arabicFeminineOnes.add("");
        arabicFeminineOnes.add("إحدى");
        arabicFeminineOnes.add("اثنتان");
        arabicFeminineOnes.add("ثلاث");
        arabicFeminineOnes.add("أربع");
        arabicFeminineOnes.add("خمس");
        arabicFeminineOnes.add("ست");
        arabicFeminineOnes.add("سبع");
        arabicFeminineOnes.add("ثمان");
        arabicFeminineOnes.add("تسع");
        arabicFeminineOnes.add("عشر");
        arabicFeminineOnes.add("إحدى عشرة");
        arabicFeminineOnes.add("اثنتا عشرة");
        arabicFeminineOnes.add("ثلاث عشرة");
        arabicFeminineOnes.add("أربع عشرة");
        arabicFeminineOnes.add("خمس عشرة");
        arabicFeminineOnes.add("ست عشرة");
        arabicFeminineOnes.add("سبع عشرة");
        arabicFeminineOnes.add("ثماني عشرة");
        arabicFeminineOnes.add("تسع عشرة");
        /* Ones */

        /* Tens */
        arabicTens.add("عشرون");
        arabicTens.add("ثلاثون");
        arabicTens.add("أربعون");
        arabicTens.add("خمسون");
        arabicTens.add("ستون");
        arabicTens.add("سبعون");
        arabicTens.add("ثمانون");
        arabicTens.add("تسعون");
        /* Tens */

        /* Hundreds */
        arabicHundreds.add("");
        arabicHundreds.add("مائة");
        arabicHundreds.add("مئتان");
        arabicHundreds.add("ثلاثمائة");
        arabicHundreds.add("أربعمائة");
        arabicHundreds.add("خمسمائة");
        arabicHundreds.add("ستمائة");
        arabicHundreds.add("سبعمائة");
        arabicHundreds.add("ثمانمائة");
        arabicHundreds.add("تسعمائة");
        /* Hundreds */

        /* Twos */
        arabicTwos.add("مئتان");
        arabicTwos.add("ألفان");
        arabicTwos.add("مليونان");
        arabicTwos.add("ملياران");
        arabicTwos.add("تريليونان");
        arabicTwos.add("كوادريليونان");
        arabicTwos.add("كوينتليونان");
        arabicTwos.add("سكستيليونان");

        /* Appended */
        {
            arabicAppendedTwos.add("مئتا");
            arabicAppendedTwos.add("ألفا");
            arabicAppendedTwos.add("مليونا");
            arabicAppendedTwos.add("مليارا");
            arabicAppendedTwos.add("تريليونا");
            arabicAppendedTwos.add("كوادريليونا");
            arabicAppendedTwos.add("كوينتليونا");
            arabicAppendedTwos.add("سكستيليونا");
        }
        /* Appended */
        /* Twos */

        /* Group */
        arabicGroup.add("مائة");
        arabicGroup.add("ألف");
        arabicGroup.add("مليون");
        arabicGroup.add("مليار");
        arabicGroup.add("تريليون");
        arabicGroup.add("كوادريليون");
        arabicGroup.add("كوينتليون");
        arabicGroup.add("سكستيليون");
        /* Appended */
        {
            arabicAppendedGroup.add("");
            arabicAppendedGroup.add("ألفاً");
            arabicAppendedGroup.add("مليوناً");
            arabicAppendedGroup.add("ملياراً");
            arabicAppendedGroup.add("تريليوناً");
            arabicAppendedGroup.add("كوادريليوناً");
            arabicAppendedGroup.add("كوينتليوناً");
            arabicAppendedGroup.add("سكستيليوناً");
        }
        /* Appended */
        /* Group */

        /* Plural groups*/
        arabicPluralGroups.add("");
        arabicPluralGroups.add("آلاف");
        arabicPluralGroups.add("ملايين");
        arabicPluralGroups.add("مليارات");
        arabicPluralGroups.add("تريليونات");
        arabicPluralGroups.add("كوادريليونات");
        arabicPluralGroups.add("كوينتليونات");
        arabicPluralGroups.add("سكستيليونات");
        /* Plural groups*/
    }

}
