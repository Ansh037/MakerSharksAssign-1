import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String email;
    private String password;

 public User(String userName, String mail, String userPassword){
     username = userName;
     email = mail;
     password = userPassword;
 }

  public Long getId(){
    return id;
  }

  public void setId(Long ID){
    this.id=ID;
  }

  public String getUsername(){
    return username;
  }

  public void setUsername(String newUserName){
    this.username=newUserName;
  }

  public String getEmail(){
    return email;
  }

  public void setId(String userEmail){
    this.email=userEmail;
  }

  //no get method added for password method for privacy purpose
  public void setPassword(String userPassword){
    this.password=userPassword;
  }
  

    
}
