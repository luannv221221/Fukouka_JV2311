public class Demo3 {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
//        System.out.println(buffer.append(" X"));
//        buffer.delete(0,1);
//        System.out.println(buffer);
        buffer.append("A");
        buffer.append("Nguuyen Van A");
        buffer.append("Nguyen Van A A A A");
        System.out.println("Trả về dung lượng bộ nhớ đệm "+buffer.capacity());
    }
}
