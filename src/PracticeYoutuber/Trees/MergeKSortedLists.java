package PracticeYoutuber.Trees;

import java.util.PriorityQueue;

/**
 * T: O(n log k)
 * S: O(nk)
 */
public class MergeKSortedLists {

    public class ListNode {
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

    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            for (ListNode list : lists) {
                while (list != null) {
                    minHeap.add(list.val);
                    list = list.next;
                }
            }

            ListNode head = new ListNode(-1);
            ListNode returnHead = head;

            while (!minHeap.isEmpty()) {
                head.next = new ListNode(minHeap.remove());
                head = head.next;
            }
            return returnHead.next;
        }
    }
}
