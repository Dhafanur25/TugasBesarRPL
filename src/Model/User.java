package Model;

public class User {
    private int ID;
    private String Nama_Lengkap;
    private String Email;
    private String Username;
    private String Password;
    private String No_Telp;
    private String Alamat;
    private String Bio;
    private String Profile_Pic_Path;
    private static User instance;


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNama_Lengkap() {
        return Nama_Lengkap;
    }

    public void setNama_Lengkap(String Nama_Lengkap) {
        this.Nama_Lengkap = Nama_Lengkap;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getNo_Telp() {
        return No_Telp;
    }

    public void setNo_Telp(String No_Telp) {
        this.No_Telp = No_Telp;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getBio() {
        return Bio;
    }

    public void setBio(String Bio) {
        this.Bio = Bio;
    }

    public String getProfile_Pic_Path() {
        return Profile_Pic_Path;
    }

    public void setProfile_Pic_Path(String Profile_Pic_Path) {
        this.Profile_Pic_Path = Profile_Pic_Path;
    }
    public static User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }
    
}
