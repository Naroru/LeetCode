package Task_234;
// 234. Palindrome Linked List
// линкид лист преобразовать в строку \ массив и смотреть, является ли строка\массив палиндромом

//альтернатива
//через быстрый и медленный указатель добраться до середины списка ( быстрый указатель станет нулл, а медленный - серединой)
//инвертировать вторую половину спика
//сранивать

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

    }


    public static boolean isPalindrome(ListNode head) {

        List<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int i = 0;
        int j = list.size() - 1;

        while (i <= j) {
            if(list.get(i) == list.get(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
