
//         /*<aside>
// 📔 **Текст задачи:**
// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
// Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом

// 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же. (Например, note - code)

// Пример 1:

// Input: s = "foo", t = "bar"

// Output: false

// Пример 2:

// Input: s = "paper", t = "title"
// p=t
// a=i
// e=l
// r=e
// Output: true

// </aside>*/
public class sem19 
{
    
}
static boolean task1(String str1, String str2)

{
        if(str1.length() != str2.length()) return false;
        Map<Character, Character> map = new HashMap<>();
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            if(map.containsKey(c1[i])){
                if(c2[i] != map.get(c1[i])) return false;
            } else {
                map.put(c1[i], c2[i]);
            }
        }
        return true;
    }