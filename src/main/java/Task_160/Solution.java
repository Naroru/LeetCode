package Task_160;
// 160. Intersection of Two Linked Lists
// идем по самому длинному списку так, чтобы его длина стала равна короткому списку (т.к.  напрмиер если длинный список 100 элементов, а короткий 5
//то они могут пересечься минимум на 95 элементе первого списка

//затем просто проходим по оставшимся элементам двух списков и сравниваем их

public class Solution {

    public static void main(String[] args) {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int aSize = 0;
        int bSize = 0;
        ListNode a = headA;
        ListNode b = headB;

        while (a != null) {
            a = a.next;
            aSize++;
        }

        while (b != null) {
            b = b.next;
            bSize++;
        }

        if(aSize > bSize) {
            while (aSize > bSize) {
                headA = headA.next;
                aSize--;
            }
        } else {
            while (bSize > aSize) {
                headB = headB.next;
                bSize--;
            }
        }

        while (headA != null) {
            if(headA == headB) return headA;
            else {
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
