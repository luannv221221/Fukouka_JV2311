public class Demo02 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Nguyễn Văn A");
//        System.out.println(stringBuilder.append(" OK"));
        stringBuilder.insert(10," Quoc");
        System.out.println(stringBuilder);
        String fullName =  stringBuilder.toString();
        System.out.println(fullName.concat("KO"));
        System.out.println(stringBuilder.reverse());
        StringBuffer stringBuffer = new StringBuffer("Nguyen Văn C");
        System.out.println(stringBuffer);
    }
}
