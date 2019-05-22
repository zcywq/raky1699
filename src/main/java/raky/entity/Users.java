package raky.entity;

import core.entity.CoreEntity;
import lombok.*;

@Data
public class Users extends CoreEntity {

    private Integer id;
    private String user_name;
    private String pass_word;

}
