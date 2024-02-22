public class Demo1 {
    public static void main(String[] args) {

        // 3 sinh vien 1 sv chua 3 dau diem

        double[] sv1 = {8,5,7};
        double[] sv2 = {9,9,9};
        double[] sv3 = {5,5,5};
        double[][] svs= {sv1,sv2,sv3};

        System.out.println(svs[0][0]);
        System.out.println(svs[0][1]);
        System.out.println(svs[0][2]);

        System.out.println(svs[1][0]);
        System.out.println(svs[1][1]);
        System.out.println(svs[1][2]);

        System.out.println(svs[2][0]);
        System.out.println(svs[2][1]);
        System.out.println(svs[2][2]);

        // in tất cả phần tử mảng 2 chiều
        for (int i = 0; i < svs.length; i++) {
            for (int j = 0; j < svs[i].length; j++) {
                System.out.println(svs[i][j]);
            }
        }
    }
}
