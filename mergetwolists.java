public class mergetwolists{
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        ListNode curNode = l1;
        while(curNode.next != null){
            curNode = curNode.next;
        }

        for(int i = 3; i <= 10; i++){
            curNode.next = new ListNode(i);
            curNode = curNode.next;
        }

        curNode = l1;
        while (curNode != null) {
            System.out.println(curNode.val);
            curNode = curNode.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode list3 = new ListNode();
        ListNode tail = list3;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
            }else{
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        if(list1 != null){
            tail.next = list1;
        }else if(list2 != null)
            tail.next = list2;

            return list3.next;
    }
}

    class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }