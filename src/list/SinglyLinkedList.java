package list;

/**
 * 단일연결리스트
 * 속성
 *  - head
 *  - 개수
 *
 * 기능
 *  - 검색
 *  - 삽입
 *  - 삭제
 */
public class SinglyLinkedList {

    Node head;
    int size = 0;

    /**
     * 맨 앞에 노드 추가
     * @param data
     */
    public void addFirst(Object data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    /**
     * 맨 뒤에 노드 추가
     * @param data
     */
    public void addLast(Object data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        // 마지막 노드 찾기
        findPrevNode(size).next = node;
    }

    /**
     * 특정 위치에 노드 추가
     * @param index
     * @param data
     */
    public void add(int index, Object data){

    }

    /**
     * 툭정 위치 이전 노드 찾기
     * @param index
     * @return
     */
    private Node findPrevNode(int index){

        if (0 > index || size <= index) {
            throw new ArrayIndexOutOfBoundsException();
        }

        int nodeIndex = 0;
        Node pointer = head;

        while(nodeIndex != index){
            ++nodeIndex;
            pointer = pointer.next;
        }

        return pointer;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node pointer = head;
        stringBuilder.append("head").append(" -> ");
        while (null != pointer) {
            stringBuilder.append(pointer.data).append(" -> ");
            pointer = pointer.next;
        }
        stringBuilder.append("null");
        return stringBuilder.toString();
    }
}
