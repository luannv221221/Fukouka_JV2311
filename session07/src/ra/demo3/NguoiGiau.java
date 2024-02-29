package ra.demo3;

public class NguoiGiau extends ConNguoi{
    private String nguoiYeu;

    public NguoiGiau(String hoTen, String nguoiYeu) {
        super(hoTen);
        this.nguoiYeu = nguoiYeu;
    }
    @Override
    public void an() {
        System.out.println("An cung "+nguoiYeu);
    }
}
