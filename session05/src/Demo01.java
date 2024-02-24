public class Demo01 {
    public static void main(String[] args) {
        String fullName = "Trần Thị Hiên A";
        System.out.println(fullName.length());
        System.out.println(fullName.charAt(1));
        System.out.println(fullName.concat(" Xinh Gái"));
        System.out.println(fullName);
        System.out.println(fullName.toUpperCase());
        String msv = " B2001 ";
        // thì chỉ được 5 ký tự
        System.out.println(msv.trim().length());
        String address = "trần thị hiên";

       if(fullName.equalsIgnoreCase(address)){
           System.out.println("Băng nhau");
       } else {
           System.out.println("Ko bằng");
       }
        address = "Trần Thị Hiên";
        System.out.println(fullName.compareTo(address));
        fullName = "Nguyễn Văn Ánh";
        System.out.println(fullName.contains("Ánh"));

        String[] sv = {"cat","dog","pig","vk"};

        // tìm xem mảng sinh vien co dog hay ko
        boolean check = false;
        for (String item : sv) {
            if (item.equals("dog")) {
                check = true;
                break;
            }
        }

        if(check){
            System.out.println("Co con dog");
        } else{
            System.out.println("KO co dog");
        }

        fullName = "Nguyen Van A B2011";
        System.out.println(fullName.replace("Van","Quoc"));
        System.out.println(fullName.startsWith("Nguyen"));

        String nyc = "Huyền,Trang,Nhung,Hương";
        String[] arr = nyc.split(",");
        for (String item : arr) {
            System.out.println(item);
        }
    }
}
