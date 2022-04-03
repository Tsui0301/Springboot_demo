package startDemo.pojo;
import java.sql.*;
import lombok.Data;

   /**
    * @文件名称：Member.java
    * @创建时间：2022-04-03 22:00:49
    * @创  建  人：大昭 
    * @文件描述：member 实体类
    * @文件版本：V0.01 
    */ 


@Data
public class Member{
	private Integer id;
	private String name;
	private String profile;
	private String author;
	private Date time;
	private String logoimg;
	private String position;
}

