//luôn luôn viết thường
package session2;
//Luôn viết hoa kí tự đầu tiên
public class Student {
    //Field:Trường:Property:Thuộc tính: Attribute
    //Định nghĩa lên đối tượng
    //chưÁ giá trị
    //Thường là private:Để đảm bảo an toàn dữ liệu
    //giá trj gán(Write) thì sử dụng Setter
    //Giá trị đọc(Read) thì sử dugnj Setter
    private String name;
    private Integer bornYear;

    private String placeOfBirth;

    //Constructor: Hàm khởi tạo
    //Sử dụng để tạo ra Đối tượng có các đặc tính ban đầu
    //Có thể có dối số or ko
    //Tên Trùng với tên của class và ko có dữ liệu trả về

    public Student(String name, Integer bornYear, String placeOfBirth) {
        this.name = name;
        this.bornYear = bornYear;
        this.placeOfBirth = placeOfBirth;
    }
}


